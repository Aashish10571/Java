public class finallyInJava {
    static int checkException(int a, int b) {
        try {
            int c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println("Exception cannot divide number by zero");
        } finally {
            System.out.println("Executed finally!!!");
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println();

        int x = checkException(1, 0);
        System.out.println(x);

        System.out.println();

        int a = 12;
        int b = 5;

        while (true) {
            try {
                System.out.println(a / b);
            } catch (Exception e) {
                System.out.println("Arithmetic Exception : / zero");
                break;
            } finally {
                System.out.println("executed finally : " + b);
            }
            b--;
        }
    }
}
