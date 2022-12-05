public class MergeSort {
    // It's a recursive sorting algorithm where it breaks an array into multiple arrays
    // until there's only 2 individual elements, then uses another methods to sort them
    // and piece the array back together.

    // Run-time complexity: O(n log n)
    // Space complexity: O(n)

    public static void main(String[] args) {
        int[] array = {9, 5, 7, 2, 4, 8, 3, 1, 5, 6};

        mergeSort(array);

        for(int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void mergeSort(int[] array) {
    }

}
