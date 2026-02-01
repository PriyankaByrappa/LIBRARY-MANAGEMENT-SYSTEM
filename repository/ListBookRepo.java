package repository;

import java.util.ArrayList;

import java.util.List;

import entity.Book;
import ui.IBookRepo;

public class ListBookRepo implements IBookRepo { // implements Ibookrepo

    private List<Book> books = new ArrayList<>(); // this replaces a database for now(mini-project)

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public Book getBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null; // book not found
    }

    @Override
    public List<Book> getAllBooks() {
        return books;
    }
}

