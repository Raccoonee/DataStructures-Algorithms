import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<String>();

        // Linked list take more memory.
        // The difference between an array and a linkedList is that an array is can't easily remove or add elements as well
        // as a LinkedList because each element in a linked list is points to the next element in memory. Therefore, it's
        // useful to remove and add elements.
        // There are also doubly linked list have access to the address of the next and previous element.

//        linkedList.push("A");
//        linkedList.push("B");
//        linkedList.push("C");
//        linkedList.push("D");
//        linkedList.push("F");
//        linkedList.pop();


        // THIS IS A LINKED LIST AS A QUEUE
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
//        linkedList.poll();

        linkedList.add(4, "E");
        System.out.println(linkedList);

        linkedList.remove("E");

        System.out.println(linkedList.indexOf("C"));


        System.out.println(linkedList);

    }
}
