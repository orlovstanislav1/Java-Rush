package JR2.JR1_12;

/*
Минимум двух чисел Ӏ Java Syntax: 2 уровень, 8 лекция 7
*/

public class Main {
    public static int min(int a, int b) {
        int m2;
        if (a < b)
            m2 = a;
        else
            m2 = b;

        return m2;//напишите тут ваш код

    }

    public static void main(String[] args) {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
}
