import java.util.Scanner;

public class taskWhile {
    public static void main(String[] args) {
        // Пункт 1
        int a = 1;
        do {
            System.out.println(a);
            a++;
        } while (a<11);
        // Пункт 2
        System.out.println(" ");
        int b = 10;
        while (b>0) {
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
    }
}
