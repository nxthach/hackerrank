package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BetweenTwoSet {

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(2, 4);
        List<Integer> b = Arrays.asList(16, 32, 96);

        System.out.println(getTotalX(a, b));
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        Integer maxA = Collections.max(a);
        Integer minB = Collections.min(b);

        int integersBetween = 0;

        intCheck:
        for(int i = maxA; i <= minB; i += maxA)
        {
            //Check if all A are a factor of i
            for(int num : a)
            {
                if(i%num != 0)
                {
                    continue intCheck;
                }
            }

            //Check if i is a factor of all B
            for(int num : b)
            {
                if(num%i != 0)
                {
                    continue intCheck;
                }
            }
            integersBetween++;
        }

        return integersBetween;
    }

}
