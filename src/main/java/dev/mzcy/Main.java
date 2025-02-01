package dev.mzcy;

import dev.mzcy.book.Book;
import dev.mzcy.book.details.BookDetails;
import dev.mzcy.library.Library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        library.addBook(new Book(new BookDetails("The Lord of the Rings", "J.R.R. Tolkien", "978-3-16-148410-0", "Example", 1990, 1000), false));
        library.addBook(new Book(new BookDetails("The Hobbit", "J.R.R. Tolkien", "978-3-16-148410-1", "Example", 1990, 1000), false));
        library.addBook(new Book(new BookDetails("The Silmarillion", "J.R.R. Tolkien", "978-3-16-148410-2", "Example", 1990, 1000), false));

        while (true) {
            System.out.println("1. Display books");
            System.out.println("2. Borrow book");
            System.out.println("3. Return book");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                for (int i = 0; i < 200; i++) {
                    System.out.println();
                }
                System.out.println("Invalid choice.");
                scanner.nextLine();
                continue;
            }
            scanner.nextLine();

            String isbn;
            switch (choice) {
                case 1:
                    for (int i = 0; i < 200; i++) {
                        System.out.println();
                    }
                    library.displayBooks();
                    break;
                case 2:
                    for (int i = 0; i < 200; i++) {
                        System.out.println();
                    }
                    System.out.print("Enter ISBN: ");
                    isbn = scanner.nextLine();
                    library.borrowBook(isbn);
                    break;
                case 3:
                    for (int i = 0; i < 200; i++) {
                        System.out.println();
                    }
                    System.out.print("Enter ISBN: ");
                    isbn = scanner.nextLine();
                    library.returnBook(isbn);
                    break;
                case 4:
                    for (int i = 0; i < 200; i++) {
                        System.out.println();
                    }
                    System.out.println("Exiting...");
                    scanner.close();
                    break;
                default:
                    for (int i = 0; i < 200; i++) {
                        System.out.println();
                    }
                    System.out.println("Invalid choice.");
            }
        }
    }
}
