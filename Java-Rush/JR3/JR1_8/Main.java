package JR3.JR1_8;

/*
Сумма 5 чисел
*/

public class Main {
    public static void main(String[] args) {
        //System.out.println ( 1 );
        //System.out.println ( 1 + 2 );
        //System.out.println ( 1 + 2 + 3 );
        //System.out.println ( 1 + 2 + 3 + 4 );
        //System.out.println ( 1 + 2 + 3 + 4 + 5 );
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
            System.out.println(sum);
        }
    }
}
