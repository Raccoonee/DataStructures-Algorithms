public class SelectionSort {
    // Selection Sort looks for the min/max value in an array, iterates through until
    // it finds the min/max value and sets it as the first elements, then repeats until sorted.

    // Run-time Complexity: Quadratic time O(n^2)
    // Space complexity: O(1)
    // Ok for smaller data
    // terrible for large amounts of data

    public static void main(String[] args) {
        int[] array = {9, 5, 7, 2, 4, 8, 3, 1, 5, 6};

        selectionSort(array);

        for(int i : array) {
            System.out.print(i + " ,");
        }
    }

    private static void selectionSort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int min = i;
            for(int j = i + 1; j < array.length; j++) {
                // change the greater than sign the sort descending
                if(array[min] > array[j]) min = j;
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
