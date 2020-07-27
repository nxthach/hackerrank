package practice;

public class MiniMaxSum {

    public static void main(String[] args) {

        int arr[] = new int[5];
        arr[0] = 396285104;
        arr[1] = 573261094;
        arr[2] = 759641832;
        arr[3] = 819230764;
        arr[4] = 364801279;

        miniMaxSum(arr);
    }

    static void miniMaxSum(int[] arr) {
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            long sum = 0;
            for (int j=0; j < arr.length; j++){
                if(i != j){
                    sum += arr[j];
                }
            }

            if(min > sum){
                min = sum;
            }

            if(sum > max){
                max = sum;
            }
        }

        System.out.print(min);
        System.out.print(" ");
        System.out.print(max);
    }
}
