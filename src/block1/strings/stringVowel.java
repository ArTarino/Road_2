package block1.strings;

public class stringVowel {
    public static void main(String[] args) {
        String text = "открытость";
        int vowels = countVowels(text);
        System.out.println("Количество гласных букв в строке: " + vowels);
    }

    public static int countVowels(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char char1 = text.charAt(i);
            if (isVowel(char1)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isVowel(char ch) {
        return ch == 'ё' || ch == 'у' || ch == 'е' || ch == 'ы' || ch == 'а' || ch == 'о' || ch == 'э' || ch == 'я' || ch == 'и' || ch == 'ю';
    }
}
