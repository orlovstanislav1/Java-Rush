package JR3.JR1_2;

/*
Обмен валют
*/

public class Main {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(50, 1.0));
        System.out.println(convertEurToUsd(60, 0.89));
    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        double usd = eur * exchangeRate;
        return usd;
    }
}
