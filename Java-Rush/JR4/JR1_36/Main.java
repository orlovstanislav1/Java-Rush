package JR4.JR1_36;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Суммирование
 */
public class Main {
    public static void main(String[] args) throws Exception {
        int x = 0;
        int sum = 0;

        while (x != -1) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(reader.readLine());

            sum = sum + a;
            x = a;
        }
        System.out.println(sum);
    }
}