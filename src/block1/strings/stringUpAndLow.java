package block1.strings;

public class stringUpAndLow {
    public static void main(String[] args) {
        String text = "Меня зовут Кирилл Анатольевич";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLowerCase(ch)) {
                text = text.substring(0, i) + Character.toUpperCase(ch) + text.substring(i + 1);
            }
        }
        System.out.println(text);
    }
}