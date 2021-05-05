package JR7.JR1_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
        Массивный максимум
        */

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[19];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }// создай и заполни массив
        return array;
    }

    public static int max(int[] array) {
        int max = array[0];// найди максимальное значение   //предполагаем что 1-й элемент массива содержит число с минимальным значением (первый чтоб цикл шел нормально)
        for (int i = 1; i < array.length; i++) { //запускаем цикл, первый элемент не берем, так как считаем его содержимое - минимальным числом
            if (array[i] > max) //сравниваем условно-минимального значения с значением, элемента массива, индекс которого сейчас в цикле
                max = array[i]; //если значение меньше чем содержалось раньше в "min", то заменяем его еще меньшим
        }
        return max;
    }
}

/*
int min = list[0];  //предполагаем что 1-й элемент массива содержит число с минимальным значением (первый чтоб цикл шел нормально)
        for (int i = 1; i < list.length; i++)  //запускаем цикл, первый элемент не берем, так как считаем его содержимое - минимальным числом
        {
             if (list[i] < min)   //сравниваем условно-минимального значения с значением, элемента массива, индекс которого сейчас в цикле
                  min = list[i];  //если значение меньше чем содержалось раньше в "min", то заменяем его еще меньшим
 */