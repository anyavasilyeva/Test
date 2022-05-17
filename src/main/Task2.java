package main;

public class Task2 {
    public static void main(String[] args) {
        int a;
        int b;
        int x;

        System.out.println(5 + 2 / 8);//5
        /*
        первым делится 2 на 8 получаем 0
        затем плюсуем 5 к 0, в результате получаем 5
         */

        System.out.println((5 + 2 )/ 8);//0
        /*
        первым складывается 5 с 2 получаем 7
        затем делим 7 на 8, в результате получаем 0
         */
        a = 2;
        System.out.println(((5 + a++)) / 8); //0
        /*
        переменная а = 2, таким образом 7/8 равно 0
         */
        a = 2;
        b = 8;
        System.out.println(((5 + a++)) / --b); //







    }

}
