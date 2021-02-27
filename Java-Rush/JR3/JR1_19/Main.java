package JR3.JR1_19;

/*
        Скромность украшает программиста
        */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        String name = x.readLine();
        System.out.print(name + " зарабатывает $5,000. Ха-ха-ха!");
    }
}
