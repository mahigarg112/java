import java.util.*;

public class Frequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Take 10 inputs from user
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
        }

        // Create Map to store frequency
        Map<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : list) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Print frequency of each element
        System.out.println("\nFrequency of each element:");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Print elements that appear more than once
        System.out.println("\nElements with same (repeated) frequency:");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
            }
        }

        sc.close();
    }
}