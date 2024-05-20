package lesson02;

import java.util.Scanner;

public class JavaTask3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("-----step1-----");
        //step1(n); не смог решить

        int[][] arr = {{1, -2, 3, 4}, {5, -6, -7, 8}, {9, 10, -11, 12}};
        System.out.println("-----step2-----");
        System.out.println("Сумма элементов между первым и " +
                "вторым положительными элементами каждой строки: " + step2(arr)); //нагуглил рещение

        System.out.println("-----step3-----");
        int[][] matrix = {{5, 1, 3}, {2, 8, 7}, {4, 6, 9}};
        int maxElement = findMaxElement(matrix);
        System.out.println("Максимальный элемент: " + maxElement);
        int[][] resultMatrix = removeRowsAndColumnsContainingMaxElement(matrix, maxElement);
        step3(resultMatrix); //нагуглил рещение
    }

    public static void step1(int n){

        int [][] array = new int[n][n];
        int max = n;
        int min = -n;
        for (int i = 0; i < array.length; i++) {
            max = max - min;
            n = (int) (Math.random()* ++max) + min;
        }
    }

    public static int step2(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int firstPositiveIndex = -1;
            int secondPositiveIndex = -1;
            boolean foundFirst = false;
            boolean foundSecond = false;

            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    if (!foundFirst) {
                        firstPositiveIndex = j;
                        foundFirst = true;
                    } else if (!foundSecond && secondPositiveIndex == -1) {
                        secondPositiveIndex = j;
                        foundSecond = true;
                    }
                }
            }

            for (int j = firstPositiveIndex + 1; j < secondPositiveIndex; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    private static int findMaxElement(int[][] matrix) {
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                }
            }
        }
        return maxElement;
    }

    private static int[][] removeRowsAndColumnsContainingMaxElement(int[][] matrix, int maxElement) {
        int rowsCount = matrix.length;
        int columnsCount = matrix[0].length;

        boolean[] hasMaxElementInRow = new boolean[rowsCount];
        boolean[] hasMaxElementInColumn = new boolean[columnsCount];

        for (int i = 0; i < rowsCount; i++) {
            for (int j = 0; j < columnsCount; j++) {
                if (matrix[i][j] == maxElement) {
                    hasMaxElementInRow[i] = true;
                    hasMaxElementInColumn[j] = true;
                }
            }
        }

        int[][] resultMatrix = new int[rowsCount - hasMaxElementInRow.length][columnsCount - hasMaxElementInColumn.length];

        for (int i = 0, k = 0; i < rowsCount; i++) {
            if (!hasMaxElementInRow[i]) {
                for (int j = 0, l = 0; j < columnsCount; j++) {
                    if (!hasMaxElementInColumn[j]) {
                        resultMatrix[k][l] = matrix[i][j];
                        l++;
                    }
                }
                k++;
            }
        }

        return resultMatrix;
    }

    private static void step3(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
