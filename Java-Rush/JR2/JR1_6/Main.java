package JR2.JR1_6;

/*
Считаем длину окружности
*/

public class Main {
    public static strictfp void main(String[] args) {
        printCircleLength(5);
    }

    public static strictfp void printCircleLength(int radius) {
        System.out.println(2 * Math.PI * radius);
    }
}
