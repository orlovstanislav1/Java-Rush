package JR6.JR1_22;

/*
Сортировка трех чисел v3
*/

public class Circle {
    public Color color;

    public Circle() {
        color = new Color();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.color.setDescription("Red");
        System.out.println(circle.color.getDescription());
    }

    public class Color {
        String description;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
