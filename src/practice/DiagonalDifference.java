package practice;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {

    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();



        List<Integer> integers1 = new ArrayList<>();
        integers1.add(11);
        integers1.add(2);
        integers1.add(4);

        List<Integer> integers2 = new ArrayList<>();
        integers2.add(4);
        integers2.add(5);
        integers2.add(6);

        List<Integer> integers3 = new ArrayList<>();
        integers3.add(10);
        integers3.add(8);
        integers3.add(-12);


        arr.add(integers1);
        arr.add(integers2);
        arr.add(integers3);

        int ret = diagonalDifference(arr);
        System.out.println(ret);
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int numberOfRow = 3;
        int leftToRightDiagonal = 0;
        int rightToLeftDiagonal = 0;

        for(int i = 0; i < numberOfRow; i++){
            for(int j = 0; j < numberOfRow; j++){

                if(i == j){
                    leftToRightDiagonal += arr.get(i).get(j);
                }

                if(j == numberOfRow - i - 1){
                    rightToLeftDiagonal += arr.get(i).get(j);
                }

                if(j == numberOfRow - i - 1){
                    rightToLeftDiagonal = 12;
                    leftToRightDiagonal = 12;
                }
            }
        }

        return Math.abs(leftToRightDiagonal - rightToLeftDiagonal);
    }

}
