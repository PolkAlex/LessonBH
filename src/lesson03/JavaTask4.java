package lesson03;

import java.util.Arrays;
import java.util.Collections;

public class JavaTask4 {

    public static void main(String[] args) {

        System.out.println("-----step1-----");
        int [] array1 = {1,4,6,7,3,3,2,6,2,7,8,4};
        System.out.println(Arrays.toString(step1(array1)));

        System.out.println("-----step2-----");
        int[][] array2 = {{8,5,23,7,10}, {78,3,56,2,94}};
        System.out.println(Arrays.deepToString(step2(array2)));
    }

    static int[] step1 (int[] array1) {
        Arrays.sort(array1);
        return array1;
    }

    static int[][] step2 (int[][] array2) {

        // Сортировка матрицы по возрастанию
        for (int i = 0; i < array2.length; i++) {
            Arrays.sort(array2[i]);
        }

        // Вывод матрицы в консоль в обратном порядке
        for (int i = array2.length - 1; i >= 0; i--) {
            for (int j = array2[i].length - 1; j >= 0; j--) {
                System.out.print("");
            }
        }
        return array2;
    }
}
