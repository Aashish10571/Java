public class DateTime_1 {
    public static void main(String[] args) {
        System.out.println("Time passed since 1 jan 1970");
        System.out.println("Year : " + System.currentTimeMillis() / 1000 / 3600 / 24 / 365);
        System.out.println();
        System.out.println("Time");
        System.out.print(System.currentTimeMillis() / 1000 / 3600 + " : ");
        System.out.print(System.currentTimeMillis() / 1000 / 60 + " : ");
        System.out.println(System.currentTimeMillis() / 1000);
    }
}
