package JR6.JR1_7;

/*
Среднее арифмитическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        int k = 0;

        while (true) {
            double a = Double.parseDouble(reader.readLine());

            if (a == -1)
                break;
            sum += a;
            k++;

        }
        System.out.println(sum / k);
    }
}
