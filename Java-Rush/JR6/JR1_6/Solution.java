package JR6.JR1_6;

/*
Чётные и нечётные циферки
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static int even; // кол-во четных чисел
    public static int odd; //кол-во нечетных чисел

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(buffer.readLine()); // х это число вводимое с клавиатуры

        while (x > 0) { // пока х>0 выполняется следующее:
            if (x % 2 == 0) // если х делится на 2 без остатка, то
            {
                even++; //кол-во четных чисел увеличивается на один
            } else odd++; // иначе на один увел. кол-во нечетных чисел
            x = x / 10; // число х делится на 10 для того, чтобы определить четность числа на порядок выше.....
            // А на 10 делим, что бы после каждой итерации количество разрядов уменьшалось и так до тех пор, пока не
            // дойдете до 0 (условие выхода из цикла)

        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
