class SingleBase {
    public SingleBase() {
        System.out.println("In parent class");
    }
}

class SingleDerived extends SingleBase {
    public SingleDerived() {
        System.out.println("In child class");
    }
}

public class singleInheritance {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Program to illustrate single Inheritance");
        System.out.println();

        SingleDerived sd;
        sd = new SingleDerived();
    }
}
