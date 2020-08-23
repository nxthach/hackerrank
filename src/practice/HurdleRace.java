package practice;

public class HurdleRace {


    static int hurdleRace(int k, int[] height) {

        // find max
        int maxHeight = Integer.MIN_VALUE;
        for (int i = 0; i < height.length; i++) {
            if(height[i] > maxHeight){
                maxHeight = height[i];
            }
        }

        int numOfPotion = maxHeight - k;
        return numOfPotion > 0 ? numOfPotion : 0;

    }
}
