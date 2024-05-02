package practice;

public class AppendAndDelete {

    public static void main(String[] args) {
        String s = "aba";
        String t = "aba";
        int k = 7;
        System.out.println(appendAndDelete(s, t, k));

        s = "ashley";
        t = "ash";
        k = 2;
        System.out.println(appendAndDelete(s, t, k));

        s = "hackerhappy";
        t = "hackerrank";
        k = 9;
        System.out.println(appendAndDelete(s, t, k));

        s = "hackerhappy";
        t = "hackerrank";
        k = 10;
        System.out.println(appendAndDelete(s, t, k));

    }

    public static String appendAndDelete(String s, String t, int k) {

        //find common character between s and t
        int sameIndex = 0;
        while (sameIndex < Math.min(s.length(), t.length())) {
            if (s.charAt(sameIndex) == t.charAt(sameIndex)) {
                sameIndex++; //increase when found same character
            } else {
                break; // break if found any diff character
            }
        }

        int operationsNeeded = s.length() + t.length() - (2 * sameIndex);

        if (k < operationsNeeded) {
            return "No";
        }

        //when k >= operationsNeeded
        if (k >= s.length() + t.length()) {
            return "Yes"; // always can delete all character of S and append all character of T
        }

        if ((k - operationsNeeded) % 2 == 0) {
            return "Yes";
        }

        return "No";

    }

    public static String appendAndDelete4(String s, String t, int k) {
        if (k >= s.length() + t.length()) {
            return "Yes"; // always can delete all character of S and append all character of T
        }

        //find common character between s and t
        int sameIndex = 0;
        while (sameIndex < Math.min(s.length(), t.length())) {
            if (s.charAt(sameIndex) == t.charAt(sameIndex)) {
                sameIndex++; //increase when found same character
            } else {
                break; // break if found any diff character
            }
        }

        int operationsNeeded = s.length() + t.length() - (2 * sameIndex);

        if (k < operationsNeeded) {
            return "No";
        }

        //when k >= operationsNeeded
        if ((k - operationsNeeded) % 2 == 0) {
            return "Yes";
        }

        return "No";

    }

    public static String appendAndDelete3(String s, String t, int k) {
        int i = 0;
        while (i < Math.min(s.length(), t.length()) && s.charAt(i) == t.charAt(i)) {
            i++;
        }
        int x = s.length() + t.length() - (2 * i);

        if (x <= k && ((k - x) % 2 == 0 || (s.length() + t.length()) <= k)) {
            return "Yes";
        } else {
            return "No";
        }
    }


    /*
     * Complete the 'appendAndDelete' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. STRING t
     *  3. INTEGER k
     */
    public static String appendAndDelete2(String s, String t, int k) {
        if (s.equals(t)) {
            return "Yes"; //same - return Yes whenever k > 0, because we do nothing
        }

        // Write your code here

        int totalDelete = 0;
        int totalAppend = 0;

        int diffIndex = -1; // difference index of s and t

        int lengthS = s.length();

        int lengthT = t.length();

        int lengthDiff = Math.min(lengthS, lengthT);

        for (int i = 0; i < lengthDiff; i++) {
            if (s.charAt(i) != t.charAt(i)) {
                diffIndex = i;
                break;
            }
        }

        if (diffIndex == -1) {

            //same abc, abcxyz -> count total delete
            //same abcxyz, abc -> count total delete

            int totalOperation = Math.abs(lengthS - lengthT);

            if (totalOperation <= k) {
                return "Yes";
            }

        }

        totalDelete = lengthS - diffIndex;// hackerhappy 11-6=5

        totalAppend = lengthT - diffIndex;// hackerrank 10-6=4


        if (totalDelete + totalAppend <= k) { //5+4 <=9
            return "Yes";
        } else {
            return "No";
        }


    }
}
