import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("string : ");
        String str = inp.nextLine();

        System.out.println(str);

        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
        System.out.println(str.substring(3));
        System.out.println(str.replace('a', 'b'));
        System.out.println(str.startsWith("a"));
        System.out.println(str.endsWith("x"));
        System.out.println(str.charAt(0));
        System.out.println(str.indexOf('s'));
        System.out.println(str.lastIndexOf("a"));
        System.out.println(str.equals("Aashish"));
        System.out.println(str.equalsIgnoreCase("Aashish"));
    }
}
