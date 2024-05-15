package lesson02;

import java.util.Scanner;

public class JavaTask2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        step1();
        System.out.println("----------//----------");
    }

    static void step1() {
        // слева направо
        System.out.println("слева направо: ");
        int n = 5; // Количество чисел в строке и в столбце
        int maxValue = 25; // Максимальное значение числа

        for (int i = 1; i <= maxValue; i++) {
            System.out.print(i + " ");
            if (i % n == 0) {
                System.out.println();
            }
        }
        // сверху вниз
        System.out.println("сверху вниз: ");
        int[][] array = {{1, 6, 11, 16, 21}, {2, 7, 12, 17, 22}, {3, 8, 13, 18, 23}, {4, 9, 14, 19, 24}, {5, 10, 15, 20, 25}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
