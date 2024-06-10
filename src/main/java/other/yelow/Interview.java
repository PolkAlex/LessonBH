package other.yelow;

import java.util.ArrayList;
import java.util.List;

public class Interview {

    //Написать программу, которая будет выводить строку в зависимости от входных данных:
    //ТестОТестОТест
    //ТестОТест
    //Тест
    //""

    public static void main(String[] args) {

        String word = "Тест";
        String separator = "О";
        int count = 3;
        List<String> result = new ArrayList<>();

        if (count == 0) {
            System.out.print("");
        }

        for (int i = 0; i < count; i++) {
            result.add (word);
            if (i < count - 1) {
                result.add (separator);
            }
        }
        System.out.print(String.join("", result));
    }
}