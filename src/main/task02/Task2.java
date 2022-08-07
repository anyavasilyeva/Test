package main.task02;

public class Task2 {

    public static void main(String[] args) {
        int[] arr = arrayFromConsole();
        for (int e: arr) {
            System.out.println(e);
        }
    }

    public static int[] arrayFromConsole() {
        return new int[]{7,4,8};
    }
}
