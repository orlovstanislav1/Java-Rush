package JR6.JR1_25;

/*
Мужчина и женщина
 */

public class Solution {
    public static void main(String[] args) {

        Man man = new Man("Рома", 1, "Кон"); //создать по 2 объекта каждого типа
        Man man1 = new Man("Витя", 2, "Кот");

        Woman woman = new Woman("Катя", 3, "Кор");
        Woman woman1 = new Woman("Надя", 4, "Кол");

        System.out.println(man);
        System.out.println(man1);
        System.out.println(woman);
        System.out.println(woman1);
    }

    public static class Man { //класс man должен содержать переменные name  age   address
        String name; //создали поля
        int age;
        String address;

        public Man(String name, int age, String address) { // должен быть конструктор принимающий параметры с типом string..., конструкторы должны инициализировать переменные класса
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return (name + " " + age + " " + address);
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return (name + " " + age + " " + address);
        }
    }

}
