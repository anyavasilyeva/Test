package main.task04;

public class Task3 {
    public static void main(String[] args) {
        String name = "Олег";

        if (name.equals("Вася")) {
            System.out.println("Привет");
            System.out.println("Как дела?");

        } else if (name.equals("Настя")) {
            System.out.println("Идем гулять?");
        }
        switch (name) {
            case "Вася":
                System.out.println("Привет. Как дела?");
                break;

            case "Настя":
                System.out.println("Идем гулять2?");
                break;

            default:
                System.out.println("А вы кто?");
        }

    }
}