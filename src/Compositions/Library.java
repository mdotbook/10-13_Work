package Compositions;

public class Library
{
    Book[] books; // (6) array of books

    Library(Book[] books) { // (7) constructor
        this.books = books;
    }

    void displayBooks() { // (8) display all books
        System.out.println("Library Books:");
        for (Book b : books) { // (9) for-each loop
            System.out.printf("Title: %s, Author: %s%n", b.title, b.author);
        }
    }

}
