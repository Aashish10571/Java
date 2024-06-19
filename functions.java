import java.util.Scanner;

public class functions {
    static int calculateSum(int x, int y) {
        return (x + y);
    }

    static int calculateDiff(int x, int y) {
        return (x - y);
    }

    static double calculateDiv(int x, int y) {
        return (double) (x / y);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("enter a number : ");
        int x = inp.nextInt();

        System.out.print("enter another number : ");
        int y = inp.nextInt();

        System.out.println(x + " + " + y + " : " + calculateSum(x, y));
        System.out.println(x + " - " + y + " : " + calculateDiff(x, y));
        System.out.println(x + " / " + y + " : " + calculateDiv(x, y));
    }
}
