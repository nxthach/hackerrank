package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class OutOfMemoryExample {

    public static void main(String[] args) throws InterruptedException {
        List<Object> list = new ArrayList<>();

        try {
            while (true) {
                list.add(new Object());
            }
        } catch (OutOfMemoryError e) {
            System.err.println("Out of memory error occurred.");
            Thread.sleep(10000);
            e.printStackTrace();

        }

        HashSet<String> d = new HashSet();
        d.add("T");
    }
}
