package block1.AlishevPractiseFinalTask;

public class AlishevTaskForWhile {
    public static void main(String[] args) {
        // Пункт 1
        int x = 0;
        while (x < 10) {
            System.out.print("JAVA ");
            x++;
        }
        System.out.println(" ");

        // Пункт 2
        for (int y = 0; y < 10; y++) {
            System.out.print("JAVA ");
        }
        System.out.println(" ");

        // Пункт 3
        int z = 0;
        while (z < 10) {
            System.out.println("JAVA ");
            z++;
        }

        // Пункт 4
        int year = 1980;
        while (year <= 2020) {
            System.out.println("Олимпиада " + year + " года");
            year += 4;
        }
        System.out.println(" ");

        // Пункт 5
        for (int year1 = 1980; year1 <= 2020; year1 += 4) {
            System.out.println("Олимпиада " + year1 + " года");
        }

        // Пункт 6
        int k = 4;
        for (int i = 1; i < 10; i++) {
            System.out.println(i + " x " + k + " = " + i*k);
        }
    }
}