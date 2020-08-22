package practice.line;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindStick {

    public static void main (String[] args) throws java.lang.Exception
    {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = br.readLine();

        String input = "1 2 3 4";


        String[] inputs = input.split(" ");
        List<Integer> lengthSticks = new ArrayList<>();
        for (int i = 0; i < inputs.length; i++) {
            lengthSticks.add(Integer.valueOf(inputs[i]));
        }

        //String secondLine = br.readLine();

        String secondLine = "7";
        Integer target = Integer.valueOf(secondLine);

        find(lengthSticks, target);
    }


    static void find(List<Integer> lengthSticks, int target){
        Collections.sort(lengthSticks);

        for (int i = 0; i < lengthSticks.size(); i++) {
            for (int j = i; j < lengthSticks.size(); j++) {
                if(i == j) continue;
                if(lengthSticks.get(i) + lengthSticks.get(j) == target){
                    System.out.println(lengthSticks.get(i) +" " + lengthSticks.get(j));
                    return;
                }
            }
        }

        System.out.println("-1");
    }



}
