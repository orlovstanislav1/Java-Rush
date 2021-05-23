package JR7.JR1_10;

/*
Самая длинная строка

1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
Требования:
1.	Инициализируй поле класса новым ArrayList<>
2.	Программа должна считывать 5 строк с клавиатуры и записывать их в список strings.
3.	Программа должна выводить самую длинную строку на экран.
4.	Если есть несколько строк с длиной равной максимальной,
 то нужно вывести каждую из них с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution1 {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        String big = "";
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() > big.length()) {
                big = strings.get(i);
            }
        }
        System.out.println(big);
    }
}