interface father {
    String fatherName = "Lakh Man Moktan";
}

interface mother {
    String motherName = "Pindu Maya Moktan";
}

class ChildMe implements father, mother {
    public void print() {
        System.out.println("Father Name : " + fatherName);
        System.out.println("Mother Name : " + motherName);
        System.out.println("My Name : Aashish");
    }
}

public class multipleInheritance {
    public static void main(String[] args) {
        System.out.println();

        ChildMe c;
        c = new ChildMe();

        c.print();
    }
}
