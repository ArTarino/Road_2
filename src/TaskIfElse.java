import java.time.LocalTime;
import java.util.Scanner;

public class TaskIfElse {
    public static void main(String[] args) {
        // Пункт 1
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите любое число");
        int value = scan.nextInt();
        if ((value % 2) == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }

        // Пункт 2
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите первое число");
        int value1 = scan1.nextInt();
        System.out.println("Введите второе число");
        int value2 = scan.nextInt();
        if (value1 > value2) {
            System.out.println("Это число наибольшее из двух введенных: " + value1);
        } else if (value2 > value1) {
            System.out.println("Это число наибольшее из двух введенных: " + value2);
        } else {
            System.out.println("Оба числа равны друг другу");
        }

        //Пункт 3
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Введите ваш возраст");
        int age = scan2.nextInt();
        if (age >= 18) {
            System.out.println("Вы совершеннолетний");
        } else {
            System.out.println("Вы несовершеннолетний");
        }

        // Пункт 4
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Введите свою оценку (2, 3, 4, 5)");
        int estimation = scan3.nextInt();
        if (estimation == 5){
            System.out.println("Ваша оценка - отлино");
        } else if (estimation == 4){
            System.out.println("Ваша оценка - хорошо");
        } else if (estimation == 3){
            System.out.println("Ваша оценка - удовлетворительно");
        } else if (estimation == 2){
            System.out.println("Ваша оценка - неудовлетворительно");
        } else {
            System.out.println("Такой оценки нет");
        }

        // Пункт 5
        Scanner scan4 = new Scanner(System.in);
        System.out.println("Введите любой год от н. э.");
        int year = scan4.nextInt();
        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год является не весокосным");
        }

        // Пункт 6
        Scanner scan5 = new Scanner(System.in);
        System.out.println("Напишите любую фразу");
        String s1 = scan5.next();
        Scanner scan6 = new Scanner(System.in);
        System.out.println("Напишите еще одну фразу");
        String s2 = scan6.next();
        if (s1.equals(s2)){
            System.out.println("Строки одинаковые");
        } else {
            System.out.println("Строки неодинаковые");
        }

        // Пункт 7
        String password = "qwerty1234";
        Scanner scan7 = new Scanner(System.in);
        System.out.println("Введите ваш пароль");
        String text1 = scan7.next();
        if (text1.equals(password)){
            System.out.println("Пароль введен верно");
        } else {
            System.out.println("Вы ввели неверный пароль");
        }

        // Пункт 8
        Scanner scan8 = new Scanner(System.in);
        System.out.println("Введите первое число");
        float num1 = scan8.nextFloat();
        System.out.println("Введите второе число");
        float num2 = scan8.nextFloat();
        System.out.println("Введите операцию для чисел (+,-,*,/)");
        char operation = scan8.next().charAt(0);
        float result;

        if (operation == '+') {
            result = num1 + num2;
        } else if (operation == '-') {
            result = num1 - num2;
        } else if (operation == '*') {
            result = num1 * num2;
        } else if (operation == '/') {
            if (num2 != 0) {
            result = num1 / num2;
        } else {
                System.out.println("На ноль делить нельзя");
                return;
            }
        } else {
            System.out.println("Неверная операция");
            return;
        }
        System.out.println("Результат операции с вашими числами: " + result);

        // Пункт 9
        LocalTime now = LocalTime.now();
        int hour = now.getHour();

        if (hour >= 5 && hour < 12) {
            System.out.println("Сейчас утро");
        } else if (hour >= 12 && hour < 18) {
            System.out.println("Сейчас день");
        } else if (hour >= 18 && hour < 22) {
            System.out.println("Сейчас вечер");
        } else {
            System.out.println("Сейчас ночь");
        }

        // Пункт 10
        Scanner scan9 = new Scanner(System.in);
        System.out.println("Введите любое число");
        int number = scan9.nextInt();
        if (number < 0){
            System.out.println("Число находится в диапозоне (-Ꝏ;0)");
        } else if (number == 0){
            System.out.println("Ваше число не пренадлежит никакому диапозону");
        } else if (number > 0 && number <100){
            System.out.println("Ваше число находится в диапозоне (0;100)");
        } else {
            System.out.println("Ваше число находится в диаозоне [100;Ꝏ+)");
        }
    }
}
