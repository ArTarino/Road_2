package block1.SwitchCase;
import java.util.Scanner;

public class tasksSwitchCase {
    public static void main(String[] args) {
        // Пункт 1
        int x = 5;
        switch (x){
            case 1 -> System.out.println("понедельник");
            case 2 -> System.out.println("вторник");
            case 3 -> System.out.println("среда");
            case 4 -> System.out.println("четверг");
            case 5 -> System.out.println("пятница");
            case 6 -> System.out.println("суббота");
            case 7 -> System.out.println("воскресенье");
            default -> System.out.println("Вы ввели не то число");
        }
        // Пункт 2 и 10 (по смыслу одинаковые, объеденил в одно)
        char letter = 'b';
        switch (letter){
            case 'ё': case 'у': case 'е': case 'ы': case 'а': case 'о': case 'э': case 'я': case 'и': case 'ю':
                System.out.println("Это глассная буква");
                break;
            case 'e': case 'y': case 'u': case 'i': case 'o': case 'a':
            case 'ь': case 'ъ':
                System.out.println("Не является гласной или согласной буквой");
                break;
            default: System.out.println("Это согласная буква");
        }
        // Пункт 3
        String s = "май";
        switch (s){
            case "январь" -> System.out.println("В январе 31 день");
            case "февраль" -> System.out.println("В феврале 28(29) дней");
            case "март" -> System.out.println("В марте 31 день");
            case "апрель" -> System.out.println("В апреле 30 дней");
            case "май" -> System.out.println("В мае 31 день");
            case "июнь" -> System.out.println("В июне 30 дней");
            case "июль" -> System.out.println("В июле 31 день");
            case "август" -> System.out.println("В августе 30 дней");
            case "сентябрь" -> System.out.println("В сентябре 30 дней");
            case "октябрь" -> System.out.println("В октябре 31 день");
            case "ноябрь" -> System.out.println("В ноябре 30 дней");
            case "декабрь" -> System.out.println("В декабре 31 день");
        }
        // Пункт 4
        int a = 4;
        switch (a){
            case 2 -> System.out.println("неудовлетворительно");
            case 3 -> System.out.println("удовлетворительно");
            case 4 -> System.out.println("хорошо");
            case 5 -> System.out.println("отлично");
            default -> System.out.println("Оценки не предполагают таких цифр");
        }
        // Пункт 5
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите любое число");
        int x1 = scan.nextInt();
        switch (x1 % 2){
            case 0:
                System.out.println("Квадрат числа " + x1 + " равен " + (x1*x1));
                break;
            case 1:
                System.out.println("Куб числа " + x1 + " равен " + (x1*x1*x1));
                break;
        }
        // Пункт 6
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите букву из русского алфавита:");
        char letter1 = scan1.next().charAt(0);
        switch (letter1) {
            case 'а': case 'б': case 'в': case 'г': case 'д':
            case 'е': case 'ё': case 'ж': case 'з': case 'и':
            case 'й': case 'к': case 'л': case 'м': case 'н':
            case 'о': case 'п': case 'р': case 'с': case 'т':
            case 'у': case 'ф': case 'х': case 'ц': case 'ч':
            case 'ш': case 'щ': case 'ъ': case 'ы': case 'ь':
            case 'э': case 'ю': case 'я':
                System.out.println("Это строчная буква");
                break;
            case 'А': case 'Б': case 'В': case 'Г': case 'Д':
            case 'Е': case 'Ё': case 'Ж': case 'З': case 'И':
            case 'Й': case 'К': case 'Л': case 'М': case 'Н':
            case 'О': case 'П': case 'Р': case 'С': case 'Т':
            case 'У': case 'Ф': case 'Х': case 'Ц': case 'Ч':
            case 'Ш': case 'Щ': case 'Ъ': case 'Ы': case 'Ь':
            case 'Э': case 'Ю': case 'Я':
                System.out.println("Это прописная буква");
                break;
            default:
                System.out.println();
        }
        // Пункт 7
        int a2 = 1;
        switch (a2){
            case 1 -> System.out.println("один");
            case 2 -> System.out.println("два");
            case 3 -> System.out.println("три");
            case 4 -> System.out.println("четыре");
            case 5 -> System.out.println("пять");
            case 6 -> System.out.println("шесть");
            case 7 -> System.out.println("семь");
            case 8 -> System.out.println("восемь");
            case 9 -> System.out.println("девять");
            case 10 -> System.out.println("десять");
        }
        // Пункт 8
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Введите любое число");
        int x3 = scan2.nextInt();
        switch(value1(x3)) {
            case 1:
                System.out.println("Число положительное");
                break;
            case -1:
                System.out.println("Число отрицательное");
                break;
            default:
                System.out.println("Число равно нулю");
        }
        // Пункт 9
        Scanner scan3 = new Scanner(System.in);
        System.out.println("ведите любое число");
        int f = scan3.nextInt();
        switch(value2(f)){
            case 0 -> System.out.println("Это четное число");
            case 1 -> System.out.println("Это нечетное число");
        }

    }
    public static int value1(int b1) {
        if (b1 > 0) {
            return 1;
        } else if (b1 < 0) {
            return -1;
        } else {
            return 0;
        }
    }
    public static int value2(int b2){
        return b2 % 2;
    }

}