package com.project.books;

public class ForeignBook extends Book{

    public ForeignBook(String name, String author, int pages) {
        super(name, author, pages);
    }

    public ForeignBook(String name, String author, int pages, String genre) {
        super(name, author, pages, genre);
    }
}
