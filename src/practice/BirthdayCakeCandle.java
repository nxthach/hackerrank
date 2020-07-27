package practice;

public class BirthdayCakeCandle {


    public static void main(String[] args) {
        int ar[] = new int[5];
        ar[0] = 5;
        ar[1] = 4;
        ar[2] = 3;
        ar[3] = 2;
        ar[4] = 1;

        System.out.println(birthdayCakeCandles(ar));
    }


    static int birthdayCakeCandles(int[] ar) {
        int tallestCandles = 0;

        int max = 0;

        for (int i = 0; i < ar.length; i++) {
            if(ar[i] > max){
                max = ar[i];
            }
        }

        for (int i = 0; i < ar.length; i++) {
            if(ar[i] == max){
                tallestCandles++;
            }
        }

        return tallestCandles;
    }
}
