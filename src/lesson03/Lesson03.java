package lesson03;

import java.util.Arrays;

public class Lesson03 {
    public static void main(String[] args) {
        //--------------theory--------------
//        int[] ints = new int[3];
//        ints[0] = 1;
//        ints[1] = 3;
//        ints[2] = 2;
//        Arrays.sort(ints);
////        System.out.println(Arrays.toString(ints));
//        //--
//        String s = "gweg wefwe gwe weg we       ";
//        s.substring(1,4);
////        System.out.println(s.trim());
//        System.out.println(s);
//        System.out.println(Math.pow(3, 2.3));
//        //--------------practice--------------
//        //сортировка по возрастанию
//        System.out.println(Math.random()*5);
//        int[] array = {1,3,6,7,8,8,10};
//
//        boolean isCheck = false;
//        int buf;
//
//        while (!isCheck) {
//            isCheck = true;
//
//            for (int i = 0; i < array.length-1; i++) {
//                if (array[i] > array[i+1]) {
//                    isCheck = false;
//
//                    buf = array[i];
//                    array[i] = array[i+1];
//                    array[i+1] = buf;
//                }
//            }
//        }
//        //for (int j : array)
//        for (int j = 0; j < array.length; j++) {
//            System.out.println(array[j]);
//        }
//        for (int j : array){
//            System.out.println(j);
//        }
//        //--------------practice--------------
        // перебор двумерного массива
        int[][] array = {{1,2,3}, {4,5,6}, {7,8,9,10}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        //--------------practice--------------
//
//        Cat cat = new Cat("Barsik");
//        int age =  cat.setAge(10);
//        String name = cat.getName();
//
//        System.out.println(age + " " + name);
    }
}