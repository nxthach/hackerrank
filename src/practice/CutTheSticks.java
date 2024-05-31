package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CutTheSticks {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(5, 4, 4, 2, 2, 8));

        System.out.println(cutTheSticks(arrayList));
    }


    public static List<Integer> cutTheSticks(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();

        int numberOfStickCut = -1;
        while (numberOfStickCut != 0) { //stop when numberOfStickCut==0

            numberOfStickCut = 0; // reset the counter for new iteration

            arr = arr.stream()
                    .filter(num -> num != 0)
                    .collect(Collectors.toList());

            //find stick shortest
            if (arr.isEmpty()){
                break; //stop the loop when no more stick need to cut
            }

            int lengthOfCut = Collections.min(arr);

            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) == 0) {
                    continue; //ignore the stick can not cut anymore
                }

                int lengthAfterCut = arr.get(i) - lengthOfCut; // do cut the length
                numberOfStickCut++;//count the number of stick already cut

                arr.set(i, lengthAfterCut); //update new length

            }

            //collect amount of sticks were cut
            if (numberOfStickCut > 0) {
                result.add(numberOfStickCut);
            }

        }

        return result;
    }
}
