package dev.mzcy.library;

import dev.mzcy.book.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        books.forEach(System.out::println);
    }

    public void borrowBook(String isbn) {
        Book book = books.stream()
                .filter(b -> b.details().isbn().equals(isbn))
                .findFirst()
                .orElse(null);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }
        book.borrowBook();
        System.out.println("Book borrowed: " + book.details().toString());
    }

    public void returnBook(String isbn) {
        Book book = books.stream()
                .filter(b -> b.details().isbn().equals(isbn))
                .findFirst()
                .orElse(null);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }
        book.returnBook();
        System.out.println("Book returned: " + book.details().toString());
    }

}
