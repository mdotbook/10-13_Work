package Compositions;

public class Task1_Library
{
    public static void main(String[] args) {
        Book[] bookArr = {
                new Book("Java Basics", "Alice"),
                new Book("OOP Concepts", "Bob"),
                new Book("Data Structures", "Charlie"),
        };
        // Create book array
        Library library = new Library(bookArr);  // Create library
        library.displayBooks();  //Display books
    }
}
