import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("enter your name : ");
        String str = inp.nextLine();

        System.out.print("enter your roll no : ");
        int x = inp.nextInt();

        System.out.println("name : " + str);
        System.out.println("roll-no : " + x);
    }
}
