package JR3.JR1_18;

/*
Предсказание на будущее
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        String name = x.readLine();
        String years1 = x.readLine();
        String years2 = x.readLine();
        System.out.print(name + " получает " + years1 + " через " + years2 + " лет.");
    }
}
