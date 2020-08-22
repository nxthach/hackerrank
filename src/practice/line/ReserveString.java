package practice.line;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReserveString {

    public static void main (String[] args) throws java.lang.Exception
    {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = br.readLine();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String input = br.readLine();
        Integer inputInt = Integer.valueOf(input.trim());
        for (int i = 0; i < inputInt; i++) {
            String line = br.readLine();
            String results = process(line);

            System.out.println(results);
        }

        String results = process("RemoteIo is awesome");
        System.out.println(results);
    }

    private static String process(String line) {
        String[] words = line.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            stringBuilder.append(reserve(word));
            stringBuilder.append(' ');
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);

        return stringBuilder.toString();
    }


    private static String reserve(String line) {
        char[] charArray = line.trim().toCharArray();
        char[] result = line.trim().toCharArray();
        int count = 0;
        for (int i = charArray.length - 1; i >= 0; i--) {
            result[count] = charArray[i];
            count++;
        }

        return new String(result);
    }

}
