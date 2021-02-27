package JR4.JR1_13;

/*
День недели
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(x.readLine());
        if (a > 0 && a < 2) {
            System.out.println("понедельник");
        } else if (a > 1 && a < 3) {
            System.out.println("вторник");
        } else if (a > 2 && a < 4) {
            System.out.println("среда");
        } else if (a > 3 && a < 5) {
            System.out.println("четверг");
        } else if (a > 4 && a < 6) {
            System.out.println("пятница");
        } else if (a > 5 && a < 7) {
            System.out.println("суббота");
        } else if (a == 7) {
            System.out.println("воскресенье");
        } else {
            System.out.println("такого дня недели не существует");
        }
    }
}