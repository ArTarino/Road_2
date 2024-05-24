package block1.strings;

public class stringConsonant {
    public static void main(String[] args) {
        String text = "открытость";
        int consonants = countConsonants(text);
        System.out.println("Количество гласных букв в строке: " + consonants);
    }

    public static int countConsonants(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char char1 = text.charAt(i);
            if (isConsonant(char1)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isConsonant(char ch) {
        return ch != 'ё' && ch != 'у' && ch != 'е' && ch != 'ы' && ch != 'а' && ch != 'о' && ch != 'э' && ch != 'я' && ch != 'и' && ch != 'ю' && ch != 'ь';
    }
}
