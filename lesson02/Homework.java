package lesson02;

public class Homework {
    public static void main(String[] args) {
/* Задать с помощью цикла целочисленный массив, состоящий из элементов 0 и 1.
Например: (1, 1, 0, 0, 1, 0, 1, 1, 0, 0). Заменить условия 0 на 1, 1 на 0.  */
    System.out.println("Задача №1");
        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < a.length; i++) {
        a[i] = a[i] == 1 ? 0 : 1;
    System.out.println(a[i] + " ");
}

/* Задать пустой целочисленный массив размером 8.
С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21. */
        System.out.println("Задача №2");
            int[] myArray = new int[8];
            int value = 0;
            for (int i = 0; i < myArray.length; i++) {
              myArray[i] = value;
             value +=3;
        System.out.println(i+1 + " : " + myArray[i]);
        }

/* Задать массив (1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1) пройти по нему циклом.
Числа меньше 6 умножить на 2. */
        System.out.println("Задача №3");
            int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) array[i] *= 2;
        System.out.println(i+1 + " : " + array[i]);
        }

/* Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое).
С помощью цикла(ов) заполнить его диагональные элементы единицами. */

        System.out.println("Задача №4");
            int[][] arra = {
            {1, 0, 1, 0, 1}, {0, 1, 0, 1, 0}, {1, 0, 1, 0, 1}, {0, 1, 0, 1, 0}, {1, 0, 1, 0, 1}
                };
            for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
        System.out.print(arra[i][j] + "\t");
                    }
        System.out.println();
                }
            }
        }

// Задать одномерный массив и найти в нём минимальный и максимальный элементы (без помощи интернета).

        System.out.println("Задача №5");
                int[] arr = {4, 7, 9, -5, -8};
                int min = arr[0], max = arr[0], indMin = 0, indMax = 0;
                for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    indMax = i;
                      }
                if (arr[i] < min) {
                    min = arr[i];
                    indMin = i;
                     }
                     }
        System.out.println("Максимальный элемент находится в массиве под индексом " + indMax + " со значением = " + max);
        System.out.println("Минимальный элемент находится в массиве под индексом " + indMin + " со значением = " + min);

/* Написать метод в который передаётся не пустой одномерный целочисленный массив.
Метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
Примеры: checkBalance ([2, 2, 2, 1, 2, 2 || 10, 1]) - true, checkBalance ([1, 1, 1 || 2, 1]) - true.
Границы показаны символами ||, эти символы в массив не входят.
   */


/* Написать метод, которому на вход подаётся одномерный массив и число n (может быть положительным,
или отрицательным) при этом метод должен сместить все элементы массива на n позиций.
Для усложнения задачи, пользоваться вспомогательными массивами нельзя.
 */



public static int[] shiftMethod(int[] array, int shift) {
        if (shift != 0) {
// Оптимизируем сдвиг через деление по модулю
        int finalshift;
        if (shift > array.length) {
        shift = Math.abs(shift % array.length);
        } else {
        finalshift = shift;
        }
// Если + двигаем массив слева направо, если - справа налево.
        if (shift > 0) {
        for (int n = 0; n < shift; n++) {
// Создаём буфер обмена и убираем туда первый элемент, на его место ставим последний
        int buffer = array[0];
        myArray[0] = array[array.length - 1];
// Циклично сдвигаем весь массив
        for (int j = 1; j < array.length - 1; j++) {
        array[array.length - j] = array[array.length - j - 1];
        }
// Элемент в буффере ставим в первую ячейку
        array[1] = buffer;
        }
        } else if (shift < 0) {
        for (int i = 0; i > shift; n--) {
        int buffer = array[array.length - 1];
        array[array.length - 1] = array[0];
        }
        array[array.length - 2] = buffer;
        }
        }
        }
        }
