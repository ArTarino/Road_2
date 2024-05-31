package block1.AlishevPractiseFinalTask;
import java.util.Scanner;

public class AlishevSwitch {
    public static void main(String[] args) {
        // Пункт 1
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите город, а я скажу, какая это страна");
        while (true) {
            String str = scan.nextLine();
            if (str.equals("Stop"))
                break;

            switch (str) {
                case "Москва": case "Владивосток": case "Ростов":
                    System.out.println("Это Россия");
                    break;
                case "Рим": case "Милан": case "Турин":
                    System.out.println("Это Италия");
                    break;
                case "Ливерпуль": case "Манчестер": case "Лондон":
                    System.out.println("Это Англия");
                    break;
                case "Берлин": case "Мюнхен": case "Кёльн":
                    System.out.println("Это Германия");
                    break;
                default:
                    System.out.println("Неизвестная страна");
            }
        }

        // Пункт 2
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите делитель и делимое через пробел, а я покажу резуьтат операции");
        while (true) {
            double num1 = scan1.nextDouble();
            double num2 = scan1.nextDouble();
            if (num2 == 0)
                break;
            System.out.printf("%.2f", num1 / num2);
            System.out.println(" ");

        }

        // Пункт 3
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Введите делитель и делимое через пробел 5 раз, а я покажу резульат операции");
        int number = 0;
        while (number < 5) {
            double num3 = scan2.nextDouble();
            double num4 = scan2.nextDouble();
            number++;

            if (num4 == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.printf("%.2f", num3 / num4);
            System.out.println(" ");
        }
    }
}
