package JR6.JR1_14;

/*
Статические коты
*/

import java.util.ArrayList;

public class Cat {
    public static ArrayList<Cat> cats = new ArrayList<Cat>();//добавили публичную статическую переменную cats


    public Cat() {
        cats.add(new Cat());//ниже при каждом создании нового объеат Cat в переменую cats добавляется этот новы кот
    } //в конструкторе вы написали new Cat() - что приводит к срабатыванию конструктора

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) { //тут создаем 10 котов и их всех добавляем выше в cats
            Cat cat = new Cat();
        }//напишите тут ваш код
        printCats();
    }

    public static void printCats() {
        System.out.println(cats.toString());//выводит всех котов из переменной cats на экран
    }
}