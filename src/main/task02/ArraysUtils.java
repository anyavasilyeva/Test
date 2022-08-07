package main.task02;

import java.util.Scanner;

public class ArraysUtils {
    public static void main(String[] args) {

        int[] container = arrayFromConsole();
        for (int a = 0; a < container.length; a++) {
            System.out.print(" " + container[a]);
        }
    }

    public static int[] arrayFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну массива");
        int size = scanner.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int[] arr = new int[size]; // Создаём массив int размером в size
        System.out.println("Заполните массив. Если надоело - клацай не цифру");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            String symbol = scanner.next();
            int tmp;
            try {
                tmp = Integer.parseInt(symbol);
            } catch (NumberFormatException e) {
                return arr;
            }
            arr[i] = tmp;

        }
        return arr;

    }
}