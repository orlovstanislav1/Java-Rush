package JR6.JR1_4;

/*
По 50 000 объектов Cat и Dog
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }
}
