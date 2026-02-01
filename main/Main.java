package main;

import entity.Book;

import repository.ListBookRepo;
import ui.IBookRepo;

public class Main {

    public static void main(String[] args) {

        // Polymorphism: interface reference, class object
        IBookRepo bookRepo = new ListBookRepo();

        // Adding books
        bookRepo.addBook(new Book(1, "Java Basics", "James Gosling"));
        bookRepo.addBook(new Book(2, "OOPS Concepts", "Herbert Schildt"));
        bookRepo.addBook(new Book(3, "C++ Concepts", "Afrah jasmine"));
        bookRepo.addBook(new Book(4, "DSA Concepts", "Brinda"));


        // Fetching a book by ID
        Book Book = bookRepo.getBookById(4);
        if (Book != null) {
            System.out.println("Book Found:");
            System.out.println(Book.getBookname() + " by " + Book.getAuthorname());
        } else {
            System.out.println("Book not found");
        }

        // Displaying all books
        System.out.println("\nAll Books:");
        for (Book b : bookRepo.getAllBooks()) {
            System.out.println(b.getId() + " - " + b.getBookname());
        }
    }
}
