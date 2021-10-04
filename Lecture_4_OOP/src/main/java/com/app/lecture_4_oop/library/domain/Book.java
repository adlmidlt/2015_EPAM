package main.java.com.app.lecture_4_oop.library.domain;

import java.util.Objects;

public class Book {

    private String nameBook;

    public Book() {
    }

    public Book(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(nameBook, book.nameBook);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nameBook);
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                '}';
    }
}
