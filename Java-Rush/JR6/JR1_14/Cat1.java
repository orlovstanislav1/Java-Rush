package JR6.JR1_14;

/*
Статические коты
*/
//1. Добавь в класс Cat публичную статическую переменную cats (ArrayList<Cat>).
//2. Переменная cats должна быть проинициализирована.
//3. Метод main должен создавать 10 объектов Cat (используй конструктор Cat()).
//4. Метод main должен добавить всех созданных котов в переменную cats.
//5. Метод printCats должен выводить всех котов из переменной cats на экран. Каждого с новой строки.


import java.util.ArrayList;

public class Cat1 {
    //напишите тут ваш код
    public static ArrayList<Cat> cats = new ArrayList<Cat>();

    public Cat1() {
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < 10; i++) {
            cats.add(new Cat());
        }
        printCats();
    }

    public static void printCats() {
        //напишите тут ваш код
        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i));
        }
    }
}