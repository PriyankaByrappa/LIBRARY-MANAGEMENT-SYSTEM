//package ui;
//
//public class IBookRepo {
//	private getBookById();
//	private getAllUsers();
//	private addUser();
//
//}
//package ui;
//
//import java.util.List;
//import entity.Book;
//
//public interface IBookRepo {
//
//    Book getBookById(int id);
//
//    List<Book> getAllBooks();
//
//    void addBook(Book Book);
//}
package ui;

import entity.Book;

import java.util.List;

public interface IBookRepo {
    void addBook(Book book);
    Book getBookById(int id);
    List<Book> getAllBooks();
}
