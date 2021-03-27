package JR5.JR1_31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if (a <= 0) {
            return;
        }
        int maximum = 0;
        if (a > 0) {
            for (int i = 0; a > i; i++) {
                int s = Integer.parseInt(reader.readLine());
                if (s >= maximum)
                    maximum = s;
            }
            System.out.println(maximum);
        }
    }
}



