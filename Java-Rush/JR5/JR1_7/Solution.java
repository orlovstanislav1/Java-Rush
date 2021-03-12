package JR5.JR1_7;

/*
Среднее арифмитическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int count = 0;
        int a = 0;

        do {
            a = Integer.parseInt(reader.readLine());

            if (a != -1) {
                count++;
                sum = sum + a;
            }
        }
        while (a != -1);

        System.out.println((double) sum / count);
    }
}
