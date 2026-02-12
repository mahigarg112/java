abstract class Sample {
    int a = 10;

    void f() {
        System.out.println(a); // normal function
    }

    abstract void f2(); // abstract method
}

class Child extends Sample {
    void show() {
        super.f();
    }

    void f2() {
        System.out.println("done");
    }
}

public class Abstraction1 {
    public static void main(String[] args) {
        Child s = new Child();
        s.show();
        s.f2();
    }
}
