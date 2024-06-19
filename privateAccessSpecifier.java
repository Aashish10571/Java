class PrivateAccess {
    private int id;
    private String name;

    public void setData(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }
}

public class privateAccessSpecifier {
    public static void main(String[] args) {
        PrivateAccess p1;
        p1 = new PrivateAccess();

        p1.setData(1, "Aashish");

        System.out.println("id : " + p1.getId());
        System.out.println("name : " + p1.getName());
    }
}
