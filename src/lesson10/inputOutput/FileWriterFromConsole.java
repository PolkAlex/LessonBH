package lesson10.inputOutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileWriterFromConsole {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для записи в файл");
        List<String> strings = new ArrayList<>();
        boolean flag = true;
        while (flag) {
            String fromConsole = scanner.nextLine();
            if (fromConsole.equals("end")) {
                flag = false;
            } else {
                strings.add(fromConsole);
            }
        }

        try (OutputStream bw = new FileOutputStream("example.txt")) {
            for (String string : strings) {
                bw.write(string.getBytes());
            }
            System.out.println("Текст записан в файл");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
