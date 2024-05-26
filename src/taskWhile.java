import java.util.Scanner;

public class taskWhile {
    public static void main(String[] args) {
        // Пункт 1
        int a = 1;
        do {
            System.out.println(a);
            a++;
        } while (a < 11);
        // Пункт 2
        System.out.println(" ");
        int b = 10;
        while (b > 0) {
            System.out.println(b);
            b--;
        }
        // Пункт 3
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите любое число");
        int N = scan.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= N) {
            sum += i;
            i++;
        }
        System.out.println("Сумма чисел от 1 до " + N + " равна " + sum);

        // Пункт 4
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите любое число от 1 выше");
        int N1 = scan1.nextInt();
        System.out.println("Четные числа от 1 до " + N1 + ": ");
        int j = 1;
        while (j <= N1) {
            if (j % 2 == 0) {
                System.out.println(j);
            }
            j++;
        }

        // Пункт 5
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Введите любое число от 1 выше");
        int N2 = scan2.nextInt();
        System.out.println("Нечетные числа от 1 до " + N2 + ": ");
        int h = 1;
        while (h <= N2) {
            if (h % 2 != 0) {
                System.out.println(h);
            }
            h++;
        }

        // Пункт 6
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Введите любое число от 1 и выше:");
        int N3 = scan3.nextInt();
        int factorial = 1;
        int g = 1;
        while (g<=N3) {
            factorial *= g;
            g++;
        }
        System.out.println("Факториал числа " + N3 + " равен: " + factorial);

        // Пункт 7
        Scanner scan4 = new Scanner(System.in);
        System.out.println("Введите число любое число от 1 и выше");
        int N4 = scan4.nextInt();
        int one = 0;
        int two = 1;
        int next;
        System.out.println("Числа Фибоначчи до " + N4 + ":");
        System.out.print(one + " ");

        while (two<=N4) {
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
        int k = 2;
        while (k <= N5 / 2) {
            if (N5 % k == 0) {
                isPrime = false;
                break;
            }
            i++;
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

        int l = 1;
        while (l <= N6) {
            int f = 1;
            while (f <= 10) {
                System.out.println(l + " * " + f + " = " + (l * f));
                f++;
            }
            System.out.println();
            l++;
        }
    }
}