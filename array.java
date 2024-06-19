import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int[] a = new int[5];

        System.out.println("enter the elements of the array");
        for (int i = 0; i < 5; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = inp.nextInt();
        }

        System.out.println();

        System.out.println("the elements of the array are");
        for (int i = 0; i < 5; i++) {
            System.out.println("a[" + i + "] : " + a[i]);
        }

        System.out.println();

        int i = 0;
        System.out.println("the elements of the array are using for each loop");
        for (int ele : a) {
            System.out.println("a[" + i + "] : " + ele);
        }
    }
}
