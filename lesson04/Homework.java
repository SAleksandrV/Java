package lesson04;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    // Задаём размер игрового поля
    public static int SIZE;
    // Задаём количество Х или О в ряд необходимых для победы
    public static int block;
    public static Scanner sc = new Scanner(System.in);
    public static Random ran = new Random();

    public static void main(String[] args) {
        new HomeWork.go();
    }

    public void go() {
        customizeGame();
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Поздравляю! Вы выиграли!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья. Попробуем ещё разок?");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Увы. Выиграл компьютер.");
                break;
            }
        }
        System.out.println("Конец игры.");
    }
    // Програма запрашивает размер поля и условия победы
    void customizeGame() {
        do {
            System.out.println("\nInput map size [3-10]:");
            SIZE = sc.nextInt();
        } while (SIZE < 3 || SIZE > 10);
        do {
            System.out.println("How many times to repeat blocks to win? [3 - " +SIZE+"] : ");
            block = sc.nextInt();
        } while (block < 3 || block > SIZE);
    }
    boolean checkWin(char symb) {
        for (int col = 0; col < SIZE - block + 1; col++) {
            for (int row = 0; row < SIZE - block + 1; row++) {
                if (checkDiagonal(symb, col, row) || checkLanes(symb, col, row)) return true;
            }
        }
        return false;
    }
    boolean checkDiagonal(char symb, int offsetX, int offsetY) {
        boolean toright, toleft;
        toright = true;
        toleft = true;
        for (int i = 0; i < block; i++) {
            toright &= (map[i + offsetX][i + offsetY] == symb);
            toleft &= (map[block - i - 1 + offsetX][i + offsetY] == symb);
        }
        if (toright || toleft) return true;
        return false;
    }
    boolean checkLanes (char symb, int offsetX, int offsetY) {
        boolean cols, rows;
        for (int col = offsetX; col < block + offsetX; col++) {
            cols = true;
            rows = true;
            for (int row = offsetY; row < block + offsetY; row++) {
                cols &= (map[col][row] == symb);
                rows &= (map[row][col] == symb);
            }
            if (cols || rows) return true;
        }
        return false;
    }
    boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
    void aiTurn() {
        int x, y;
        do {
            x = ran.nextInt(SIZE);
            y = ran.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Ход компьютера " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }
    void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты Х, Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }
    boolean isCellValid(int x, int y) {
        if (x < 0 || x >=SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }
    void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.println(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.println((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.println(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}