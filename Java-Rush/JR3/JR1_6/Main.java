package JR3.JR1_6;

/*
Привет StarCraft! (создать объект типа Zerg и каждому дать имя)
*/

public class Main {
    public static void main(String[] args) {
        Zerg zerg1 = new Zerg();
        zerg1.name = "a";
        Zerg zerg2 = new Zerg();
        zerg2.name = "b";
        Zerg zerg3 = new Zerg();
        zerg3.name = "c";
        Zerg zerg4 = new Zerg();
        zerg4.name = "d";
        Zerg zerg5 = new Zerg();
        zerg5.name = "e";

        Protoss protoss1 = new Protoss();
        protoss1.name = "f";
        Protoss protoss2 = new Protoss();
        protoss2.name = "g";
        Protoss protoss3 = new Protoss();
        protoss3.name = "h";

        Terran terran1 = new Terran();
        terran1.name = "i";
        Terran terran2 = new Terran();
        terran2.name = "f";
        Terran terran3 = new Terran();
        terran3.name = "g";
        Terran terran4 = new Terran();
        terran4.name = "k";//напишите тут ваш код
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
