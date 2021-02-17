package by.epam.exercise;

public class LastDigit {
    public static int decisionDigit(int number){
            int lastDigit = number % 10;
            //System.out.println("Последняя цифра квадрата числа " + (int) Math.pow(lastDigit, 2) % 10);
            return ((int) Math.pow(lastDigit,2) % 10);
    }
}
