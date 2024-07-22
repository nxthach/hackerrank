package practice;

public class MaxRepeating {
    public static void main(String[] args) {


//        System.out.println(maxRepeating("ababc", "ab"));
//
        System.out.println(maxRepeating("ababcababab", "ab"));
    }
    public static int maxRepeating(String sequence, String word) {
        for (int k = sequence.length() / word.length(); k > 0; --k) {
            if (sequence.contains(word.repeat(k))) {
                return k;
            }
        }
        return 0;
    }
}
