package JR3.JR1_22;

/*
Полнометражная картина
*/

public class Main {
    public static void main(String[] args) {
        System.out.println(getMetreFromCentimetre(243));
    }

    public static int getMetreFromCentimetre(int centimetre) {
        int getMetreFromCentimetre = centimetre / 100;
        return getMetreFromCentimetre;
    }
}
