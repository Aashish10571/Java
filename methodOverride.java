class Parent {
    int x;

    public void printValue() {
        x = 10;
        System.out.println("The value of x is : " + x);
        System.out.println();
    }
}

class Child extends Parent {
    @Override
    public void printValue() {
        x = 20;
        System.out.println("The value of x after overriding is : " + x);
        System.out.println();
    }
}

public class methodOverride {
    public static void main(String[] args) {
        System.out.println();

        Parent p = new Parent();
        p.printValue();

        Child c = new Child();
        c.printValue();
    }
}
