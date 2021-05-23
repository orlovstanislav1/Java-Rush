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

public class Solution {
    public static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>(); // 1. Создай список строк.
        for (int i = 0; i < 5; i++) { // 2. Считай с клавиатуры 5 строк и добавь в список.
            strings.add(reader.readLine());
        }
        int maxString = strings.get(0).length(); // 3. Используя цикл, найди самую длинную строку в списке.
        for (String string : strings) {
            if (string.length() > maxString)
                maxString = string.length();
        }
        // 4. Выведи найденную строку на экран.
        // 5. Если таких строк несколько, выведи каждую с новой строки.
        for (String s : strings)
            if (s.length() == maxString)
                System.out.println(s);
    }
}