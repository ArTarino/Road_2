package block1.taskTwo;
import java.util.Scanner;

public class scanNumbersMaxMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        int value1 = scan.nextInt();
        System.out.println("Введите второе число");
        int value2 = scan.nextInt();
        if (value1 > value2) {
            System.out.println("Это число наибольшее из двух введенных: " + value1);
        } else if (value2 > value1) {
            System.out.println("Это число наибольшее из двух введенных: " + value2);
        } else {
            System.out.println("Оба числа равны друг другу");
        }
    }
}
