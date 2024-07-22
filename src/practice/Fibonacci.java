package practice;

public class Fibonacci {
    public static int fib(int n) {
        if (n <= 1) return n;
        else return fib(n - 1) + fib(n - 2);
    }

    public static int fib2(int n) {
        var a = 0;
        var b = 1;

        for (int i = 1; i < 6; i++) {

            var temp = a;
            a = b;
            b = temp + b;
        }
        return b;
    }

    public static void main(String[] args) {

        System.out.println(fib2(6));

    }
}
