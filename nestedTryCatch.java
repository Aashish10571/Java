import java.util.Scanner;

public class nestedTryCatch {
    public static void main(String[] args) {
        System.out.println();

        int[] arr = {1, 2, 3, 4, 5};
        boolean flag = true;
        int index;

        Scanner inp = new Scanner(System.in);

        System.out.print("enter a index : ");
        index = inp.nextInt();

        while (flag) {
            try {
                System.out.println("checking..");
                System.out.println();
                try {
                    System.out.println("element at index " + index + " is : " + arr[index]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("index out of bound");
                    System.out.println();
                    System.out.print("enter the index again : ");
                    index = inp.nextInt();
                }
            } catch (Exception e) {
                System.out.println("other exception occurred");
                System.out.println();
                System.out.print("enter the index again : ");
                index = inp.nextInt();
            }
        }

        System.out.println();
        System.out.println("Thank you for visiting!!!");
    }
}
