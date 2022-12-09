package DataStructures;

import java.util.Hashtable;

public class HashTableExample {
    // HashTable: A data structure that store unique keys to values ex.<Integer, String>
    // Each key/value pair is known as an entry
    // FAST insertion, look up, deletion of key/value pairs
    // not ideal for small data set, great with large dat sets

    // Hashing: takes a key and computes an integer (formula will vary based on key & data type)
    // In a hashtable, we use the hash % capacity to calculate an index number
    // key.hashcode() % capacity = index

    // bucket = an indexed storage location for one or more entries.
    // can store multiple entries in case of a collision (linked similarly a LinkedList)

    // Collision = hash function generates the same index for more than one key
    // less collisions = more efficiency

    // Runtime complexity: Best case O(1), Worst Case O(n)
    public static void main(String[] args) {
        Hashtable<String, String> table = new Hashtable<>(21);

        table.put("100", "Spongebob");
        table.put("123", "Patrick");
        table.put("321", "Sandy");
        table.put("555", "Squidward");
        table.put("777", "Gary");

        // table.remove(777) - to remove a key

        for (String key : table.keySet())
            System.out.println(key.hashCode() % 11 + "\t" + key + ":" + "\t" + table.get(key));
    }
}
