package lesson01;

public class Homework {
//Пустой проект с методом main();
    public static void main(String[] args) {

        System.out.println("Hello, Java!" + 14 + " January " + 2020);
    }
}

/*Создание примитивных переменных и их инициализация.
Виды примитивных переменных: byte, short, int, long, float, double, char, boolean.  */
public static void main(String[] args) {
    byte a = 126;
    System.out.println(a);
    short b = 4567;
    System.out.println(b);
    int c = 65535;
    System.out.println(c);
    long d = 1_000_000L;
    System.out.println(d);
    float e = 284.4f;
    System.out.println(e);
    double f = 34.15;
    System.out.println(f);
    char h = 'J';
    char g = '@';
    System.out.println(h + g);
    boolean z = true;
    boolean x = false;
    System.out.println("z=" + z + "  x=" + x);
    System.out.println("z|x=" + (z | x));
    System.out.println("z&x=" + (z & x));
}
}

// Написать метод вычисляющий выражение a*(b+(c/d)) и возвращающий результат, где a, b, c, d, входные параметры этого метода

        public static double Task(double a, double b, double c, double d) {
            return a * (b + (c / d));
        }

        /* Написать метод, принимающий на вход два числа.
        Данный метод должен проверять,  что сумма этих двух чисел лежит в пределах от 10 до 20 (включительно).
        Если да - вернуть true, в противном случае - false.     */
        public static boolean choice (int a, int b) {
            if (a + b >= 10 && a + b <= 20) {
                return true;
            }
            else {
                false ;
            }
        }
        public static void main(String[] args) {
            System.out.println(choice(7, 8));
        }
        /* Написать метод, которому в качестве параметра передаётся целое число.
        Метод должен напечатать в консоль какое число было передано: положительное, или отрицательное.
        0 - считать положительным числом         */
        public static void number (int num) {
            String word = "положительное";
            if (num < 0 ) word = "отрицательное";
            System.out.println(word);
        }
    }
    /* Написать метод, которому в качестве параметра передаётся целое число.
    Метод должен вернуть true, если число отрицательное.     */
    public static void positiveNumber (int m) {
        if (m < 0) {
            true ;
        }
        else {
            return false;
        }
    }
    /*Написать метод, которому в качестве параметра передаётся строка, обозначающая имя.
    Метод должен вывести в консоль "Привет, указанное имя!"    */
    public static void hey(String name) {
        System.out.println("Привет, " + " " + "name" + "!");
    }
    /*Написать метод определяющий является ли год високосным и выводящий результат в консоль.
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й является високосным.     */
    public static void boolean leapYear(int year) {
        if ((((year % 4) == 0) && !((year % 100) == 0)){
            return true;
        } else if ((year % 400) == 0) {
            return true;
        }
        return false;
    }
}