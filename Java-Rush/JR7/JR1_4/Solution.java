package JR7.JR1_4;

/*
Общение одиноких массивов
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static int even; // кол-во четных чисел
    public static int odd; //кол-во нечетных чисел

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] strings = new String[10];
        int[] ints = new int[10];

        for (int i = 0; i < 10; i++) {
            strings[i] = reader.readLine();//здесь закрываете первый цикл, в котором записывали строки
            ints[i] = strings[i].length();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(ints[i]);
        }
    }
}
