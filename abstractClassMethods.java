abstract class AbstractClass {
    abstract public void printHello();
}

class ConcreteClass extends AbstractClass {
    @Override
    public void printHello() {
        System.out.println("Hello World!!!");
    }
}

public class abstractClassMethods {
    public static void main(String[] args) {
        System.out.println();

        ConcreteClass c;
        c = new ConcreteClass();

        c.printHello();
    }
}
