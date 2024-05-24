package block1.taskTwo;
import java.util.Scanner;

public class scanStringComparing {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Напишите любую фразу");
        String s1 = scan1.next();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Напишите еще одну фразу");
        String s2 = scan2.next();
        if (s1.equals(s2)){
            System.out.println("Строки одинаковые");
        } else {
            System.out.println("Строки неодинаковые");
        }
    }
}
