import java.util.Scanner;

public class ifElseIf {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("enter any three numbers");
        System.out.print("number 1 : ");
        int n1 = inp.nextInt();

        System.out.print("number 2 : ");
        int n2 = inp.nextInt();

        System.out.print("number 3 : ");
        int n3 = inp.nextInt();

        if ((n1 > n2) && (n1 > n3)) {
            System.out.println(n1 + " is the greatest");
        } else if (n2 > n3) {
            System.out.println(n2 + " is the greatest");
        } else {
            System.out.println(n3 + " is the greatest");
        }
    }
}
