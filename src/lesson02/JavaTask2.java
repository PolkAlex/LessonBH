package lesson02;

import java.util.Scanner;

public class JavaTask2 {

    public static void main(String[] args) {

        System.out.println("-----step1-----");
        step1();

        System.out.println("-----step2-----");
        System.out.println("Введите число от 1 до 12: ");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        step2(month);

        System.out.println("-----step3-----");
        System.out.println("Введите значения аргументов квадратного уравнения: ");
        System.out.println("введите значение аргумента 'a' ");
        double a = scanner.nextDouble();
        System.out.println("введите значение аргумента 'b' ");
        double b = scanner.nextDouble();
        System.out.println("введите значение аргумента 'c' ");
        double c = scanner.nextDouble();
        step3(a, b, c);
    }

    static void step1() {
        // слева направо
        System.out.println("Матрица 5х5 слева направо: ");
        int n = 5; // Количество чисел в строке и в столбце
        int maxValue = 25; // Максимальное значение числа

        for (int i = 1; i <= maxValue; i++) {
            System.out.print(i + " ");
            if (i % n == 0) {
                System.out.println();
            }
        }
        // сверху вниз
        System.out.println("Матрица 5х5 сверху вниз: ");
        int[][] array = {
                {1, 6, 11, 16, 21},
                {2, 7, 12, 17, 22},
                {3, 8, 13, 18, 23},
                {4, 9, 14, 19, 24},
                {5, 10, 15, 20, 25}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void step2 (int month) {

        switch (month) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Нет такого месяца");
        }
    }

    static void step3(double a, double b, double c) {
        double D = Math.pow(b, 2) - (4 * a * c);
        if (D < 0) {
            System.out.println("Корней нет");
            System.out.println("D = " + D);
        } else {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: " + x1 + ", " + x2);
        }
    }
}
