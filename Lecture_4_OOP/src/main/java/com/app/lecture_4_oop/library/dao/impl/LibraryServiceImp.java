package main.java.com.app.lecture_4_oop.library.dao.impl;

import main.java.com.app.lecture_4_oop.library.dao.LibraryService;
import main.java.com.app.lecture_4_oop.library.domain.Book;
import main.java.com.app.lecture_4_oop.library.domain.Library;

public class LibraryServiceImp implements LibraryService {

    @Override
    public void listBooks(Library library) {
        Book[] books = library.getBooks();
        for (Book listBook :
                books) {
            System.out.println(listBook);
        }
    }

    @Override
    public Book addBook(Library library, Book book) {

        Book[] books = library.getBooks();
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = new Book();
            }
        }
        System.out.printf("%s add in library%n", book);
        library = new Library(new Book[]{book});
        System.out.println(library);
        System.out.println();
        return null;
    }

    @Override
    public Book deleteBook(Library library, String nameBook) {
        Book[] books = library.getBooks();

        for (int i = 0; i < books.length - 1; i++) {
            books[i] = books[i++];
            books[i] = null;
        }
        return null;
    }

    @Override
    public Book searchBook(Library library, String nameBook) {

        Book[] books = library.getBooks();
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getNameBook().equals(nameBook)) {
                System.out.printf("%s found in library %n", books[i].getNameBook());
            }
        }
        return null;
    }
}
