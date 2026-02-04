class A {
    A() {
        System.out.println("Constructor of A");
    }
}

class B extends A {
    B() {
        super();   // calls A()
        System.out.println("Constructor of B");
    }
}

class C extends B {
    C() {
        super();   // calls B()
        super();   // ❌ NOT ALLOWED – causes compile-time error
        System.out.println("Constructor of C");
    }
}

public class Test {
    public static void main(String[] args) {
        C obj = new C();
    }
}
