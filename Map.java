import java.util.*;

public class Map {
    public static void main(String[] args) {
        java.util.Map<Integer, String> m = new java.util.HashMap<>();

        // Insertion
        m.put(101, "Apple");
        m.put(102, "Banana");
        m.put(103, "Mango");

        // Display map
        System.out.println("Original Map: " + m);

        // Deletion
        m.remove(102);

        // Updation
        m.put(103, "Orange");

        // Searching
        if (m.containsKey(101)) {
            System.out.println("Key 101 exists");
        }

        if (m.containsValue("Orange")) {
            System.out.println("Value Orange exists");
        }

        // Traversal using keySet (different way)
        System.out.println("Traversing using keySet:");
        for (Integer key : m.keySet()) {
            System.out.println("Key: " + key + " Value: " + m.get(key));
        }

        // Extra methods
        System.out.println("Map size: " + m.size());
        System.out.println("Is map empty? " + m.isEmpty());
    }
}