package JR2.JR1_17;

/*
Печатаем трижды
*/

public class Main {
    public static void print3(String txt) {
        for (int x = 0; x < 3; x++) {
            System.out.print(txt + " ");
        }
    }

    public static void main(String[] args) {
        print3("I love you!");
        print3("file");

    }
}
