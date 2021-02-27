package JR4.JR1_16;

/*
Переходим дорогу вслепую
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(x.readLine());
        a = a % 5;
        if (a >= 0 && a < 3) {
            System.out.println("зеленый");
        } else if (a >= 3 && a < 4) {
            System.out.println("желтый");
        } else {
            System.out.println("красный");
        }
    }
}