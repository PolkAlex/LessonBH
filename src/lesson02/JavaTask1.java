package lesson02;

import java.util.Scanner;

public class JavaTask1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            String s = sc.nextLine();
            int i1 = Integer.parseInt(s);
            array[i] = i1;
        }
        step1(array);
        step2(array);
        step3(array);
    }

    // --------- найти минимальное и максимальное значение в массиве ---------
        static void step1(int[] array) {

        System.out.println("--найти минимальное и максимальное значение в массиве--");

        int max = array[0];
        int minList = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < minList) {
                minList = array[i];
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + minList);
    }
    // --------- найти числа, которые меньше среднего арифметического в массиве ---------
    static void step2(int[] array) {

        System.out.println("--найти числа, которые меньше среднего арифметического в массиве--");

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + i;
        }
        double average = (double) sum / array.length;
        System.out.println("Average of array = " + average);
        System.out.print("Min of average: ");
        for (int i = 0; i < array.length; i++) {
            if (i < average) {
                System.out.print(array[i] + "; ");
            }
        }
        System.out.println();
    }
    // --------- найти номера найменьших чисел в массиве в порядке убывания ---------
    static void step3(int[] array) {

        System.out.println("--найти номера найменьших чисел в массиве в порядке убывания--");

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = i;
            }
        }
        System.out.print("Min index of array = ");
        boolean first = true;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == min) {
                if (first) {
                    System.out.print(j);
                    first = false;
                } else {
                    System.out.print(" " + j);
                }
            }
        }
    }
}
