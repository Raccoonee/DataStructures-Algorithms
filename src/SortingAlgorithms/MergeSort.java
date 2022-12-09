package SortingAlgorithms;

import java.util.Random;

public class MergeSort {
    // It's a recursive sorting algorithm where it breaks an array into multiple arrays
    // until there's only 2 individual elements, then uses another methods to sort them
    // and piece the array back together.

    // Run-time complexity: O(n log n)
    // Space complexity: O(n)

    public static void main(String[] args) {
        int[] array = {9, 5, 7, 2, 4, 8, 3, 1, 5, 6};

        int[] array2 = new int[100000];

        for (int i = 0; i < array2.length; i++) {
            Random rand = new Random();
            array2[i] = rand.nextInt(100000);
        }

        mergeSort(array);

        for (int i : array2) {
            System.out.print(i + " ");
        }
    }

    private static void mergeSort(int[] array) {
        int length = array.length;
        if (length <= 1) return;
        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0; // for left array
        int j = 0; // for right array
        for (; i < length; i++) {
            if (i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0; // indices

        // check the conditions for merging
        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
