import java.util.Scanner;

public class multipleExceptionHandelling {
    public static void main(String[] args) {
        System.out.println();

        int[] arr = {1, 2, 3};

        Scanner inp = new Scanner(System.in);

        System.out.print("enter the index of the array : ");
        int index = inp.nextInt();
        System.out.print("enter a number you want to divide with : ");
        int num = inp.nextInt();

        System.out.println();

        try {
            System.out.println("the element at the index " + index + " is : " + arr[index]);
            System.out.println("the value of array-element / number is : " + arr[index] / num);
        } catch (ArithmeticException e) {
            System.out.println("could not divide");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index out of bound");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("other exception occurred");
            System.out.println(e);
        }
    }
}
