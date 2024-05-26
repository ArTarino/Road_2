import java.util.Scanner;

public class taskFor {
    public static void main(String[] args) {
        // Пункт 1
        for (int x = 1; x <= 10; x++) {
            System.out.println(x);
        }
        System.out.println(" ");
        // Пункт 2
        for (int x1 = 10; x1 > 0; x1--) {
            System.out.println(x1);
        }
        // Пункт 3
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите любое число от 1 и выше");
        int N = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел от 1 до " + N + " равна " + sum);

        // Пункт 4
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите любое число от 1 выше");
        int N1 = scan1.nextInt();
        System.out.println("Четные числа от 1 до " + N1 + ": ");
        for (int j = 1; j <= N1; j++) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
        }

        // Пункт 5
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Введите любое число от 1 выше");
        int N2 = scan2.nextInt();
        System.out.println("Нечетные числа от 1 до " + N1 + ": ");
        for (int j = 1; j <= N1; j++) {
            if (j % 2 != 0) {
                System.out.println(j);
            }
        }

        // Пункт 6
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Введите любое число от 1 и выше:");
        int N3 = scan3.nextInt();
        int factorial = 1;
        for (int h = 1; h<=N3; h++) {
            factorial *= h;
        }
        System.out.println("Факториал числа " + N3 + " равен: " + factorial);

        // Пункт 7
        Scanner scan4 = new Scanner(System.in);
        System.out.println("Введите число любое число от 1 и выше");
        int N4 = scan4.nextInt();
        int one = 0;
        int next;
        System.out.println("Числа Фибоначчи до " + N4 + ":");
        System.out.print(one + " ");
        for (int two = 1; two <= N4; two = next) {
            System.out.print(two + " ");
            next = one + two;
            one = two;
            two = next;
        }

        // Пункт 8
        Scanner scan5 = new Scanner(System.in);
        System.out.println("Введите любое число");
        int N5 = scan5.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= N5 / 2; i++) {
            if (N5 % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Число " + N5 + " является простым числом");
        } else {
            System.out.println("Число " + N5 + " не является простым числом");
        }

        // Пункт 9
        Scanner scan6 = new Scanner(System.in);
        System.out.println("Введите любое число от 1 и выше");
        int N6 = scan6.nextInt();
        System.out.println("Таблица умножения до " + N6 + ":");

        for (int l = 1; l <= N6; l++) {
            for (int f = 1; f <= 10; f++) {
                System.out.println(l + " * " + f + " = " + (l * f));
            }
            System.out.println();
        }
    }
}
