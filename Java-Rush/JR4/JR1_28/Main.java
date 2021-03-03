package JR4.JR1_28;

/*
Четные числа
 */
public class Main {
    public static void main(String[] args) {
        int x = 0;
        for (int i = 0; i < 100; i++) {
            x++;
            if (x % 2 == 0) System.out.println(x);
        }
    }
}

