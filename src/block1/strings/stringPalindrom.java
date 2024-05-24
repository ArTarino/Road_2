package block1.strings;

public class stringPalindrom {
    public static void main(String[] args) {
        String text = "шалаш";

        if(isPalindrome(text)) {
            System.out.println("Слово "+ text + " является палиндромом");
        } else {
            System.out.println("Слово "+ text + " не является палиндромом");
        }
    }

    public static boolean isPalindrome(String text) {
        int i = 0;
        int j = text.length() - 1;
        while(i < j) {
            if(text.charAt(i) != text.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
