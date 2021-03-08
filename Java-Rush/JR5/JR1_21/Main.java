package JR5.JR1_21;

/*
Сортировка трех чисел v2
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(x.readLine());
        int b = Integer.parseInt(x.readLine());
        int c = Integer.parseInt(x.readLine());
        if (a <= b && b <= c) {
            System.out.println(a + " " + b + " " + c);
        } else if (b <= a && a <= c) {
            System.out.println(b + " " + a + " " + c);
        } else if (c <= a && a <= b) {
            System.out.println(c + " " + a + " " + b);
        } else if (a <= c && c <= b) {
            System.out.println(c + " " + a + " " + b);
        } else if (c <= b && b <= a) {
            System.out.println(c + " " + a + " " + b);
        } else if (b <= c && c <= a) {
            System.out.println(c + " " + a + " " + b);
        }
    }
}
