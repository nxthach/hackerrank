package practice;

public class ViralAdvertising {

    public static void main(String[] args) {
        System.out.println(viralAdvertising(3));
        System.out.println(viralAdvertising(4));
        System.out.println(viralAdvertising(5));
    }

    static int viralAdvertising(int n) {

        int shared = 5;
        int liked = 0;
        int cumulative = 0;

        for (int i = 0; i < n; i++) {
            liked = shared/2;
            cumulative = cumulative + liked;
            shared = liked*3;
        }
        return cumulative;
    }

}
