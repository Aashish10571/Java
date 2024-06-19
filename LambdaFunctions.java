@FunctionalInterface
interface LambdaClass {
    void sayHello();
}


public class LambdaFunctions {
    public static void main(String[] args) {
        LambdaClass obj = () -> {
            System.out.println("Hello World, using Lambda Expression!!!");
        };

        obj.sayHello();
    }
}
