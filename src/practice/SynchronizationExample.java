package practice;

class Counter {
    private int count = 0;

    // Synchronized method to ensure thread safety
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class SynchronizationExample {
    public static void main(String args[]) {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                counter.increment();
                System.out.println("in the thread 1");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                counter.increment();
                try {
                    Thread.sleep(50000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("in the thread 2");
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count: " + counter.getCount());
    }
}

