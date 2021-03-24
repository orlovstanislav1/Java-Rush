package JR5.JR1_26;

/*
Том и Джерри
 */
public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5); //создали по каждому объекту
        Dog dogDog = new Dog("Dog", 1, 1);
        Cat catCat = new Cat("Cat", 2, 2);
        //напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog {
        String name;
        int height;
        int tail;

        public Dog(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat {
        String name;
        int height;
        int tail;

        public Cat(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
    //напишите тут ваш код
}
