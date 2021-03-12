package JR5.JR1_2;

/*
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public static void main(String[] args) {
    }

    public boolean fight(Cat anotherCat) {
        Cat cat1 = new Cat();
        cat1.age = 1;
        cat1.weight = 1;
        cat1.strength = 1;

        Cat cat2 = new Cat();
        cat2.age = 2;
        cat2.weight = 2;
        cat2.strength = 2;

        int i = 0, he = 0;

        if (this.age > anotherCat.age) { //У нас больше возраст, тогда нам очко
            i++;
        } else if (this.age < anotherCat.age) { //иначе если у оппонента больше возраст, то очко ему
            he++;
        }  // если бы мы просто написали else enemy++ тогда, если бы у них возраст был одинаковый, противнику бы дали очко просто так.

        if (this.weight > anotherCat.weight) {
            i++;
        } else if (this.weight < anotherCat.weight) {
            he++;
        }

        if (this.strength > anotherCat.strength) {
            i++;
        } else if (this.strength < anotherCat.strength) {
            he++;
        }

        if (i > he) return true;
        else if (i < he || i == he)
            //если у нас очков больше, возвращаем true, если у противника больше или очков поровну, то возвращаем false
            // можно написать так -    else return false;
            // или так -   return we > enemy;
            return false;

        return false;
    }
}

        /*
        int score = 0;
    if (this.age > anotherCat.age) {
        score++;
    } else if (this.age < anotherCat.age) {
        score--;
    }
    if (this.weight > anotherCat.weight) {
        score++;
    } else if (this.weight < anotherCat.weight) {
        score--;
    }
    if (this.strength > anotherCat.strength) {
        score++;
    } else if (this.strength < anotherCat.strength) {
        score--;
    }
    return score > 0;
        */


     /*
    int score = 0;
    score += compare(this.age, anotherCat.age);
    score += compare(this.weight, anotherCat.weight);
    score += compare(this.strength, anotherCat.strength);
    return score > 0;
}

private int compare(int x, int y) {
    if (x > y) {
        return 1;
    } else if (x == y) {
        return 0;
    } else {
        return -1;
    }
        */


         /*
    int score = 0;
    score += Integer.compare(this.age, anotherCat.age);
    score += Integer.compare(this.weight, anotherCat.weight);
    score += Integer.compare(this.strength, anotherCat.strength);
    return score > 0;
        */


    /*
    Давайте для начала заглянем внутрь метода Integer.compare() и посмотрим, как он реализован. Должны же мы знать, что за метод используем:
public static int compare(int x, int y) {
    return (x < y) ? -1 : ((x == y) ? 0 : 1);
}
    */