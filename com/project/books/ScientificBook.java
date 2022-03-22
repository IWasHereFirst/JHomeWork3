package com.project.books;

public class ScientificBook extends Book{

    private String genre;

    public ScientificBook(String name, String author, int pages, String genre) {
        super(name, author, pages);
        this.genre = genre;
    }
}
