package main.task03;

public class Test {
    public static void main(String[] args) {
        boolean isWeekday = false; // пример: сегодня выходной
        boolean isVacation = true; // пример: сейчас отпуск

        if (sleepIn(isWeekday, isVacation)) {
            System.out.println("Можем спать дальше");
        } else {
            System.out.println("Пора идти на работу");
        }
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
}


