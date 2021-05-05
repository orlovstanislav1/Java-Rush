package JR7.JR1_9;

/*
Класс ConsoleReader
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        String m = buffer.readLine(); //строка
        return m;//
    }

    public static int readInt() throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));//напишите тут ваш код
        int m = Integer.parseInt(buffer.readLine()); //число
        return m;
    }

    public static double readDouble() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double x = Double.parseDouble(reader.readLine()); //double
        return x;
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean bul = Boolean.parseBoolean(reader.readLine());//boolean
        return bul;
    }

    public static void main(String[] args) throws Exception {

    }
}
