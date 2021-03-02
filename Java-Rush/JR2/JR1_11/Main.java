package JR2.JR1_11;

/*
Создай объект типа Cat (кот), объект типа Dog (собака), объект типа Fish (рыбка) и объект типа Woman.
Присвой каждому животному владельца (owner).
 */

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(); //объкт Cat, занесена его ссылка в переменную
        Dog dog = new Dog();
        Fish fish = new Fish();
        Woman woman = new Woman(); //напишите тут ваш код

        cat.owner = woman; // владелец каждого животного Woman, содержится только одна переменная Women owner
        dog.owner = woman;
        fish.owner = woman;//объкт Cat, занесена его ссылка в переменную
        // владелец каждого животного Woman, содержится только одна переменная Women owner

    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}
