package JR5.JR1_14;

/*
Программист создает человека
*/

public class Solution {
    public static void main(String[] args) {
        Person person = new Person(); //Здесь Вы создаете экземпляр класса Person и помещаете ссылку на него в объект person
        person.initialize("Three", 3);
    }

    static class Person {
        String name;
        int age;

        public void initialize(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}