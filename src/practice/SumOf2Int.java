package practice;

public class SumOf2Int {

    public static void main(String[] args) {
        //System.out.println(7 >> 1);
        System.out.println(new SumOf2Int().getSum(16, 17));
    }
    public int getSum(int a, int b) {

        while(b != 0){
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

}
