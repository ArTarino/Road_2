package block1.taskTwo;
import java.util.Scanner;

public class scanNumbersOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        float value1 = scan.nextFloat();
        System.out.println("Введите второе число");
        float value2 = scan.nextFloat();
        System.out.println("Введите операцию для чисел (+,-,*,/)");
        char operation = scan.next().charAt(0);
        float result;

        switch (operation) {
            case '+':
                result = value1 + value2;
                break;
            case '-':
                result = value1 - value2;
                break;
            case '*':
                result = value1 * value2;
                break;
            case '/':
                if (value2 == 0) {
                    System.out.println("На ноль делить нельзя");
                    return;
                }
                result = value1 / value2;
                break;
            default:
                System.out.println("Неверная операция");
                return;
        }

        System.out.println("Результат: " + result);
    }
}
