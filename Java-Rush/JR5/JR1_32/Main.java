package JR5.JR1_32;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Письмо счастья
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        int i;
        for (i = 0; i < 10; i++) { // в ширину
            System.out.println(name + " любит меня.");
        }
    }
}

