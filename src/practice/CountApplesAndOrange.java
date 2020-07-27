package practice;

public class CountApplesAndOrange {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int numberOfAppleLandOnHouse = 0;
        int numberOfOrangeLandOnHouse = 0;

        for (int i = 0; i < apples.length; i++) {
            int landSpot = a + apples[i];
            if(landSpot >= s && landSpot <= t) {
                numberOfAppleLandOnHouse++;
            }
        }

        for (int i = 0; i < oranges.length; i++) {
            int landSpot = b + oranges[i];
            if(landSpot >= s && landSpot <= t) {
                numberOfOrangeLandOnHouse++;
            }
        }

        System.out.println(numberOfAppleLandOnHouse);
        System.out.println(numberOfOrangeLandOnHouse);
    }
}

