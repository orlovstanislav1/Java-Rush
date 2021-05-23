package JR7.JR1_8;

/*
Улицы и дома

создать массив на 15 чисел, ввести в него значения с клавы, индекс элемента - это номер
дома, а знаение элемента - это число жителей дома, дома с нечетными номерами на одной
стороне улицы, с четными на другой стороне. Где больше проживает людей?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        int even = 0; //четное
        int odd = 0; //нечетное
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 & i == 0) {
                even = even + array[i];
            } else if (i % 2 != 0) {
                odd = odd + array[i];
            }
        }
        if (odd > even) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
    }
}
