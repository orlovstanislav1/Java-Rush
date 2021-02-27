package JR3.JR1_10;

/*
Конвертируем время
*/

public class Main {
    public static int convertToSeconds(int hour) {
        return hour * 3600;
    }

    public static void main(String[] args) {
        System.out.println(convertToSeconds(1));
        System.out.println(convertToSeconds(2));
    }
}