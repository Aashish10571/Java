import java.util.Scanner;

public class recursionFactorial {
    static int calculateFactorial(int x) {
        if (x == 0 || x == 1) {
            return 1;
        } else {
            return x * calculateFactorial(x - 1);
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("enter a number : ");
        int x = inp.nextInt();
        System.out.println();

        System.out.println("the factorial of " + x + " is : " + calculateFactorial(x));
    }
}
