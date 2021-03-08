package JR5.JR1_15;

/*
Правило треугольника
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(x.readLine());
        int b = Integer.parseInt(x.readLine());
        int c = Integer.parseInt(x.readLine());
        if ((a + b > c) && (c + b > a) && (a + c > b)) {
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольник не существует.");
        }
    }
}