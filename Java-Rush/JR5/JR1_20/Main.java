package JR5.JR1_20;

/*
Сортировка трех чисел v1
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(x.readLine());
        int b = Integer.parseInt(x.readLine());
        int c = Integer.parseInt(x.readLine());
        int[] array = {a, b, c}; // создали массив целых чисел на 3 элемента и присвоили ему имя array
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}