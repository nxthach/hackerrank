package practice;

public class PalindromeNumber {

    public static void main(String[] args) {
        PalindromeNumber o = new PalindromeNumber();

        System.out.println(o.isPalindrome(123));
    }

    public boolean isPalindrome(int x) {

        int rx = revert(x);

        int rr = revert(rx);

        return rr == x;

    }

    private int revert(int x) {

        int ret = 0;

        while (x > 0){
            ret = ret*10 + x%10;
            x = x/10;
        }

        return ret;
    }

}
