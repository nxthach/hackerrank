package practice;

import java.util.Arrays;

public class ClimbingLeaderboard {

    public static void main(String[] args) {

        int [] scores = new int[5];
        scores[0] = 100;
        scores[1] = 90;
        scores[2] = 90;
        scores[3] = 80;
        scores[4] = 70;

        int [] alice = new int[4];
        alice[0] = 5;
        alice[1] = 75;
        alice[2] = 95;
        alice[3] = 120;


        int result[] = climbingLeaderboard(scores, alice);
        System.out.println(Arrays.toString(result));

    }

    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int n = scores.length;
        int m = alice.length;

        int res[] = new int[m];
        int[] rank = new int[n];

        rank[0] = 1;

        for (int i = 1; i < n; i++) {
            if (scores[i] == scores[i - 1]) {
                rank[i] = rank[i - 1];
            } else {
                rank[i] = rank[i - 1] + 1;
            }
        }

        for (int i = 0; i < m; i++) {
            int aliceScore = alice[i];
            if (aliceScore > scores[0]) {
                res[i] = 1;
            } else if (aliceScore < scores[n - 1]) {
                res[i] = rank[n - 1] + 1;
            } else {
                int index = binarySearch(scores, aliceScore);
                res[i] = rank[index];

            }
        }
        return res;

    }

    public static int binarySearch(int[] scores, int a) {
        int left = 0;
        int right = scores.length - 1;

        while (left <= right) {
            int m = (left + right) / 2;
            if (scores[m] == a) {
                return m;
            } else if (scores[m] < a) {
                right = m - 1;
            } else {
                left = m + 1;
            }
        }

        return left;
    }

    private static int binarySearch2(int[] a, int key) {

        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key && key < a[mid - 1]) {
                return mid;
            } else if (a[mid] > key && key >= a[mid + 1]) {
                return mid + 1;
            } else if (a[mid] < key) {
                hi = mid - 1;
            } else if (a[mid] > key) {
                lo = mid + 1;
            }
        }
        return -1;
    }
}

