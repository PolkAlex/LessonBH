package lesson02;

import java.util.Scanner;

public class JavaTask3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        step1(n);
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
}
