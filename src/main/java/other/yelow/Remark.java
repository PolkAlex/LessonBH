package other.yelow;

import java.util.ArrayList;
import java.util.List;

public class Remark {

    //Найти все полки в библиотеке, на которых стоят книги Ремарка

    public static void main(String[] args) {

        List<String> books = new ArrayList<>();

        books.add("Remark 35646");
        books.add("Pushkin 54546643");
        books.add("Tolstoy 43743");
        books.add("Remark 455673");
        books.add("Gogol'");
        books.add("Lermontov 7547");

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).toLowerCase().contains("remark")) {
                System.out.println(books.get(i));
            }
        }
    }
}
