package JR3.JR1_13;

/*
Таблица умножения Ӏ Java Syntax: 3 уровень, 6 лекция
*/

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
//Создаем цикл for на повторение от 1 до 11;
//Внутри создаем еще один цикл на столько же повторение;
//Выводим на экран результат умножения имеющихся чисел в строку через пробел;
//После внутреннего цикла переводим строку;
//Возвращаемся в начало внешнего цикла и повторяем всё вышеперечисленное столько раз, сколько мы указали.


/*        int i = 2;
        while(i<11) {
        int b = 2;
        while (b < 11) {
        int enter = i*b;
        System.out.print(enter + " ");
        System.out.print(" ");
        b++;
        }
        System.out.println("");
        i++;
        }
        }
        }


        int i = 1;
        while(i<11) {
        System.out.println(i + " " + i*2 + " " + i*3 + " " + i*4 + " " + i*5 + " " + i*6 + " " + i* 7 + " " + i*8 + " " + i*9 + " " + i*10);
        i++;
        }
        }
        }

 */