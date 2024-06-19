abstract class AnoClass {
    abstract void sayHello();
}

public class AnonymousClass {
    public static void main(String[] args) {
        AnoClass anoClass = new AnoClass() {
            @Override
            public void sayHello() {
                System.out.println("Hello World!!!");
            }
        };

        anoClass.sayHello();
    }
}
