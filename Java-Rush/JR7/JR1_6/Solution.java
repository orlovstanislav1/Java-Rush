package JR7.JR1_6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Один большой массив и два маленьких

создали массив на 20 чисел,
программа считывает числа для массива
создали 2 массива на 10 чисел каждый,
скопировать большой массив в два маленьких - 2 по 10
вывести второй маленький массив на экран, каждое значение с новой строки
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array1 = new int[20];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = Integer.parseInt(reader.readLine());
        }
        System.out.println("Массив источник = " + Arrays.toString(array1));
        int[] array2 = new int[10];
        int[] array3 = new int[10];

        for (int i = 0; i < 10; i++) {
            array2[i] = array1[i];
            array3[i] = array1[i + 10];
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(array2[i]);
        }
    }
}
