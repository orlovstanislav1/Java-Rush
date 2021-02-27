package JR2.JR1_14;

/*
Минимум трех чисел
*/

public class Main {
    public static int min(int a, int b, int c) {
        //return Math.min ( Math.min ( a, b ), c );//один вариант
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
