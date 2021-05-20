package JR7.JR1_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* переверни массив*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = array.length; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
