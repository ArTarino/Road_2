package block1.taskTwo;
import java.util.Scanner;

public class scanYears {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите любой год от н. э.");
        int value = scan.nextInt();
        if (value % 4 == 0 || value % 400 == 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год является не весокосным");
        }
    }
}
