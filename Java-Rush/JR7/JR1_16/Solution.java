package JR7.JR1_16;

/*
Минимальное число статиков
*/

public class Solution {
    public static int step;

    public static void main(String[] args) {  // тут
        method1();
    }

    public static void method1() {  // тут
        method2();
    }

    public static void method2() {
        new JR6.JR1_16.Solution().method3();
    }

    public void method3() {
        method4();
    }

    public void method4() {
        step++;
        for (StackTraceElement element : Thread.currentThread().getStackTrace())
            System.out.println(element);
        if (step > 1)
            return;
        main(null);
    }
}