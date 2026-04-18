import java.util.*;

public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[20]; // extra space for insertion
        int n;

        // 🔹 READ (Input)
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 🔹 SUM
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println("Sum = " + sum);

        // 🔹 INSERTION
        System.out.print("Enter position to insert (0-based index): ");
        int pos = sc.nextInt();

        System.out.print("Enter value: ");
        int val = sc.nextInt();

        if (pos >= 0 && pos <= n) {
            for (int i = n; i > pos; i--) {
                arr[i] = arr[i - 1];
            }
            arr[pos] = val;
            n++;
        } else {
            System.out.println("Invalid position for insertion");
        }

        // 🔹 DELETION
        System.out.print("Enter position to delete: ");
        int dpos = sc.nextInt();

        if (dpos >= 0 && dpos < n) {
            for (int i = dpos; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;
        } else {
            System.out.println("Invalid position for deletion");
        }

        // 🔹 FIND
        System.out.print("Enter element to find: ");
        int key = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }

        // 🔹 UPDATE
        System.out.print("Enter position to update: ");
        int upos = sc.nextInt();

        if (upos >= 0 && upos < n) {
            System.out.print("Enter new value: ");
            arr[upos] = sc.nextInt();
        } else {
            System.out.println("Invalid position for update");
        }

        // 🔹 FINAL ARRAY (READ)
        System.out.println("Final Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}