package practice;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    private static final Map<String, Integer> map = Map.of(
            "I", 1,
            "V", 5,
            "X", 10,
            "L", 50,
            "C", 100,
            "D", 500,
            "M", 1000
    );




    public int romanToInt2(String s) {
        int total = 0;
        var prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = map.get(String.valueOf(s.charAt(i)));

            if (currentValue < prev) {
                total -= currentValue;
            } else {
                total += currentValue;
            }

            prev = currentValue;

        }

        return total;

    }
    public int romanToInt(String s) {

        Map<String, Integer> map = new HashMap<>();

        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        int total = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = map.get(String.valueOf(s.charAt(i)));

            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }

            prevValue = currentValue;
        }

        return total;

    }

    public static void main(String[] args) {
        RomanToInt RomanToInt = new RomanToInt();
        System.out.println(RomanToInt.romanToInt2("MCMXCIV"));
    }
}
