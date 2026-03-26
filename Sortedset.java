import java.util.*;

public class Sortedset {
    public static void main(String[] args) {
        java.util.SortedSet<Integer> s = new java.util.TreeSet<>();

        // Insertion
        s.add(50);
        s.add(10);
        s.add(40);
        s.add(20);

        // Display original sorted set
        System.out.println("SortedSet: " + s);

        // Deletion
        s.remove(40);

        // Updation (remove + add)
        s.remove(10);
        s.add(15);

        // Searching
        if (s.contains(20)) {
            System.out.println("20 is present");
        } else {
            System.out.println("20 not found");
        }

        // Special SortedSet methods
        System.out.println("First element: " + s.first());
        System.out.println("Last element: " + s.last());

        // Traversal using Iterator (different way)
        System.out.println("Elements using Iterator:");
        Iterator<Integer> it = s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}