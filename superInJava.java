class A {
    A(int x) {
        System.out.println("In parent class");
        System.out.println("X : " + x);
        System.out.println();
    }

    public void print() {
        System.out.println("Called using super keyword in java");
        System.out.println();
    }
}

class B extends A {
    B() {
        super(10);
        super.print();
        System.out.println("In child class");
    }
}

public class superInJava {
    public static void main(String[] args) {
        System.out.println();
        B b = new B();
    }
}
