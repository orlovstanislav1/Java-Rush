package JR5.JR1_9;

/*
Ближайшее к 10
*/

public class Main {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        System.out.println(abs(a - 10) <= abs(b - 10) ? a : b);
    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}
