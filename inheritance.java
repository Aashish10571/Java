class Animal {
    String name;
    String color;
    int noOfLegs;

    public Animal() {
        name = "";
        color = "";
        noOfLegs = 0;
    }
}

class Dog extends Animal {
    public Dog(String name, String color, int n) {
        this.name = name;
        this.color = color;
        this.noOfLegs = n;
    }

    public void printInformation() {
        System.out.println();
        System.out.println("Animal : Dog");
        System.out.println("Name : " + this.name);
        System.out.println("Color : " + this.color);
        System.out.println("No of legs : " + this.noOfLegs);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Dog d;
        d = new Dog("Husky", "White", 4);

        d.printInformation();
    }
}
