package JR3.JR1_22;

/*
Полнометражная картина
*/

public class Main {
    public static void main(String[] args) {
        System.out.println(getMetreFromCentimetre(243));
    }

    public static double getMetreFromCentimetre(double centimetre) {
        double getMetreFromCentimetre = centimetre / 100;
        return getMetreFromCentimetre;
    }
}
