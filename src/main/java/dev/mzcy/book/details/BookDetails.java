package dev.mzcy.book.details;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(fluent = true)
public class BookDetails {

    String title;
    String author;
    String isbn;
    String publisher;
    int year;
    int pages;

    @Override
    public String toString() {
        return title + " by " + author + " (" + year + ") - " + pages + " pages, ISBN: " + isbn + ", published by " + publisher + ".";
    }
}
