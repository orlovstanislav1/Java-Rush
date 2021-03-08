package JR5.JR1_35;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Как-то средненько v2.0
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        System.out.println(a + b + c - max - min);
    }
}

