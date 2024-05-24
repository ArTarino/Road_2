package block1.strings;

public class stringCountWords {
    public static void main(String[] args) {
        String text = "Я ненавижу свою работу";
        int wordCount = countWords(text);
        System.out.println("Количество слов в строке: " + wordCount);
    }

    public static int countWords(String str) {
        int count = 0;
        boolean insideWord = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch) && !insideWord) {
                count++;
                insideWord = true;
            } else if (!Character.isLetter(ch)) {
                insideWord = false;
            }
        }
        return count;
    }
}
