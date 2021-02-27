package JR4.JR1_2;

/*
Цена яблок
*/

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Apple.addPrice(50);
        Apple apple2 = new Apple();
        Apple.addPrice(100);
        System.out.println("Стоимость яблок " + Apple.applesPrice);
    }

    public static class Apple {
        public static int applesPrice = 0;

        public static void addPrice(int applesPrice) {   //аргумент метода
            Apple.applesPrice += applesPrice;
            //Apple.applesPrice = Apple.applesPrice + applesPrice; - можно и так
            System.out.println(Apple.applesPrice);
        }
    }
}
