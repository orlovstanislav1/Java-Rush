package JR6.JR1_27;

/*
Вывести на экран сегодняшнюю дату
 */
public class Solution {
    public static void main(String[] args) {

        TimeDate timeDate = new TimeDate(21, 02, 2014);
        System.out.println(timeDate);
    }

    public static class TimeDate {
        int min;
        int month;
        int year;

        public TimeDate(int min, int month, int year) {
            this.min = min;
            this.month = month;
            this.year = year;
        }

        public String toString() {
            return (min + " " + month + " " + year);
        }
    }
}
