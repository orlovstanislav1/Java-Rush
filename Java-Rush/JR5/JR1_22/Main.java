package JR5.JR1_22;

/*
Сортировка трех чисел v3
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(x.readLine());
        int b = Integer.parseInt(x.readLine());
        int c = Integer.parseInt(x.readLine());
        Integer[] myArray = new Integer[]{a, b, c};
        Arrays.sort(myArray, Collections.reverseOrder());
        System.out.print(Arrays.toString(myArray));
    }
}
