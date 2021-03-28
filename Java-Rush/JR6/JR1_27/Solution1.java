package JR6.JR1_27;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
Вывести на экран сегодняшнюю дату
 */
public class Solution1 {
    public static void main(String[] args) {
        Date dateNow = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy MM dd");
        System.out.println(simpleDateFormat.format(dateNow));
    }
}
