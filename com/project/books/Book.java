package com.project.books;

public class Book {

    // Fields
    private final String NAME;
    private final String AUTHOR;
    private final int PAGES;

    // Constructor
    public Book(String name, String author, int pages) {
        this.NAME = name;
        this.AUTHOR = author;
        this.PAGES = pages;
    }

    // Method Override for this object
    // Method won't show genre's null value if object is constructed without it,
    // because it serves as a simple object's content displaying method, and not
    // for inspecting object's fields values
    @Override
    public String toString() {
        return "Book: " + this.NAME +
                "\nAuthor: " + this.AUTHOR +
                "\nPages: " + this.PAGES;
    }
}
