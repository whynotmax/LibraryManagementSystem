package dev.mzcy.book;

import dev.mzcy.book.details.BookDetails;
import dev.mzcy.book.exception.BookAlreadyBorrowedException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(fluent = true)
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class Book {

    BookDetails details;
    boolean isBorrowed;

    public void borrowBook() {
        if (isBorrowed) {
            throw new BookAlreadyBorrowedException("Book is already borrowed.");
        }
        isBorrowed = true;
    }

    public void returnBook() {
        if (!isBorrowed) {
            throw new BookAlreadyBorrowedException("Book is not borrowed.");
        }
        isBorrowed = false;
    }

    @Override
    public String toString() {
        return details.toString() + (isBorrowed ? " (not available)" : " (available)");
    }
}
