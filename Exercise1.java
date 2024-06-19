// WAP to calculate the percentage of a given student, his marks of 5 subjects can be taken as input

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("enter the marks");
        System.out.print("subject 1 : ");
        int m1 = inp.nextInt();

        System.out.print("subject 2 : ");
        int m2 = inp.nextInt();

        System.out.print("subject 3 : ");
        int m3 = inp.nextInt();

        System.out.print("subject 4 : ");
        int m4 = inp.nextInt();

        System.out.print("subject 5 : ");
        int m5 = inp.nextInt();

        double pcnt = (double) (m1 + m2 + m3 + m4 + m5) / 5;

        System.out.println("percentage : " + pcnt + "%");
    }
}
