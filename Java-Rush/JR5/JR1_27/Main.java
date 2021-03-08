package JR5.JR1_27;

/*
Вывести на экран таблицу умножения 10х10 используя while, ичсла разделить пробелом
 */
public class Main {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;

        while (x != 11) {
            while (y != 11) {
                System.out.print(x * y + " ");
                y++;
            }
            System.out.println();
            x++;
            y = 1;
        }
    }
}
