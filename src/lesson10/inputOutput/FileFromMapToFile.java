package lesson10.inputOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FileFromMapToFile {

    public static void main(String[] args) throws IOException {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "tree");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(1, "seven");
        map.put(1, "eight");
        map.put(1, "nine");
        map.put(1, "ten");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("example.txt"))) {
            Set<Map.Entry<Integer, String>> entries = map.entrySet();
            for (Map.Entry<Integer, String> entry : entries) {
                bw.write(entry.getKey() + " : " + entry.getValue());
                bw.newLine();
            }
        }
    }

}
