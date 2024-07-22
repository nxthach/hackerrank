package practice;

public class PalindromeChecker2 {

    public boolean isPalindrome(int x) {
        // Early return for negative numbers
        if (x < 0) {
            return false;
        }

        // Compare the number with its reversed version
        return x == reverse(x);
    }

    private int reverse(int x) {
        int reversed = 0;

        while (x != 0) {
            int lastDigit = x % 10;
            reversed = reversed * 10 + lastDigit;
            x = x / 10;
        }

        return reversed;
    }

    public static void main(String[] args) {
        PalindromeChecker2 checker = new PalindromeChecker2();
        System.out.println(checker.isPalindrome(121)); // true
        System.out.println(checker.isPalindrome(-121)); // false
        System.out.println(checker.isPalindrome(10)); // false
    }
}
