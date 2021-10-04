package main.java.com.app.lecture_4_oop.library.service;

import com.app.lecture_4_oop.library.dao.LibraryService;
import com.app.lecture_4_oop.library.dao.impl.LibraryServiceImp;
import com.app.lecture_4_oop.library.domain.Book;
import com.app.lecture_4_oop.library.domain.Library;

public class DemoService {

    public static void test() {

        Library library = new Library();

        Book[] books = library.getBooks();
        books[0] = new Book("Java - 8");
        books[1] = new Book("Java - 6");
        books[2] = new Book("Java - 7");
        library.setBooks(books);

        LibraryService libraryService = new LibraryServiceImp();
        libraryService.addBook(library, books[0]);

        libraryService.addBook(library, books[1]);

        libraryService.addBook(library, books[2]);

        System.out.println("List add books");
        libraryService.listBooks(library);

        System.out.println();
        libraryService.deleteBook(library, "Java - 6");
        System.out.println("List after deleting books");
        libraryService.listBooks(library);

        System.out.println();
        libraryService.searchBook(library, "Java - 8");

    }

}
