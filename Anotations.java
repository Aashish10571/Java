@FunctionalInterface
interface myInterface {
    void sayHello();
}

class Base {
    @Deprecated
    public int sum(int a, int b) {
        return a + b;
    }
}

public class Anotations {
    @SuppressWarnings("deprecated")
    public static void main(String[] args) {
        Base base = new Base();
        System.out.println("Hello World!!");
        base.sum(2, 3);
    }
}
