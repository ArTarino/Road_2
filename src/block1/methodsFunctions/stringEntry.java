package block1.methodsFunctions;

public class stringEntry {
    //
    public static void main(String[] args) {
        String text1 = "перпендикулярность";
        char char1 = 'п';
        int entry = text1.length() - text1.replace(String.valueOf(char1), "").length();
        System.out.println("Количество вхождений символа в строку: " + entry);
    }
}
