package main.task01;

public class Task2 {
    public static void main(String[] args) {
        int a;
        int b;
        int x;

        System.out.println(5);//5
        /*
        первым делится 2 на 8 получаем 0
        затем плюсуем 5 к 0, в результате получаем 5
         */

        System.out.println((5 + 2) / 8);//0
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
        System.out.println(((5 + a++)) / --b); //1
        /*
       к  переменной а добаляется 1, получаем 5 + 3,а переменная b = 7,
       таким образом в результате образуется 1
         */

        a = 2;
        b = 8;
        System.out.println(5 * a >> a++ / --b);//10

        a = 2;
        b = 8;
        System.out.println((5 + 7 > 20 ? 68 : 22 * 2 >> a++) / --b); //1
        /*

         */


        System.out.println(false);//false
        /* тк 2 не больше 3 и 144 (12*12) не меньше 119. поэтому false
         */


        a = 2;
        b = 8;
        System.out.println(((5 + 7 > 20) ? (68 >= 68) : (22 * 2 >> a++) / --b));//1


        a = 2;
        b = 3;
        if (a > b) {
            System.out.println("а больше б");
        } else {
            System.out.println("б больше а");
        }
    }

}

