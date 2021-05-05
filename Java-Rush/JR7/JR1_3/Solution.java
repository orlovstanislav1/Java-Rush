package JR7.JR1_3;

/*
Массив из строчек в обратном порядке
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] myArray = new String[9];
        for (int i = 0; i < 7; i++) {
            myArray[i] = reader.readLine();
        }
        for (int i = 0; i < 9; i++) {
            System.out.println(" " + myArray[i]);
        }
        System.out.println();
    }
}
