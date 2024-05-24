package block1.taskTwo;
import java.util.Scanner;

public class scanAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваш возраст");
        int value = scan.nextInt();
        if (value >= 18) {
            System.out.println("Вы совершеннолетний");
        } else {
            System.out.println("Вы несовершеннолетний");
        }
    }
}
