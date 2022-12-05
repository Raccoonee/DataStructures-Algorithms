import java.sql.Array;
import java.util.Random;

public class BubbleSort {
    // Bubble Sort compares an element and the next element
    // to determine whether it's bigger, then switches the element if bigger

    // Run-time Complexity: Quadratic time O(n^2)
    // Space complexity: O(1)
    // Ok for smaller data
    // terrible for large amounts of data
    public static void main(String[] args) {
        int[] array = {9, 5, 7, 2, 4, 8, 3, 1, 5, 6};

        int[] array2 = new int[100000];

        for (int i = 0; i < array2.length; i++) {
            Random rand = new Random();
            array2[i] = rand.nextInt(100000);
        }

        for (int i : array2) {
            System.out.print(i + " ,");
        }

        bubbleSort(array2);
        System.out.println();

        for (int i : array2) {
            System.out.print(i + " ,");
        }
    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tempVar = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tempVar;
                }
            }
        }
    }
}
