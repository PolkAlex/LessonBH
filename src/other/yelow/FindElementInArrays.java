package other.yelow;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindElementInArrays {
    public static void main(String[] args) {

        // Даны три неубывающих массива чисел
        // Найти число, которое присутствует во всех трех массивах

        int[] arr1 = new int[]{1, 2, 4, 30, 0, 2, 100};
        int[] arr2 = new int[]{0, 3, -7, 4, 8, 6, 7, 5, 69, 9, 100};
        int[] arr3 = new int[]{2, 4, 5, 1, 7, 6, -1, 8, 6, 9, 1, 13, 19, 35, 47, 100};

        //решение через массивы
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//        Arrays.sort(arr3);
//
//        int i = 0;
//        int j = 0;
//        int k = 0;
//        while (i < arr1.length && j < arr2.length && k < arr3.length) {
//            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
//                System.out.println("Общее число: " + arr1[i]);
//                i++;
//                j++;
//                k++;
//            } else if (arr1[i] < arr2[j]) {
//                i++;
//            } else if (arr2[j] < arr3[k]) {
//                j++;
//            } else {
//                k++;
//            }
//
        //Решение через стримы

        List<Integer> list1 = Arrays.stream(arr1)
                .boxed()
                .collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(arr2)
                .boxed()
                .collect(Collectors.toList());
        List<Integer> list3 = Arrays.stream(arr3)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> numbers = list1.stream()
                .filter(i -> list2.contains(i))
                .filter(i -> list3.contains(i))
                .collect(Collectors.toList());

        System.out.println("Общее число: " + numbers);
    }
}