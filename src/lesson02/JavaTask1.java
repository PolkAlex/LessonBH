package lesson02;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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
//        step1(array);
//        step2(array);
        step3(array);
    }

    // --------- найти минимальное и максимальное значение в массиве ---------
//        static void step1(int[] array) {
//
//        int max = array[0];
//        int minList = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > max) {
//                max = array[i];
//            }
//            if (array[i] < minList) {
//                minList = array[i];
//            }
//        }
//        System.out.println("max = " + max);
//        System.out.println("minList = " + minList);
//    }
    // --------- найти числа, которые меньше среднего арифметического в массиве ---------
//    static void step2(int[] array) {
//
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum = sum + i;
//        }
//        double average = (double) sum / array.length;
//        System.out.println("Average of array = " + average);
//        System.out.print("minList of average: ");
//        for (int i = 0; i < array.length; i++) {
//            if (i < average) {
//                System.out.print(array[i] + "; ");
//            }
//        }
//    }
    // --------- найти номера найменьших чисел в массиве в порядке убывания ---------
    static void step3(int[] array) {

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = i;
            }
        }

        System.out.print("min index of array = ");
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
