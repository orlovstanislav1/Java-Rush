package JR5.JR1_25;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Хорошего много не бывает
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();
        int count = Integer.parseInt(reader.readLine());

        while (count > 0) {
            System.out.println(word);
            count--;
        }
    }
}
