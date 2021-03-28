package JR6.JR1_10;

/*
Кошкоинициация
*/

public class Cat {

    public String name;
    public int age;
    public int weight;
    public String address;
    public String color;

    public void initialize(String name) {
        this.name = name;
        this.age = 1;
        this.weight = 1;
        this.color = "Red";
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "Black";
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 3;
        this.color = "Green";
    }

    public void initialize(int weight, String color) {
        this.age = 4;
        this.weight = weight;
        this.color = color;
    }

    public void initialize(int weight, String colour, String address) {
        this.age = 5;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }
}