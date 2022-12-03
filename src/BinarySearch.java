import java.util.Arrays;

public class BinarySearch {
    // Binary Search
    // An Algorithm that finds the position of a target value within a sorted array
    // Half of the array is eliminated during each "step"

    // great for sorting a lot of data but not a little data
    // Space time complexity: O(log n)
    public static void main(String[] args) {
        int array[] = new int[1000000];
        int target = 77777;

        for(int i = 0; i < array.length; i++) {
            array[i] = i;
        }
//        int index = Arrays.binarySearch(array, target);
        int index = binarySearch(array, target);

        if(index == -1) {
            System.out.println(target + " not found");
        } else {
            System.out.println("Element found at: " + index);
        }



    }
    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        while(low <= high) {
            int middle = low + (high - low) / 2;
            int value = array[middle];
            System.out.println("middle: " + middle);

            if(value < target) {
                low = middle + 1;
            }  else if (value > target) {
                high = middle - 1;
            } else {
                return middle; // target found
            }
        }
        return -1; // target not found
    }



}


