package JR4.JR1_8;

/*
        Хорошо или плохо?
        */

public class Main {
    public static void main(String[] args) {
        compare(3);//метод main вызывает метод compare
        compare(6);
        compare(5);
    }

    public static void compare(int number) {
        if (number < 5) { //первый if без else и а = 3 выполнив условие здесь идёт выполняться в не свой else
            System.out.println("Число меньше 5");
        }
        if (number > 5) { //второй if имеет свой else, поэтому при a = 6 else игнорируется
            System.out.println("Число больше 5");
        } else if (number == 5) { //этот else относится только ко второму if
            System.out.println("Число равно 5");
        }//напишите тут ваш код
    }
}

