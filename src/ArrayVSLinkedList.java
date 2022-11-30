import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayVSLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        // Linked List - better for large amounts of data
        startTime = System.nanoTime();

//        linkedList.get(0);
//        linkedList.get(500000); this will take the longest
//        linkedList.get(999999);

//        linkedList.remove(0);
//        linkedList.remove(500000);
        linkedList.remove(999999);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("linkedList: " + elapsedTime + " ns");

        // array list - more versatile in most applications

        startTime = System.nanoTime();

//        arrayList.get(999999); - faster
//        arrayList.remove(0); - slower

//        arrayList.remove(500000); - slower
//        arrayList.remove(999999); - faster

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("arrayList: " + elapsedTime + " ns");


    }
}
