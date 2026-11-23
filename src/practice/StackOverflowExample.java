package practice;

public class StackOverflowExample {

    public static void main(String[] args) throws InterruptedException {
        try {
            // Call a recursive function
            recursiveFunction(0);

        } catch (StackOverflowError e) {
            System.err.println("StackOverflowError occurred.");
            Thread.sleep(100000);
            e.printStackTrace();
        }
    }

    private static void recursiveFunction(int counter) throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("Counter: " + counter);
        recursiveFunction(counter + 1); // Recursive call without a proper termination condition
    }
}

