package JR6.JR1_17;

/*
Конструируем котиков
*/

public class Cat {

    public String name;
    public int age;
    public int weight;
    public String address;
    public String color;

    public Cat(String name) {
        this.name = name;
        this.age = 2;
        this.weight = 2;
        this.color = "Red";
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "Red";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 2;
        this.color = "Red";
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 2;
    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 2;
    }

    public static void main(String[] args) {
    }
}
