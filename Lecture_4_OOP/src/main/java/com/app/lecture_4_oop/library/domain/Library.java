package main.java.com.app.lecture_4_oop.library.domain;

import java.util.Arrays;

public class Library {

    private Book[] books;

    public Library() {
        books = new Book[3];
    }

    public Library(Book[] books) {
        this.books = books;
    }


    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(books, library.books);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(books);
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
