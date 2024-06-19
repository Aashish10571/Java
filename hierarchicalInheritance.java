class HierarchicalBase {
    public HierarchicalBase() {
        System.out.println("In parent class");
    }
}

class HierarchicalDerivedFirst extends HierarchicalBase {
    public HierarchicalDerivedFirst() {
        System.out.println("In first child class");
    }
}

class HierarchicalDerivedSecond extends HierarchicalDerivedFirst {
    public HierarchicalDerivedSecond() {
        System.out.println("In second child class");
    }
}

public class hierarchicalInheritance {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Program that illustrates Hierarchical inheritance");
        System.out.println();

        HierarchicalDerivedFirst f;
        f = new HierarchicalDerivedFirst();

        HierarchicalDerivedSecond s;
        s = new HierarchicalDerivedSecond();

    }
}
