package main;

public class Task5_3 {
    public static void main(String[] args) {
        String a = "коля";
        switch (a) {
            case "вася":
                System.out.println("привет");
                System.out.println("Я тебя так долго ждал");
                break;
            case "коля":
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
        }
    }
}