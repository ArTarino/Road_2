package block1.methodsFunctions;

public class divNumbers {
    public static void main(String[] args) {
        float a1 = 10;
        float a2 = 7;
        float division = divisionNumbers(a1, a2);
        division = Math.round(division*100);
        division = division/100;
        System.out.println(division);
    }

    public static float divisionNumbers(float a1, float a2) {
        return a1 / a2;
    }
}
