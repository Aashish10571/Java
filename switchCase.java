import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("enter a number : ");
        int a = inp.nextInt();

        switch (a % 2) {
            case 0:
                System.out.println(a + " is even");
                break;
            default:
                System.out.println(a + " is odd");
                break;
        }
    }
}
