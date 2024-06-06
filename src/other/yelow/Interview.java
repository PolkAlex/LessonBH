package other.yelow;

import java.util.*;
import java.lang.*;

public class Interview {
    public static void main(String args[])
    {
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