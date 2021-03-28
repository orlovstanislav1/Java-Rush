package JR6.JR1_4;

/*
По 50 000 объектов Cat и Dog
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 0; i < 50000; i++) {  // напишите тут ваш код

            Cat cat = new Cat();
            cat = null;//вот здесь первый объект становится доступен сборщику мусора
        }
        for (int i = 0; i < 50000; i++) {

            Dog dog = new Dog();
            dog = null;//вот здесь первый объект становится доступен сборщику мусора
        }
    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }
}
