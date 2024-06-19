import java.util.Stack;

public class learnStack {
    public static void main(String[] args) {
        System.out.println();

        Stack<String> animal = new Stack<>();

        animal.push("Lion");
        animal.push("Horse");
        animal.push("Fish");
        animal.push("Dog");
        animal.push("Cat");

        System.out.println(animal);

        System.out.println("Top element : " + animal.peek());

        animal.pop();

        System.out.println(animal);
    }
}
