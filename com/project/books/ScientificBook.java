package com.project.books;

public class ScientificBook extends Book{

    public ScientificBook(String name, String author, int pages) {
        super(name, author, pages);
    }

    public ScientificBook(String name, String author, int pages, String genre) {
        super(name, author, pages, genre);
    }
}
