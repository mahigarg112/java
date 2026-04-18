import java.util.*;

public class Collection {

    public static void main(String[] args) {

        // 1. ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Mango");

        System.out.println("ArrayList:");
        for (String item : arrayList) {
            System.out.println(item);
        }

        // 2. LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.addFirst(5);

        System.out.println("\nLinkedList:");
        for (int num : linkedList) {
            System.out.println(num);
        }

        // 3. Set (no duplicates)
        Set<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Blue");
        set.add("Red"); // duplicate ignored

        System.out.println("\nSet:");
        for (String color : set) {
            System.out.println(color);
        }

        // 4. Map (key-value pairs)
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "John");
        map.put(2, "Alice");
        map.put(3, "Bob");

        System.out.println("\nMap:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}