package JR5.JR1_30;

/*
Треугольник из восьмерок
 */
public class Main {
    public static void main(String[] args) {
        int i, j;
        for (i = 0; i < 10; i++) { // в ширину (контролирует количество строк)
            for (j = 0; j <= i; j++) { // в высоту (контролирует количество восьмерок)
                System.out.print(8);
            }
            System.out.println();
        }
    }
}

