import java.util.Scanner;

public class recursionFibonacci {
    static void printFibonacciSeries(int a, int b, int n) {
        if (n == 0) {
            return;
        } else {
            int c = a + b;
            System.out.print(c + " ");
            printFibonacciSeries(b, c, n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("enter the number of terms in fibonacci seriess : ");
        int n = inp.nextInt();

        System.out.print(0 + " " + 1 + " ");
        printFibonacciSeries(0, 1, n - 2);
    }
}
