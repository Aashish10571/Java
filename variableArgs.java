public class variableArgs {
    static int calculateSum(int... arr) {
        int result = 0;
        for (int el : arr) {
            result += el;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("the sum of 1 and 2 is : " + calculateSum(1, 2));
        System.out.println("the sum of 1, 2 and 3 is : " + calculateSum(1, 2, 3));
        System.out.println("the sum of 1, 2, 3 and 4 is : " + calculateSum(1, 2, 3, 4));
    }
}
