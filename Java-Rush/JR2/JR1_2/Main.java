package JR2.JR1_2;

/*
О семейных отношениях
*/

public class Main {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();
        woman.husband = man;
        man.wife = woman;//напишите тут ваш код
    }

    public static class Man {
        public int age;
        public int height;
        public Woman wife;
    }

    public static class Woman {
        public int age;
        public int height;
        public Man husband;
    }
}
