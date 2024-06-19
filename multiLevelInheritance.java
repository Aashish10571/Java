class MultiLevelBase {
    public MultiLevelBase() {
        System.out.println("In parent class");
    }
}

class MultiLevelDerived extends MultiLevelBase {
    public MultiLevelDerived() {
        System.out.println("In child class");
    }
}

class MultiLevelDerivedAgain extends MultiLevelDerived {
    public MultiLevelDerivedAgain() {
        System.out.println("In grand-child class");
    }
}

public class multiLevelInheritance {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Program illustrating multi level inheritance");
        System.out.println();

        MultiLevelDerivedAgain md;
        md = new MultiLevelDerivedAgain();
    }
}
