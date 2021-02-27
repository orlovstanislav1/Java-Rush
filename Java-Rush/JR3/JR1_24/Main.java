package JR3.JR1_24;

/*
Финансовые ожидания
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        String name1 = x.readLine();
        System.out.print("Я буду зарабатывать $" + name1 + " в час");
    }
}
