public class InsertionSort {
    // InsertionSort takes a temp element and compares it to previous elements
    // if previous elements are larger it shifts them until they're not
    // and put element after a smaller number of it.

    // Run-time Complexity: Quadratic time O(n^2)
    // Space complexity: O(1)
    // Ok for smaller data
    // terrible for large amounts of data

    public static void main(String[] args) {
        int[] array = {9, 5, 7, 2, 4, 8, 3, 1, 5, 6};

        insertionSort(array);

        for(int i : array) {
            System.out.print(i + " ");
        }
    }
    private static void insertionSort(int[] array) {
        for(int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;

            }
            array[j + 1] = temp;
        }
    }
}
