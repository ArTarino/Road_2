package block1.strings;

public class stringUpAndLow2 {
    public static void main(String[] args) {
        String text = "Меня зовут Кирилл Анатольевич";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isUpperCase(ch)) {
                text = text.substring(0, i) + Character.toLowerCase(ch) + text.substring(i + 1);
            }
        }
        System.out.println(text);
    }
}
