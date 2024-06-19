public class functionOverloading {
    static int calculateSum(int a, int b) {
        return (a + b);
    }

    static double calculateSum(double a, double b) {
        return (a + b);
    }

    static int calculateSum(int a, int b, int c) {
        return (a + b + c);
    }

    static double calculateSum(double a, double b, double c) {
        return (a + b + c);
    }

    public static void main(String[] args) {
        System.out.println(calculateSum(1, 2));
        System.out.println(calculateSum(1.2, 1.5));
        System.out.println(calculateSum(1, 2, 3));
        System.out.println(calculateSum(2.3, 2.4, 2.5));
    }
}
