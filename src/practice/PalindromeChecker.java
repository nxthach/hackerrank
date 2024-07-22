package practice;

public class PalindromeChecker {
    public static boolean isPalindrome(String s) {
        // Normalize the string: remove non-alphanumeric characters and convert to lowercase
        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }

        // Use two pointers to check for palindrome
        int left = 0;
        int right = cleaned.length() - 1;

        while(left < right){
            if(cleaned.charAt(left) != cleaned.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";

        System.out.println("Is palindrome: " + isPalindrome(s1)); // Output: true
        System.out.println("Is palindrome: " + isPalindrome(s2)); // Output: false
    }
}

