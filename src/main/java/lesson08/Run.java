package lesson08;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Run {

    public static void main(String[] args) {

        Book java = new Book("java", "John Lennon", 2020);
        Book csh = new Book("c#", "John Travollta", 2000);
        Book python = new Book("python", "Alan Smith", 2013);
        Book js = new Book("js", "James Kameron", 2024);
        Book koltin = new Book("koltin", "John Lennon", 2005);

        Library library = new Library();

        library.addBook(java);
        library.removeBook(csh);

//        library.findByName("rgwg");
        System.out.println(library.findByName("java"));

        System.out.println(library);

        System.out.println("-----------------------------");

        Library2 library2 = new Library2();
        library2.addBook(java);
        library2.addBook(koltin);
        library2.removeBook(java);
        library2.addBook(java);
//        System.out.println(library2.findBookByName("js"));

        System.out.println("-----------------------------");

        library2.addBook(java);
        library2.addBook(csh);
        library2.addBook(koltin);
        library2.addBook(js);
        library2.addBook(python);

        Map<String, Book> books = library2.getBooks();
        Set<Map.Entry<String, Book>> entries = books.entrySet();
        for (Map.Entry<String, Book> entry : entries) {
            String key = entry.getKey();
            Book value = entry.getValue();
            System.out.println("Ключ: " + key + ", значение: " + value);
            System.out.println("********************");
            int newYear = value.getYear() - 1;
            value.setYear(newYear);
            System.out.println("Ключ: " + key + ", значение: " + newYear);
        }

        System.out.println("-----------------------------");

        Set<String> keys = books.keySet();
        System.out.println(keys);

        System.out.println("-----------------------------");

        Collection<Book> values = books.values();
        for (Book value : values) {
            System.out.println(value);
            int newYear = value.getYear() - 500;
            value.setYear(newYear);
            System.out.println(value);
        }
    }
}
