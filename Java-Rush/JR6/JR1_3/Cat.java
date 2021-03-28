package JR6.JR1_3;

/*
Пустые кошки, пустые псы
*/

public class Cat {

    public static void main(String[] args) {
    }

    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}

class Dog {
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }
}
