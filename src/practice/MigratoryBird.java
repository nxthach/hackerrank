package practice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MigratoryBird {

    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(2,3,1,2,3,4,2,1,1);

        migratoryBirds(arr);
    }

    static int migratoryBirds(List<Integer> arr) {

        Map<Integer, Long> countForType = arr.stream()
                .collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));

        Map<Integer, Long> sortedByCount = countForType.entrySet()
                .stream()
                .sorted((Map.Entry.<Integer, Long>comparingByValue().reversed()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        //System.out.println(countForType);
        //System.out.println(sortedByCount);
        //System.out.println(sortedByCount.entrySet().stream().findFirst().get().getKey());

        return sortedByCount.entrySet().stream().findFirst().get().getKey();
    }

    static int migratoryBirds2(List<Integer> arr) {

        int[] arrCount = new int[arr.size()];

        for (Integer i: arr) {
            arrCount[i-1]++;
        }

        int max = Integer.MIN_VALUE;
        int maxType = 1;

        for (int i = 0; i < arrCount.length; i++) {
            if(arrCount[i] > max){
                max = arrCount[i];
                maxType = i + 1;
            }
        }


        return maxType;
    }
}
