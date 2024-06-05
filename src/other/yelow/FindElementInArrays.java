package other.yelow;

import java.util.Arrays;

public class FindElementInArrays {
    public static void main(String[] args) {

        // Даны три неубывающих массива чисел
        // Найти число, которое присутствует во всех трех массивах

        int[] arr1 = new int[]{1, 2, 4, 7, 0, 2, -1, 8, 6, 9, 1};
        int[] arr2 = new int[]{0, 3, -7, 4, 8, 6, 7, 5, 4, 9};
        int[] arr3 = new int[]{2, 4, 5, 1, 7, 6};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                System.out.println("Общее число: " + arr1[i]);
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }
    }
}