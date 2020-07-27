package practice;

import java.util.List;

public class Birthday {


    public static void main(String[] args) {
        int[] squares = new int[5];
        squares[0] = 1;
        squares[1] = 2;
        squares[2] = 1;
        squares[3] = 3;
        squares[4] = 2;
        System.out.println(getWays(squares, 3, 2));
    }

    static int getWays(int[] squares, int d, int m){
        int ways = 0;
        int sum = 0;
        //Find if there is a way to break the chocolate at all
        if(m <= squares.length)
            for(int i = 0; i < m; i++)
                sum += squares[i];
        if(sum == d) ways++;
        ///////////////////////////////////////////////////////

        //Check other possible ways to break it by using a sliding window
        for(int i = 0; i < squares.length-m; i++)
        {
            sum = sum - squares[i] + squares[i+m];
            if(sum == d) ways++;
        }
        return ways;
    }

    static int birthday(List<Integer> s, int d, int m) {
        int numberOfWaysCanDivide =0;

        for (int i = 0; i < s.size(); i++) {

            int daysForTest = 0;
            for (int j = i; j < i + m && i + m <= s.size(); j++) {
                daysForTest += s.get(j);
            }

            if(daysForTest == d){
                numberOfWaysCanDivide++;
            }
        }
        
        return numberOfWaysCanDivide;
    }
}

