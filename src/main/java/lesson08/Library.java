package lesson08;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private final List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public Library(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }

    public Book removeBook(int index) {
        int size = this.books.size();
        if (index > size) {
            throw new IllegalArgumentException("Нет такой ячейки с книгой");
        }
        return this.books.remove(index);
    }

    // 0 (n)
    public Book findByName(String nameBook) {
        for (Book book : this.books) {
            if (book.getTitle().equals(nameBook)) {
                return book;
            }
        }
        throw new IllegalArgumentException("Нет такой книги: " + nameBook);
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }
}
