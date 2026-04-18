import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        // 🔹 1. Insert first n natural numbers at end
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            list.add(i);   // add at end
        }

        System.out.println("After inserting n natural numbers: " + list);

        // 🔹 2. Remove k values from start
        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        for (int i = 0; i < k && !list.isEmpty(); i++) {
            list.removeFirst();
        }

        System.out.println("After removing k elements from start: " + list);

        // 🔹 3. Insert 22, 12, 13 at beginning
        list.addFirst(13);
        list.addFirst(12);
        list.addFirst(22);

        System.out.println("After inserting 22,12,13 at beginning: " + list);

        // 🔹 4. Print elements at even positions
        System.out.println("Elements at even positions:");
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {   // index 0,2,4...
                System.out.print(list.get(i) + " ");
            }
        }
        System.out.println();

        // 🔹 5. Verify peek() and poll()
        System.out.println("\nPeek element: " + list.peek()); // first element

        System.out.println("Poll element: " + list.poll()); // removes first

        System.out.println("List after poll(): " + list);

        sc.close();
    }
}