package JR2.JR1_3;

/*
Прибавка к зарплате
*/

public class Main {
    public static void main(String[] args) {
        hackSalary(700); //з-п
    }

    public static void hackSalary(int salary) {
        salary = salary + 100;
        System.out.print("Твоя зарплата составляет: " + salary + " долларов в месяц.");
    }
}
