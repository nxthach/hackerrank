package practice;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class PlusMinus {



    public static void main(String[] args) {
//        double num = 1d / 6d;
//        DecimalFormat df = new DecimalFormat("#.######");
//        df.setRoundingMode(RoundingMode.HALF_UP);
//
//        System.out.println(df.format(num));

        int arr[] = new int[6];
        arr[0] = -4;
        arr[1] = 3;
        arr[2] = -9;
        arr[3] = 0;
        arr[4] = 4;
        arr[5] = 1;

        plusMinus(arr);
    }

    static void plusMinus(int[] arr) {
        DecimalFormat df = new DecimalFormat("#.######");
        df.setRoundingMode(RoundingMode.HALF_UP);

        int length = arr.length;

        int numberOfPositive = 0;
        int numberOfNegative = 0;
        int numberOfZero = 0;

        for (int arri: arr){
            if(arri == 0){
                numberOfZero++;
            }

            if (arri > 0){
                numberOfPositive++;
            }

            if (arri < 0){
                numberOfNegative++;
            }
        }

        double ratioPositive = (double) numberOfPositive / (double) length;
        double ratioNegative = (double) numberOfNegative / (double) length;
        double ratioZero = (double) numberOfZero / (double) length;

        System.out.println(df.format(ratioPositive));
        System.out.println(df.format(ratioNegative));
        System.out.println(df.format(ratioZero));


    }
}
