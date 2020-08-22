package practice.line;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MyFIFO{

    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = br.readLine();
        String[] firstLines = firstLine.split(" ");

        Integer numCommand = Integer.valueOf(firstLines[0]);
        Integer capacity = Integer.valueOf(firstLines[1]);

        FIFO<String> fifo = new FIFO<>(capacity);

        for (int i = 0; i < numCommand; i++) {
            String command = br.readLine();
            processCommand(command, fifo);
        }
    }

    private static void processCommand(String command, FIFO fifo) {
        if("TAKE".equals(command)) {
            System.out.println(fifo.take());

        } else if("SIZE".equals(command)) {
            System.out.println(fifo.size);

        } else if(command.startsWith("OFFER")) {
            String[] offerCommand = command.split(" ");
            System.out.println(fifo.offer(offerCommand[1]));
        }
    }

    static class FIFO <E> {
        private Object[] elements;
        private int size;


        public FIFO(int capacity) {
            elements = new Object[capacity];
        }

        public boolean offer(E element) {
            if(size == elements.length) {
                return false;
            }
            elements[size++] = element;
            return true;
        }

        public E take() {
            if(elements.length == 0) {
                return null;
            }
            E result = (E) elements[0];
            for(int i = 0; i < size -1; i++) {
                elements[i] = elements[i + 1];
            }
            elements[--size] = null;

            return result;
        }


}
}
