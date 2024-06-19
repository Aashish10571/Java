class exceptionHandelling {
    public static void main(String[] args) {
        int x = 9;
        int y = 0;
        try {
            int c = x / y;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("could not divide since");
            System.out.println(e);
        }
    }
}
