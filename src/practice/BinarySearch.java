package practice;

public class BinarySearch {

    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 7;
        int result = binarySearch2(sortedArray, target);

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in the array.");
        }
    }

    public static int binarySearch2(int[] array, int target) {

        var left = 0;
        var right = array.length - 1;

        while (left <= right) {

            var mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return array[mid];
            }

            if (array[mid] < target) {

                left = mid + 1;

            } else { //array[mid] > target

                right = mid - 1;
            }


        }

        return -1; //not found

    }


    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (array[middle] == target) {
                return middle;
            }

            if (array[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1; // Target not found
    }
}

