package practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Sudoku {

    private static boolean checkNumberOfHoles(int holes) {
        if (holes%9 == 0) {
            return true;
        }

        return false;
    }

    private static String checkOutputName(String outputName) {
        if (outputName != null && outputName.indexOf(".txt") == -1) {
            return outputName + ".txt";
        }

        return outputName;
    }

    private void createOutputFile(String outputName, int inputNumber) {
        int numberOfHidden = inputNumber / 9;
        String pathFile = "E:\\" + outputName;
        int[][] solution = generateSolution(new int[9][9], 0);
        int[][] game = ganerateGame2(copy(solution), numberOfHidden);
        printToConsole(solution, game);
        writeGameToFile(pathFile, game);

        System.out.print("Xem nội dung file " + outputName + " theo đường dẫn sau: " + pathFile);
    }

    private void writeGameToFile(String filename, int[][] game) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename));

            for (int i = 0; i < game.length; i++) {
                for (int j = 0; j < game[i].length; j++) {
                    if (j != game[j].length - 1) {
                        bw.write(game[i][j] + ",   ");
                    } else {
                        bw.write(game[i][j] + "\n");
                    }
                }
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {}
    }

    private void printToConsole(int[][] solution, int[][] game) {
        System.out.println("Sudoku Solution: ");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(solution[i][j] + "\t");
            }
            // sau khi viết xong 1 dòng thi xuống hàng
            System.out.println("\n");
        }

        System.out.println("Sudoku Game: ");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(game[i][j] + "\t");
            }
            // sau khi viết xong 1 dòng thi xuống hàng
            System.out.println("\n");
        }
    }

    private int[][] generateSolution(int[][] game, int index) {
        if (index > 80)
            return game;

        int x = index % 9;
        int y = index / 9;

        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i <= 9; i++) numbers.add(i);
        Collections.shuffle(numbers);

        while (numbers.size() > 0) {
            int number = getNextPossibleNumber(game, x, y, numbers);
            if (number == -1)
                return null;

            game[y][x] = number;
            int[][] tmpGame = generateSolution(game, index + 1);
            if (tmpGame != null)
                return tmpGame;
            game[y][x] = -1;
        }

        return null;
    }

    private int getNextPossibleNumber(int[][] game, int x, int y, List<Integer> numbers) {
        while (numbers.size() > 0) {
            int number = numbers.remove(0);
            if (isPossibleX(game, y, number) && isPossibleY(game, x, number) && isPossibleBlockForSolution(game, x, y, number))
                return number;
        }
        return -1;
    }

    private boolean isPossibleX(int[][] game, int y, int number) {
        for (int x = 0; x < 9; x++) {
            if (game[y][x] == number)
                return false;
        }
        return true;
    }

    private boolean isPossibleY(int[][] game, int x, int number) {
        for (int y = 0; y < 9; y++) {
            if (game[y][x] == number)
                return false;
        }
        return true;
    }

    private int[][] ganerateGame2(int[][] game, int soLoDuocDucTungO) {
        int result[][] = game;

        for (int x = 0; x < 3; x++ ) {
            for (int y = 0; y < 3; y++) {

                List<Integer> danhSachSoDuocDuc = layDanhSachSoDuocDuc(soLoDuocDucTungO);
                //
                System.out.println("So phai duo = " + danhSachSoDuocDuc);
                for (int i = x*3; i< (x+1)*3; i++ ) {
                    for (int j = y*3; j < (y+1)*3; j++) {
                        System.out.println("i = " + i +"; j = " + j + ",,,, val = " + result[i][j]);
                        if(danhSachSoDuocDuc.contains(result[i][j])){
                            result[i][j]=0;
                        }
                    }
                }
                System.out.println("-----------------------------------");
            }
        }


        return result;
    }

    List<Integer> layDanhSachSoDuocDuc(int soLoDuocDucTungO){
        List<Integer> danhSachSoDuocDuc = new ArrayList<>();

        int count = 0;
        while (count< soLoDuocDucTungO){
            int soDuocDuc = new Random().nextInt(9) + 1;
            if(!danhSachSoDuocDuc.contains(soDuocDuc)){
                danhSachSoDuocDuc.add(soDuocDuc);
                count++;
            }
        }

        return danhSachSoDuocDuc;
    }



    private int[][] ganerateGame(int[][] game, int inputNumber) {
        for (int i = 0; i < 9; i++ ) {
            for (int j = 0; j < 9; j++) {
                game = ganerateGame(game, i, j, inputNumber);
            }
        }

        return game;
    }

    private int[][] ganerateGame(int[][] game, int x, int y, int inputNumber) {
        int flag = 0;
        int x1 = x < 3 ? 0 : x < 6 ? 3 : 6;
        int y1 = y < 3 ? 0 : y < 6 ? 3 : 6;
        List<Integer> listXX = new ArrayList<Integer>();
        List<Integer> listYY = new ArrayList<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        for (int yy = y1; yy < y1 + 3; yy++) {
            for (int xx = x1; xx < x1 + 3; xx++) {
                if (game[yy][xx] != 0) {
                    listXX.add(xx);
                    listYY.add(yy);
                    list.add(game[yy][xx]);
                }
                game[yy][xx] = 0;
                flag += 1;
                if (flag == inputNumber)
                    return game;
            }
        }

//        for (int i = 1; i <= inputNumber; i++) {
//        	if (!listYY.isEmpty()) {
//        		int number = getRandom(listYY.size());
//        		game[listYY.get(number)][listXX.get(number)] = 0;
//        	}
//        }

        return game;
    }

    public int getRandom(int max){ return (int) (Math.random()*max); }

    private boolean isPossibleBlockForSolution(int[][] game, int x, int y, int number) {
        int x1 = x < 3 ? 0 : x < 6 ? 3 : 6;
        int y1 = y < 3 ? 0 : y < 6 ? 3 : 6;
        for (int yy = y1; yy < y1 + 3; yy++) {
            for (int xx = x1; xx < x1 + 3; xx++) {
                if (game[yy][xx] == number)
                    return false;
            }
        }
        return true;
    }

    private int[][] copy(int[][] game) {
        int[][] copy = new int[9][9];
        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 9; x++)
                copy[y][x] = game[y][x];
        }
        return copy;
    }

    private static void printGame(int[][] solution) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(solution[i][j] + "\t");
            }
            // sau khi viết xong 1 dòng thi xuống hàng
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        Sudoku sudokuSolution = new Sudoku();

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Số Lượng Holes: ");
        int sumberOfHoles = sc.nextInt();

        boolean exit = true;
        while (exit) {
            if (Sudoku.checkNumberOfHoles(sumberOfHoles)) {
                System.out.print("Nhập tên file output: ");
                String outputName = sc.next();
                sudokuSolution.createOutputFile(Sudoku.checkOutputName(outputName), sumberOfHoles);
                exit = false;
            } else {
                System.out.print("Số nhập vào phải là bội số của 9 ==> vui lòng nhập lại: ");
                sumberOfHoles = sc.nextInt();
            }
        }
    }
}
