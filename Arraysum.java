import java.util.Scanner;

public class Arraysum {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = s.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            sum += arr[i];
        }

        System.out.println("Sum of array elements = " + sum);

        s.close();
    }
}
