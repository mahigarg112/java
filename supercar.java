import java.util.Scanner;

class Car {
    int n;

    Car(int price) {
        this.n = price;
    }
}

class BMW extends Car {
    int m;
    Scanner s = new Scanner(System.in);

    BMW(int price) {
        super(price);
    }

    void f1() {
        System.out.print("Enter value for m: ");
        m = s.nextInt();
        System.out.println("m = " + m);
        System.out.println("n (price) = " + n);
    }
}

public class supercar {
    public static void main(String[] args) {
        BMW b = new BMW(5);
        b.f1();
    }
}
