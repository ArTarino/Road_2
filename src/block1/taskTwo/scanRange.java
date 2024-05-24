package block1.taskTwo;
import java.util.Scanner;

public class scanRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите любое число");
        int value = scan.nextInt();
        if (value < 0){
            System.out.println("Число находится в диапозоне (-Ꝏ;0)");
        } else if (value == 0){
            System.out.println("Ваше число не пренадлежит никакому диапозону");
        } else if (value > 0 && value <100){
            System.out.println("Ваше число находится в диапозоне (0;100)");
        } else {
            System.out.println("Ваше число находится в диаозоне [100;Ꝏ+)");
        }
    }
}
