package JR2.JR1_5;

/*
Наш первый конвертер!
*/

public class Main {
    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(41));
    }

    public static double convertCelsiusToFahrenheit(int celsius) {
        double fahrenheit = (9 / 5.0) * celsius + 32;
        return fahrenheit;
    }
}
