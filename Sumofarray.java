import java.util.Scanner;
 
public class Sumofarray {
    int sum = 0;
    int arr[] = new int[5];

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Sumofarray as = new Sumofarray();

        for (int i = 0; i < 5; i++) {
            as.arr[i] = s.nextInt();
            as.sum += as.arr[i];
        }

        System.out.println( as.sum);
    }
}
