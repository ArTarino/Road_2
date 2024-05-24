package block1.strings;

public class stringNoSpace {
    public static void main(String[] args) {
        String text = "Ненавижу свою работу";
        text = text.replaceAll(" ","");
        System.out.println(text);
    }
}
