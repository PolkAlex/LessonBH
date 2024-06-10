package other.yelow;

import java.util.Arrays;

public class Amogramma {

    public static boolean isAnagram(String original, String word) {
        // Преобразуем строки в массивы символов
        char[] originalChars = original.toCharArray();
        char[] wordChars = word.toCharArray();

        // Сортируем массивы
        Arrays.sort(originalChars);
        Arrays.sort(wordChars);

        // Сравниваем отсортированные массивы
        return Arrays.equals(originalChars, wordChars);
    }

    public static void main(String[] args) {
        String original = "listen";
        String word = "silent";

        boolean isAnagram = isAnagram(original, word);

        if (isAnagram) {
            System.out.println(word + " является анограммой " + original);
        } else {
            System.out.println(word + " не является анограммой " + original);
        }
    }
}