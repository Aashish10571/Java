import java.util.Scanner;

class NegativeException extends Exception {
    @Override
    public String toString() {
        return "radius cannot be negative";
    }

    @Override
    public String getMessage() {
        return "radius cannot be negative";
    }
}

public class throwVsThrows {
    static double area(double r) throws NegativeException {
        if (r < 0) {
            throw new NegativeException();
        } else {
            return Math.PI * r * r;
        }
    }

    static int division(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println();

        Scanner inp = new Scanner(System.in);

        System.out.println("trying to perform division");
        System.out.println();
        System.out.print("enter number : ");
        int a = inp.nextInt();
        System.out.print("enter another number : ");
        int b = inp.nextInt();
        System.out.println();

        try {
            System.out.println(" a divided by b : " + division(a, b));
        } catch (Exception e) {
            System.out.println("Cannot divide a number by 0");
        }

        System.out.println();
        System.out.println("trying to find the area");
        System.out.println();
        System.out.print("enter radius : ");
        int r = inp.nextInt();
        System.out.println();

        try {
            System.out.println("area : " + area(r));
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
