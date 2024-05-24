package block1.taskTwo;
import java.time.LocalTime;

public class realTime {
    public static void main(String[] args) {
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
    }
}
