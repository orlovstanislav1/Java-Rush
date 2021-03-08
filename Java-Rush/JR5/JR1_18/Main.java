package JR5.JR1_18;

/*
Минимум двух чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(x.readLine());
        int b = Integer.parseInt(x.readLine());
        //if (a < b) {
        //    System.out.println ( a );
        //}
        //if (b < a) {
        //    System.out.println ( b );
        //}
        //if (a == b) {
        //    System.out.println ( a );
        //}
        int min = (a < b) ? a : b;
        System.out.println(min);
    }
}
