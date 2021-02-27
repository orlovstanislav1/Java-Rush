package JR4.JR1_12;

/*
Положительное и отрицательное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(x.readLine());
        if (a > 0) {
            System.out.println(a * 2);
        } else if (a < 0) {
            a = (a + 1);
            System.out.println(a);
        } else {
            System.out.println(0);
        }
    }
}