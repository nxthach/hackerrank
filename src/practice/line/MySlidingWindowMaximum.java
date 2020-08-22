package practice.line;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MySlidingWindowMaximum {


    public static void main(String[] args) throws java.lang.Exception {
        Scanner scn = new Scanner(System.in);
        int window = scn.nextInt();

        List<Integer> integers = new ArrayList<>();
        while (scn.hasNextLine()){
            integers.add(scn.nextInt());
        }

        // list int to array int
        int[] arr = new int[integers.size()];

        for (int i = 0; i < integers.size(); i++) {
            arr[i] = integers.get(i);
        }

        printKMax(arr, window);
    }

//    public static void main(String args[])
//    {
//        int arr[] = {1,2,-1,3};
//        int k = 2;
//        printKMax(arr, k);
//    }

    static void printKMax(int arr[], int k)
    {
        int j, max;

        for (int i = 0; i <= arr.length - k; i++) {

            max = arr[i];

            for (j = 1; j < k; j++) {
                if (arr[i + j] > max)
                    max = arr[i + j];
            }
            System.out.print(max + " ");
        }
    }
}
