package JR6.JR1_30;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Совершенствуем функциональность.
Программа вводит пять числа с клавиатуры и выводит минимальное из них
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, e);
        System.out.println("Minimum = " + minimum);
    }

    public static int min(int a, int b, int c, int d, int e) {
        int minimum = a < b ? a : b;
        minimum = minimum < c ? minimum : c;
        minimum = minimum < d ? minimum : d;
        minimum = minimum < e ? minimum : e;
        return minimum;
    }
}

