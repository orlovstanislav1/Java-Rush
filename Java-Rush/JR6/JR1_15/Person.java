package JR6.JR1_15;

/*
Инициализация объектов
*/

public class Person {
    String name;
    char sex;
    int money;
    int weight;
    double size;

    public static void main(String[] args) {

    }

    public void initialize(String name, int money, char sex, int weight, double size) {
        this.name = name;
        this.money = money;
        this.sex = sex;
        this.weight = weight;
        this.size = size;
    }
}