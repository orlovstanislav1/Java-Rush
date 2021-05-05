package JR7.JR1_17;

/*
Блокнот для новых идей
*/

public class Solution {
    public static void main(String[] args) {
        printIdea(new Idea());
    }

    public static void printIdea(Idea idea) { //статистический метод, который выводит на экран описание идеи - это то, что возвращает метод getDescription
        System.out.println(idea.getDescription()); //Метод printIdea() печатает описание из предыдущего метода: напечатать_в_консоль(получитьОписание());
    }

    public static class Idea {
        public String getDescription() { //создали метод getDescription, который возвращает любую строку
            return "String"; //Метод getDescription() содержит описание идеи и возвращает его:  вернуть описание;
        }
    }
}
