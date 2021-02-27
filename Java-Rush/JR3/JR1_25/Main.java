package JR3.JR1_25;

/*
Сумма цифр трехзначного числа
*/

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //int multiply = number * 5*4*6;
        //return 5 + 4 + 6;

        //int n1 = number / 100;
        //int n2 = (number - (n1 * 100)) / 10;
        //int n3 = number - ((n1 * 100) + (n2 * 10));
        //return n1 + n2 + n3;

        return (number / 100) + (number % 10) + ((number % 100) / 10);
    }
}