package JR5.JR1_4;

/*
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Кот1", 1, 1, 1);
        Cat cat2 = new Cat("Кот2", 2, 2, 2);
        Cat cat3 = new Cat("Кот3", 3, 3, 3);


//напишите тут ваш код
    }

    public static class Cat {
        private final String name;
        private final int age;
        private final int weight;
        private final int strength;

        public Cat(String name, int age, int weight, int strength) {   //конструктор
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
