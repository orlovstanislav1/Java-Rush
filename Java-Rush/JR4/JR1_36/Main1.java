package JR4.JR1_36;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Суммирование
 */
public class Main1 {
    public static void main(String[] args) throws Exception {
        int counter = 0;

        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(reader.readLine());

            counter = counter + a;
            if (a == -1)
                break;
        }
        System.out.println(counter);
    }
}