package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NonDivisibleSubset {

    public static void main(String[] args) {
//        System.out.println(nonDivisibleSubset(3, new ArrayList<>(Arrays.asList(1, 7, 2, 4))));
//
        System.out.println("--------------------");

        nonDivisibleSubset(4, new ArrayList<>(Arrays.asList(19, 10, 12, 24, 25, 22)));
    }


    public static int nonDivisibleSubset(int k, List<Integer> s) {

        // Array for storing frequency of modulo
        // values
        int f[] = new int[k];
        Arrays.fill(f, 0);

        // Fill frequency array with values modulo K
        for (int i = 0; i < s.size(); i++)
            f[s.get(i) % k]++;

        // if K is even, then update f[K/2]
        if (k % 2 == 0)
            f[k/2] = Math.min(f[k/2], 1);

        // Initialize result by minimum of 1 or
        // count of numbers giving remainder 0
        int res = Math.min(f[0], 1);

        // Choose maximum of count of numbers
        // giving remainder i or K-i
        for (int i = 1; i <= k/2; i++)
            res += Math.max(f[i], f[k-i]);

        return res;

    }
}
