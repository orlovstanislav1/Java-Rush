package JR3.JR1_12;

/*
Мама мыла раму
*/

public class Main {
    public static void main(String[] args) {
        //String a = "Мама";
        //String b = "Мыла";
        //String c = "Раму";
        //System.out.println ( a + b + c );
        //System.out.println ( b + c + a );
        //System.out.println ( c + a + b );
        //System.out.println ( c + b + a );
        //System.out.println ( a + c + b );
        //System.out.println ( b + a + c );

        String[] s = new String[3];
        s[0] = "Мама";
        s[1] = "Mыла";
        s[2] = "Раму";

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                for (int z = 0; z < 3; z++)
                    if (i != j && i != z && j != z)
                        System.out.println(s[i] + s[j] + s[z]);
    }
}
