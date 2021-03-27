package JR5.JR1_28;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Консоль-копилка
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        while (true) {
            String s = buffer.readLine();
            if (s.equals("exit")) {
                System.out.println(sum);
                return;
            }
            int number = Integer.parseInt(s);
            sum = sum + number;
        }
    }
}

