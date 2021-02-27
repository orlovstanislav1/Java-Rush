package JR2.JR1_13;

//Минимум двух чисел Ӏ Java Syntax: 2 уровень, 8 лекция 7

public class Main {
    public static int min(int a, int b) {
        return Math.min(a, b);//напишите тут ваш код
    }

    public static void main(String[] args) {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
}