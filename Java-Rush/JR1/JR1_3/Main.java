package JR1.JR1_3;

/*
Мой юный друг (год рождения моего друга)
*/

public class Main {
    public static void main(String[] args) {
        int year = 3126;//текущий год
        int birthday = 8;//друг родился 8 лет назад
        int YearOfBirthday = year - birthday;//год рождения
        System.out.print("год рождения моего друга " + YearOfBirthday);
    }
}
