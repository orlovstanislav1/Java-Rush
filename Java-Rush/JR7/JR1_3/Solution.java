package JR7.JR1_3;

/*
Массив из строчек в обратном порядке

создали массив на 10 строк,
программа считывает 8 строк для массива
прога выводит 10 строк с каждой новой строки
программа выводит массив - 10 элементов в обратном порядке
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] array = new String[10];
        for (int i = 0; i < 8; i++) {
            array[i] = reader.readLine();
        }
        for (int i = 0; i < 0; i--) {
            System.out.println(array[i]);
        }
    }
}
