class Copy {
    private int id;
    private String name;

    public Copy() {
        this.id = 0;
        this.name = "";
    }

    // copying the data
    public Copy(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // copying the another object into the object
    public Copy(Copy c) {
        this.id = c.id;
        this.name = c.name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

public class copyConstructor {
    public static void main(String[] args) {
        Copy c1;
        c1 = new Copy(1, "Aashish");

        System.out.println("id : " + c1.getId());
        System.out.println("name : " + c1.getName());
        System.out.println();

        Copy c2;
        c2 = new Copy(c1);

        System.out.println("id : " + c2.getId());
        System.out.println("name : " + c2.getName());
    }
}
