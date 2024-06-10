package lesson10.inputOutput;

import java.io.*;

public class PersonToFileService {

    public static void main(String[] args) throws IOException {

        PersonToFile person = new PersonToFile("Sasha", 29);
        PersonToFile person2 = new PersonToFile("Dima", 53);

        try (FileOutputStream fos = new FileOutputStream(new File("example.txt"))) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
            objectOutputStream.writeObject(person);
            System.out.println("Объект в файл");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileInputStream fis = new FileInputStream(new File("example.txt"));
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Object o = ois.readObject();
            System.out.println("Объект из файла");
            System.out.println(o);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
