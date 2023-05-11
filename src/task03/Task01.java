package task03;

        public class Task01 {
            public static void main(String[] args) {
                boolean isWeekday = false; // выходной
                boolean isVacation = true; // отпуск

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

