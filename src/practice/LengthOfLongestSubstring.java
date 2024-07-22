package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        LengthOfLongestSubstring o = new LengthOfLongestSubstring();

//        System.out.println(o.lengthOfLongestSubstring("abcabcbb"));
//        System.out.println(o.lengthOfLongestSubstring("bbbbb"));
        System.out.println(o.lengthOfLongestSubstring3("abcbdeba"));
    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= left) {
                left = charIndexMap.get(currentChar) + 1;
            }
            charIndexMap.put(currentChar, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public int lengthOfLongestSubstring2(String s) {

        int maxLen = 0;
        var array = s.toCharArray();

        Set<Character> sub = new HashSet<>();

        for (int i = 0; i < array.length; i++) {

            sub.clear();
            sub.add(array[i]);

            for (int j = i+1; j < array.length-1; j++) {

                if (!sub.contains(array[j])) {
                    sub.add(array[j]);
                } else {
                    break;
                }
            }

            if(maxLen < sub.size()){
                maxLen = sub.size();
            }

        }

        return maxLen;

    }

    public static int lengthOfLongestSubstring3(String s) {
        int maxLength = 0;

        int left = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int currentIndex = 0; currentIndex < s.length(); currentIndex++) {

            var currentChar = s.charAt(currentIndex);

            //update left when find the char repeat
            if (map.containsKey(currentChar) && map.get(currentChar) > left) {
                left = map.get(currentChar) + 1;
            }

            map.put(currentChar, currentIndex);
            maxLength = Math.max(maxLength, currentIndex - left + 1);
        }

        return maxLength;
    }
}
