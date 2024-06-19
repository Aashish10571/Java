interface InterfaceClass {
    void printHello();

    void printNamaste();
}

class DerivedInterfaceClass implements InterfaceClass {
    @Override
    public void printHello() {
        System.out.println("Hello There!!");
    }

    @Override
    public void printNamaste() {
        System.out.println("Namaste!!!");
    }
}

public class interfaceClassMethods {
    public static void main(String[] args) {
        System.out.println();

        DerivedInterfaceClass d;
        d = new DerivedInterfaceClass();

        d.printHello();
        d.printNamaste();
    }
}
