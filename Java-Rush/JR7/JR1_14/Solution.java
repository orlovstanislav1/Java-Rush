package JR7.JR1_14;

/*
В начало списка

1. Создай список строк в методе main.
2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(0, reader.readLine());
        }
        /*
        for (String str : list) {    //можно и так
            System.out.println(str);
        }
        */
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}