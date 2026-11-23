package practice;

import java.util.HashMap;
import java.util.Map;

public class MinPieces {

    public static int minPieces(int[] original, int[] desired) {
        // Create a map to store the last index of each element in the desired array
        Map<Integer, Integer> lastIndexMap = new HashMap<>();
        for (int i = 0; i < desired.length; i++) {
            lastIndexMap.put(desired[i], i);
        }

        int count = 0;
        int originalIndex = 0;
        int lastIndex = -1;

        for (int i = 0; i < original.length; i++) {
            int currentElement = original[i];

            if (lastIndexMap.containsKey(currentElement)) {
                int currentLastIndex = lastIndexMap.get(currentElement);

                if (currentLastIndex <= lastIndex) {
                    // If the current element's last index is not after the previous element's last index,
                    // it means a new piece is formed
                    count++;
                }

                lastIndex = currentLastIndex;
            } else {
                // If an element from the original array is not found in the desired array, return 0
                return 0;
            }
        }

        return count + 1; // Adding 1 for the last piece
    }

    public static void main(String[] args) {
        // Example usage:
        int[] original = {1, 4, 3, 2};
        int[] desired = {1, 2, 4, 3};
        System.out.println(minPieces(original, desired)); // Output: 3
    }
}

