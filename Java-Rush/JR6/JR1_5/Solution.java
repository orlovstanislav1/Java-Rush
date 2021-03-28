package JR6.JR1_5;

/*
Кошачья бойня
*/

public class Solution {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Кот1", 1, 1, 1);
        Cat cat2 = new Cat("Кот2", 2, 2, 2);
        Cat cat3 = new Cat("Кот3", 3, 3, 3);
        System.out.println(cat1.fight(cat2));
        System.out.println(cat1.fight(cat3));
        System.out.println(cat2.fight(cat3));

        //напишите тут ваш код
    }

    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0; // return score > 0 ? true : false;
        }
    }
}