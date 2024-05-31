package block1.AlishevPractiseFinalTask;
import java.util.Scanner;

public class AlishevTaskIf {
    public static void main(String[] args) {
        // Пункт 1
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите любое целое число, которое будет обозначать количество этажей в здании");
        int N = scan.nextInt();
        if (N >= 1 && N <= 4) {
            System.out.println("Дом малоэтажный");
        } else if (N >= 5 && N <= 8) {
            System.out.println("Дом среднеэтажный");
        } else if (N >= 9) {
            System.out.println("Дом многоэтажный");
        } else {
            System.out.println("Ошибка ввода");
        }

        // Пункт 2
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scan1.nextInt();
        System.out.println("Введите второе число");
        int b = scan1.nextInt();

        if (a > b) {
            System.out.println("Некорректный ввод");
        } else {
            System.out.println("Последовательность чисел между " + a + " и " + b + ", делящихся без остатка на 5 и не делящихся без остатка на 10: ");
            for (int i = a; i <= b; i++) {
                if (i % 5 == 0 && i % 10 != 0) {
                    System.out.print(i + " ");
                }
            }
        }

        System.out.println(" ");
        // Пункт 3
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a1 = scan2.nextInt();
        System.out.println("Введите второе число");
        int b1 = scan1.nextInt();

        if (a1 > b1) {
            System.out.println("Некорректный ввод");
        } else {
            System.out.println("Последовательность чисел между " + a1 + " и " + b1 + ", делящихся без остатка на 5 и не делящихся без остатка на 10: ");
            int j = a;
            while (j <= b) {
                if (j % 5 == 0 && j % 10 != 0) {
                    System.out.print(j + " ");
                }
                j++;
            }
        }

        System.out.println(" ");
        // Пункт 4
        Scanner scan3 = new Scanner(System.in);
        double x = scan3.nextDouble();
        double y = 0;

        if (x >= 5) {
            y = ((x*x) - 10) / (x + 7);
        } else if (x > -3 && x < 5) {
            y = (x + 3) * ((x*x) - 2);
        } else {
            y = 420;
        }
        y = Math.round(y*100);
        y = y/100;
        System.out.println("Если x = " + x + ", то y равно " + y);
    }
}

