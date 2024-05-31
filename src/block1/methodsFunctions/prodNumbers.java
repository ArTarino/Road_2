package block1.methodsFunctions;

public class prodNumbers {
    //
    public static void main(String[] args) {
        int a1 = 10;
        int a2 = 7;
        int product = productNumbers(a1, a2);
        System.out.println(product);
    }

    public static int productNumbers(int a1, int a2) {
        return a1 * a2;
    }
}
