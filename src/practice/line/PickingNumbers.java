package practice.line;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PickingNumbers {

    public static void main(String[] args) {
//        System.out.println(pickingNumbers(Arrays.asList(4,6,5,3,3,1)));
        System.out.println(pickingNumbers2(Arrays.asList(4,6,5,3,3,1)));
    }

    public static int pickingNumbers(List<Integer> a) {

        a.sort(Comparator.comparingInt(o -> (int) o).reversed());

        List<List<Integer>> listSub = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {

            List<Integer> sub = new ArrayList<>();
            for (int j = i; j < a.size(); j++) {

                if(j == i){
                    sub.add(a.get(j));
                }else {
                    if(a.get(i) - a.get(j) <= 1){
                        sub.add(a.get(j));
                    }
                }
            }

            listSub.add(sub);
        }

        int ret = listSub.stream().map(List::size).max(Comparator.comparingInt(o -> o)).get();
        return ret;
    }

    public static int pickingNumbers2(List<Integer> a) {
        Collections.sort(a);
        int start = 0;
        int i = 0;
        int max = 0;
        while (i < a.size()) {
            if (Math.abs(a.get(start) - a.get(i)) > 1) {
                start = i;
            }
            max = Math.max(max, i - start + 1);
            i++;
        }
        i--;

        return Math.max(max, i - start + 1);
    }

}
