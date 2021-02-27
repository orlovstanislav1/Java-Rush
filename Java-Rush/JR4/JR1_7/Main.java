package JR4.JR1_7;

/*
Кошки во вселенной
*/

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat.count++;//напишите тут ваш код

        Cat cat2 = new Cat();
        Cat.count++;//напишите тут ваш код

        System.out.println("The cat count is " + Cat.count);
    }

    public static class Cat {
        public static int count = 0;
    }
}
