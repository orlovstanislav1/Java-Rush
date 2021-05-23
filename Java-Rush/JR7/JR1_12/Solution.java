package JR7.JR1_12;

/*
Выражаемся покороче

1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }

        String shortest = list.get(0);
        // Находим самую короткую строку
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length() < shortest.length()) //берем все элементы из массива
                //и сверяем с первым элементом, если он меньше - выводим его
                shortest = list.get(i);
        }

        // Отбираем все строки такой же длины
        ArrayList<String> shortestStrings = new ArrayList<>();
        for (String string : list) {
            if (string.length() == shortest.length())
                shortestStrings.add(string);
        }

        for (String string : shortestStrings) {
            System.out.println(string);
        }
    }
}