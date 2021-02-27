package JR3.JR1_17;

/*
План по захвату мира
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        String years = x.readLine();
        String name = x.readLine();

        //String sAge = x.readLine ();
        //int Age = Integer.parseInt ( sAge );
        //String name = x.readLine ();
        System.out.print(name + " захватит мир через " + years + " лет. Му-ха-ха!");
    }
}
