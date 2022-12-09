package SearchingAlgorithms;

public class InterpolationSearch {
    // improvement over binary search best used for "uniformly" distributed data
    // "guesses" where a value might be based on calculated probe results
    // if probe is incorrect, search area is narrowed, and a new probe is calculated

    // average case: O(log(log(n)))
    // worse case: O(n) [values increase exponentially]
    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array2 = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        int index = interpolationSearch(array2, 256);

        if (index == -1) {
            System.out.println(index + " not found");
        } else {
            System.out.println("Element found at: " + index);
        }
    }

    private static int interpolationSearch(int[] array, int i) {
        int high = array.length - 1;
        int low = 0;

        while (i >= array[low] && i <= array[high] && low <= high) {
            int probe = low + (high - low) * (i - array[low]) / (array[high] - array[low]);
            System.out.println("probe: " + probe);
            if (array[probe] == i) {
                return probe;
            } else if (array[probe] < i) {
                low = probe + 1;
            } else {
                high = probe - 1;
            }
        }
        return -1;
    }
}
