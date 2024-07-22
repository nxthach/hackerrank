package practice;

public class ClimbingStairs {

    public static int climbStairs(int n) {
        var one = 1;
        var two = 1;

        for (int i = 0; i < n - 1; i++) {
            var temp = one;
            one = one + two;
            two = temp;

        }
        return one;

    }

    public static int climbStairs2(int n) {
        var a = 1;
        var b = 1;

        for (int i = 0; i < n - 1; i++) {
            var temp = a;
            a = b;
            b = temp + b;

        }
        return b;

    }

    public static void main(String[] args) {
        int n = 5;
        int result = climbStairs2(n);
        System.out.println("The number of ways to climb " + n + " stairs is: " + result);
    }
}
