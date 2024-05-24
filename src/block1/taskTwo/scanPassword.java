package block1.taskTwo;
import java.util.Scanner;

public class scanPassword {
    public static void main(String[] args) {
        String password = "qwerty1234";
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваш пароль");
        String text1 = scan.next();
        if (text1.equals(password)){
            System.out.println("Пароль введен верно");
        } else {
            System.out.println("Вы ввели неверный пароль");
        }
    }
}
