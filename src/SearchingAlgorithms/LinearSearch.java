package SearchingAlgorithms;

public class LinearSearch {
    public static void main(String[] args) {
        // Linear Search: Iterate through a collection one element at a time
        // Runtime Complexity: O(n)

        // Advantages:
        // Fast for searches of small to medium data sets
        // Does not need to sorted
        // Useful for data structures that do not have random access (linked List)

        // Disadvantages:
        // Slow for large data sets

        int[] array = {4, 6, 4, 5, 7, 2, 8, 9, 7, 3, 1};

        int index = linearSearch(array, 45);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    private static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
