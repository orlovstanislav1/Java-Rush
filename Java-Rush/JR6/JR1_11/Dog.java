package JR6.JR1_11;

/*
Создать класс Dog
*/

public class Dog {

    public String name;
    public int height;
    public String color;

    public static void main(String[] args) {

    }

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public void initialize(String name, int height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }
}
