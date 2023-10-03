package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {
    private List<Book> bookList;

    public BookCatalog() {
        bookList = new ArrayList<>();

    }
    public int bookcount(){
        return bookList.size();

    }
    public void addBook(String title, String editor, int year, Subject subject, Author author){
        bookList.add(new Book(title,editor,year,subject,author));

    }
    public void removeBook(int index){
        bookList.remove(index);
    }
    public Book getBook(int index){
        return bookList.get(index);
    }

}

