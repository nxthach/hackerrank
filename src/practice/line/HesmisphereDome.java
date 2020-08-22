package practice.line;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HesmisphereDome {
    public static double calculateRadius(int A, int H) {
        double a = A / Math.sqrt(2);
        double bc = Math.sqrt(Math.pow(a, 2) + Math.pow(H, 2));
        double r = a * H / bc;

        return r;
    }

    public static double radius(int A, int H) {


        return A*H/(A+H);
    }

    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();


        String[] words = input.split(" ");
        Integer A = Integer.valueOf(words[0]);
        Integer H = Integer.valueOf(words[1]);

        Double radius = (double) ((A * H) / (A + H));
        System.out.format("%.4f", radius);


//        System.out.println(calculateRadius(15, 10));
//        System.out.format("%.4f", calculateRadius(15, 10));


        Map<String, Integer> map = new HashMap<>();
        System.out.println(map.put("One", 111));
        System.out.println(map.put("One", 111));



    }
}
