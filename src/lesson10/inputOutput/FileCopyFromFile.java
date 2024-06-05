package lesson10.inputOutput;

import java.io.*;

public class FileCopyFromFile {

    public static void main(String[] args) {

        String namFile = "example.txt";
        String copyFile = "copyExample.txt";

        try {
            Reader is = new FileReader(namFile);
            Writer os = new FileWriter(copyFile);
            int lenght;
            while ((lenght = is.read()) > 0) {
                os.write((char) lenght);
            }
            System.out.println("Копирование завершено");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
