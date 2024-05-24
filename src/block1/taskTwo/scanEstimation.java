package block1.taskTwo;
import java.util.Scanner;

public class scanEstimation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите свою оценку (2, 3, 4, 5)");
        int value = scan.nextInt();
        if (value == 5){
            System.out.println("Ваша оценка - отлино");
        } else if (value == 4){
            System.out.println("Ваша оценка - хорошо");
        } else if (value == 3){
            System.out.println("Ваша оценка - удовлетворительно");
        } else if (value == 2){
            System.out.println("Ваша оценка - неудовлетворительно");
        } else {
            System.out.println("Такой оценки нет");
        }
    }
}
