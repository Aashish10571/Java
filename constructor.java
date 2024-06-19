class Constructors {
    private int id;
    private String name;

    public Constructors() {
        this.id = 0;
        this.name = "";
    }

    public Constructors(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}

public class constructor {
    public static void main(String[] args) {
        Constructors c1;
        c1 = new Constructors(1, "Aashish");

        System.out.println("id : " + c1.getId());
        System.out.println("name : " + c1.getName());
    }
}
