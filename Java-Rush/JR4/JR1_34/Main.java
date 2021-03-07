package JR4.JR1_34;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Как-то средненько
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if ((a >= b && a <= c) || (a <= b && a >= c)) {
            System.out.println(a);
        } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}

