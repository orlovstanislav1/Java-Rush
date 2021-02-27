package JR4.JR1_14;

/*
Количество дней в году
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(x.readLine());
        if (a % 400 == 0) {
            System.out.println("количество дней в году: 366");
        } else if (a % 100 == 0) {
            System.out.println("количество дней в году: 365");
        } else if (a % 4 == 0) {
            System.out.println("количество дней в году: 366");
        } else {
            System.out.println("количество дней в году: 365");
        }
    }
}