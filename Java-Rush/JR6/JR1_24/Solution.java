package JR6.JR1_24;

/*
И целой утки мало
 */
public class Solution {
    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        System.out.println(duck1);
        System.out.println(duck2);

        Cat cat1 = new Cat();//напишите тут ваш код.....два объекта типа Cat
        Cat cat2 = new Cat();
        System.out.println(cat1);
        System.out.println(cat2);

        Dog dog1 = new Dog();//напишите тут ваш код
        Dog dog2 = new Dog();
        System.out.println(dog1);
        System.out.println(dog2);
    }

    public static class Duck {
        public String toString() { // метод toString
            return "Duck";
        }
    }

    public static class Cat { //напишите тут ваш код
        public String toString() {
            return "Cat";
        }
    }

    public static class Dog { //напишите тут ваш код
        public String toString() {
            return "Dog";
        }
    }
}
