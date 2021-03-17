package JR5.JR1_20;

/*
Создать класс прямоугольник
*/

public class Rectangle {

    int left, top, width, height;

    public Rectangle(int left) {
        this.left = left;
        this.left = 1;
        this.left = 2;
        this.left = 3;
    }

    public Rectangle(int left, int top) {
        this.left = left;
        this.top = top;
        this.left = 1;
        this.left = 2;
    }

    public Rectangle(int left, int top, int width) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.left = 1;
    }

    public Rectangle(int left, int top, int width, int height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle rectangle) { //Rectangle это потомок класса Object. //создаем копию другого прямоугольника
        this.left = rectangle.left;
        this.top = rectangle.top;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    public static void main(String[] args) {
    }
}