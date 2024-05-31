package other.yelow;

import java.util.Arrays;

public class FindElementInArrays {
    public static void main(String[] args) {

        // Даны три неубывающих массива чисел
        // Найти число, которое присутствует во всех трех массивах

        int[] arr1 = new int[] {1,2,4,7,4,2,5,7,8,6};
        int[] arr2 = new int[] {0,3,3,4,8,6,8,5,3,3};
        int[] arr3 = new int[] {2,4,5,1,4,6};

//        for (int i = 0; i < array3.length; i++) {
//            if (array3[i] == array1[i] && array3[i] == array2[i]) {
//                System.out.println("Элемент массива №" + i + " найден. Он равен " + array3[i]);
//            } else System.out.println("Элемент массива №" + i + " не найден");
//        }

        // Отсортируем (просто по возрастанию) массивы для более эффективного поиска
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);

        // Найдем общее число в трех массивах
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