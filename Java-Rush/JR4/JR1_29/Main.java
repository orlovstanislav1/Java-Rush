package JR4.JR1_29;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Рисуем прямоугольник
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine()); // в высоту
        int n = Integer.parseInt(reader.readLine()); // в ширину

        int i, j;
        for (i = 1; i <= m; i++) { // в высоту
            for (j = 0; j < n; j++) { // в ширину
                System.out.print(8);
            }
            System.out.println();
        }
    }
}

