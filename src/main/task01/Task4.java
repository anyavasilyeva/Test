package main.task01;

public class Task4 {
    public static void main(String[] args) {
        boolean weekday = false;
        boolean vacation = true;
        System.out.println("спать или нет?");
        System.out.println(sleepIn(weekday, vacation));

    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return vacation || weekday;
    }
}

