package JR5.JR1_19;

/*
Максимум четырех чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(x.readLine());
        int b = Integer.parseInt(x.readLine());
        int c = Integer.parseInt(x.readLine());
        int d = Integer.parseInt(x.readLine());
        int max1 = (a > b) ? a : b;
        int max2 = (c > d) ? c : d;
        int max = (max1 > max2) ? max1 : max2;
        System.out.println(max);

        /*int max;
        if (a >= b && a >= c && a >= d) {
            max = a;
            System.out.println ( a );
        }
        if (b >= a && b >= c && b >= d) {
            max = b;
            System.out.println ( b );
        }
        if (c >= a && c >= b && c >= d) {
            max = c;
            System.out.println ( c );
        }
        if (d >= a && d >= b && d >= c) {
            max = d;
            System.out.println ( d );
        }
        //int min = (a < b) ? a : b;
        //System.out.println ( min );
        */
    }
}
