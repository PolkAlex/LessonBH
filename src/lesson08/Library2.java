package lesson08;

import java.util.HashMap;
import java.util.Map;

public class Library2 {

    private Map<String, Book> books;

    public Library2(Map<String, Book> books) {
        this.books = books;
    }

    public Library2() {
        this.books = new HashMap<>();
    }

    public void addBook (Book book) {
        this.books.put(book.getTitle(), book);
    }

    public Book removeBook (Book book) {
        return this.books.remove(book);
    }

    // 0 (1)
    public Book findBookByName (String name) {
        Book book = this.books.get(name);
        if (book==null) {
            throw new IllegalArgumentException("Нет такой книги: " + name);
        } else {
            return book;
        }
    }

    public Map<String, Book> getBooks() {
        return this.books;
    }

    @Override
    public String toString() {
        return "Library2{" +
                "books=" + books +
                '}';
    }
}
