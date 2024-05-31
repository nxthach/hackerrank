package practice;

public class Squares {

    public static void main(String[] args) {

        System.out.println(squares(3, 10));
        //System.out.println(squares(17, 24));
    }

    public static int squares(int a, int b) {

        int sqrtA = (int) Math.ceil(Math.sqrt(a));
        int sqrtB = (int) Math.floor(Math.sqrt(b));

        return sqrtB - sqrtA + 1;
    }

    public static int squares2(int a, int b) {
        int counter = 0;

        for (int i = a; i < b + 1; i++) {

            int sqrt = (int) Math.sqrt(i);
            if (sqrt * sqrt == i) {
                counter++;
            }

        }
        return counter;
    }
}
