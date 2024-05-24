package block1.taskTwo;
import java.util.Scanner;

public class scanNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите любое число");
        int value = scan.nextInt();
        if ((value % 2) == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
    }
}
