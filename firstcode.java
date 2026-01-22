import java.util.Scanner;

public class firstcode {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        String str[] = new String[5];

        for (int i = 0; i < 5; i++) {
            str[i] = s.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(str[i]);
        }

        s.close();
    }
}
