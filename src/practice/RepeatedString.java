package practice;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RepeatedString {
    public static void main(String[] args) {
        Map<String, String>  aMap = new HashMap<>();

        System.out.println(String.join(",", aMap.values()));

        Set<Long> a = new HashSet<>();
        a.add(1L);
        a.add(2L);
        a.add(3L);
        a.add(1L);

        Arrays.stream(a.toArray(new Long[0])).forEach(System.out::println);
    }

    public static long repeatedString(String s, long n) {
        // Write your code here

        return 0l;
    }
}
