import java.util.Scanner;

class MyException extends Exception {
    @Override
    public String toString() {
        return "age is above 125";
    }

    @Override
    public String getMessage() {
        return "check if you entered correct age";
    }
}

public class exceptionClass {
    public static void main(String[] args) {
        System.out.println();

        Scanner inp = new Scanner(System.in);

        System.out.print("enter your age : ");
        int age = inp.nextInt();

        System.out.println();

        if (age > 125) {
            try {
                throw new MyException();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        } else {
            System.out.println("age : " + age);
        }
    }
}
