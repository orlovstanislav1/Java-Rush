package JR7.JR1_21;

/*
Родственные связи кошек
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfatherName = reader.readLine(); //кошка дед - имя
        Cat catGrandfather = new Cat(grandfatherName);

        String grandmotherName = reader.readLine(); //кошка бабка - имя
        Cat catGrandmother = new Cat(grandmotherName);

        String fatherName = reader.readLine(); //кошка папа - имя
        Cat catFather = new Cat(fatherName, null, catGrandfather);

        String motherName = reader.readLine(); //кошка мама - имя
        Cat catMother = new Cat(motherName, catGrandmother, null);

        String sonName = reader.readLine(); //кошка сын - имя
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine(); //кошка дочка - имя
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrandfather); //кошка дед
        System.out.println(catGrandmother); //кошка бабушка
        System.out.println(catFather); //кошка папа
        System.out.println(catMother); //кошка мама
        System.out.println(catSon); //кошка сын
        System.out.println(catDaughter); //кошка дочка
    }

    public static class Cat {
        private final String name;
        private Cat mother; //родитель
        private Cat father; //папа

        Cat(String name) { //кошка мама
            this.name = name;
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            if (mother == null) {
                if (father == null)
                    return "Cat name is " + name + ", no mother," + " no father";
                else
                    return "Cat name is " + name + ", no mother," + " father is " + father.name;
            } else {
                if (father == null)
                    return "Cat name is " + name + ", mother is " + mother.name + ", no father";
                else
                    return "Cat name is " + name + ", mother is " + mother.name + ", father is " + father.name;
            }
        }
    }
}