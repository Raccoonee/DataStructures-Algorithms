package SortingAlgorithms;

public class QuickSort {
    // starts at the end of an array and has two indices to compare up to the end of the array
    // one index looks for numbers less than the last element and moves it down, while the other index moves
    // if there's been an element less than the last one. Repeat process until you get to last element and move
    // element two the second index because all smaller number will be before and after the element.
    // use recursion to repeat for smaller partitions of the array

    // quick sort: move small elements to left of a pivot
    // recursively divide array into 2 partitions

    // run-time complexity = O(n log(n))
    // space complexity = O(log n)

    public static void main(String[] args) {
        int[] array = {9, 5, 7, 2, 4, 8, 3, 1, 5, 6};

        quickSort(array, 0, array.length - 1);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void quickSort(int[] array, int start, int end) {
        if (end <= start) return; // Base case

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);

    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;
        for (int j = start; j <= end - 1; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }

}
