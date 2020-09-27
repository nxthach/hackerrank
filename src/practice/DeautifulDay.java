package practice;

public class DeautifulDay {

    public static void main(String[] args) {
        System.out.println(beautifulDays(13, 45, 3));
    }

    static int beautifulDays(int i, int j, int k) {
        int beautifulDays = 0;

        for (int l = i; l < j+1; l++) {
            int diff = Math.abs(l - reverse(l));
            if (diff % k == 0){
                beautifulDays++;
            }
        }

        return beautifulDays;

    }

    static int reverse(int n) {
        int reverse = 0;

        while (n != 0){
            reverse = reverse * 10;
            reverse = reverse + n%10;
            n = n/10;
        }

        return reverse;

    }

}
