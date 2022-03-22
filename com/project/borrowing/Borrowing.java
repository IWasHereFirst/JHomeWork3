package com.project.borrowing;

import com.project.books.Book;
import com.project.subscribing.Subscriber;

import java.time.LocalDate;

public class Borrowing {

    // Fields
    private Book book;
    private Subscriber subscriber;
    private LocalDate borrowDate;
    private LocalDate returnDate;

    // Constructor
    public Borrowing(Book book, Subscriber subscriber, LocalDate borrowDate) {
        this.book = book;
        this.subscriber = subscriber;
        this.borrowDate = borrowDate;
    }

    // Setter for returnDate
    public void setReturnDate(LocalDate returnDate){
        this.returnDate = returnDate;
    }
}
