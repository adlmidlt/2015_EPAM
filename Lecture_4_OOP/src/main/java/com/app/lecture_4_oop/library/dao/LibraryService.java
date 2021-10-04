package main.java.com.app.lecture_4_oop.library.dao;

import main.java.com.app.lecture_4_oop.library.domain.Book;
import main.java.com.app.lecture_4_oop.library.domain.Library;

public interface LibraryService {

    void listBooks(Library library);
    Book addBook(Library library, Book book);
    Book deleteBook(Library library, String nameBook);
    Book searchBook(Library library, String nameBook);
}
