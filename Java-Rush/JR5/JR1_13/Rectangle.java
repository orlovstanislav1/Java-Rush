package JR5.JR1_13;

/*
Собираем прямоугольник
*/

public class Rectangle {

    public int top;
    public int left;
    public int width;
    public int height;

    public void initialize(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public void initialize(int top, int left) {
        this.top = top;
        this.left = left;
        this.width = 1;
        this.height = 1;
    }

    public void initialize(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public void initialize(Rectangle rectangle) { //Rectangle это потомок класса Object.
        this.top = rectangle.top;
        this.left = rectangle.left;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    public static void main(String[] args) throws Exception {
    }
}