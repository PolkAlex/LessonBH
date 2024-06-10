package other.yelow;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BlaBla {

    public static void main(String[] args) {

        int[][] ints = new int[][]{
                {1,2,3,4,5},
                {6,7,8,9,0}
        };

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.print(ints[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------");

        String original = "корова";
        String newWord = "олово";

        boolean isAmogram = isAmogramma(original, newWord);

        if (isAmogram) {
            System.out.println("Слово " + original + " является анограммой");
        } else {
            System.out.println("Слово " + original + " не является анограммой");
        }
    }

    public static boolean isAmogramma (String original, String newWord) {

        char[] originalChars = original.toCharArray();
        char[] newWordChars = newWord.toCharArray();

        Arrays.sort(originalChars);
        Arrays.sort(newWordChars);

        return Arrays.equals(originalChars, newWordChars);
    }
}
