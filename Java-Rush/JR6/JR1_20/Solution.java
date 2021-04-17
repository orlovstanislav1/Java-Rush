package JR6.JR1_20;

/*
Исправляем ошибки юности
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static int max = 100; //задается значение статической переменной max.

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String max = "The max is "; //один max это строка, а ниже второй max это новые цифры
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        Solution.max = a > b ? a : b; //задается новое значение переменной (98).
                /*
        max у нас ссылается на объект типа Стринг (который объявлен выше как String
        max, который в свою очередь затер возможность использования переменной
        int max = 100 в методе main , ведь теперь переменная max это строка, но это
        для конкретного метода действует)

        А строке мы не можем просто так присвоить другие типы.
Вот так:
max = String.valueOf(a > b ? a : b);
При этом статическое поле класса int max мы все-равно можем использовать, даже если
перетерли другой переменной это имя, через обращение ИмяКласса.имяПеременной,
(max + Solution.max) это уже будет две разные переменные мах.
Одна это стринг, другая это собственно 100

Статические переменные здесь не нужны, если валидатор не будет принимать задачу
которая по всем параметрам проходит, первое что нужно будет делать, это убирать
статические переменные.
         */
        System.out.println(max + Solution.max);
    }

}