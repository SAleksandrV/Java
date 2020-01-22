package lesson03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Homework {
/* Написать программу, которая загадывает случайное число от 0 до 9. Пользователю даётся
3 попытки угадать число. При каждой попытке компьютер сообщает больше ли введённое пользователем
число чем загаданное, или меньше. после игры выводится запрос - "Повторить игру ещё раз?"
 1 - да (повторить) / 0 - нет.
         */
        public static void main(String[] args) {
            System.out.println("Задача №1 Угадай число");
            Random rand = new Random();
            Scanner scan = new Scanner(System.in);
            do {
                int count = 0;
                int guess = -1;
                int number = rand.nextInt(10);
                while (count < 3 && guess != number) {
                    System.out.print("Введите число (0...9): ");
                    guess = scan.nextInt();
                    if (number != guess) {
                        System.out.println("Ваше число " + ((guess > number) ? " больше" : "меньше"));
                        count++;
                    }
                }
                System.out.println("Вы " + ((guess == number) ? "выиграли !" : "проиграли: " + number));
                System.out.println("Не желаете сыграть ещё? Да - 1, Нет - 0");
            } while (scan.nextInt() == 1);
        }
    }

        import java.util.Arrays;
        import java.util.Random;
        import java.util.Scanner;
public class Homework {
/* Написать программу, которая загадывает слово из массива представленных слов.
Если слово не угадано пользователем компьютер подсказывает ему, показывая угаданные им буквы.
            */
        public static void main(String[] args) {
            System.out.println("Задача №2 Угадай слово");
            Random rand = new Random();
            Scanner scan = new Scanner(System.in);
            String word;
            String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
            System.out.println(Arrays.toString(words));
            int n = rand.nextInt(words.length);
            // System.out.println(words[n]); (Слово выбранное компьютером)
            System.out.println("Компьютер загадал слово, попробуйте его угадать");
            char[] chs = words[n].toCharArray();
            char[] chCmp = new char[chs.length];
            for (int i = 0; i < chs.length; i++) {
                chCmp[i] = '*';
            }
            while (true) {
                System.out.print("Введите слово: ");
                word = scan.nextLine();
                if (word.equals("0")) {
                    break;
                }
                if (word.equals(words[n])) {
                    System.out.println("Вы угадали");
                    break;
                } else {
                    System.out.println("Вы не угадали попробуйте ещё");
                    // Компьютер будет тебе подсказывать, показывая угаданные буквы
                    char[] chWord = word.toCharArray();
                    for (int i = 0; i < chs.length; i++) {
                        if (i >= chWord.length) {
                            break;
                        }
                        if (chs[i] == chWord[i]) {
                            chCmp[i] = chs[i];
                        }
                    }
                    System.out.println(String.valueOf(chCmp) + "**********");
                }
            }
        }
    }