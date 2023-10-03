package org.ulpgc.is1.control;

import org.ulpgc.is1.model.Author;
import org.ulpgc.is1.model.BookCatalog;
import org.ulpgc.is1.model.Subject;


public class Main {
    public static void main(String[] args) {

        BookCatalog catalog = new BookCatalog();
        init(catalog);
        System.out.println(catalog.bookcount());
        System.out.println(catalog.getBook(2).getAuthor().getName());
        System.out.println(catalog.getBook(2).getTitle());

    }

    private static void init(BookCatalog catalog){
        catalog.addBook("title1", "editor1", 2002, Subject.Novel, new Author("name1", "surname1"));
        catalog.addBook("title2", "editor2", 2004, Subject.Cinema, new Author("name2", "surname2"));
        catalog.addBook("title3", "editor3", 2006, Subject.Art, new Author("name3", "surname3"));
        catalog.addBook("title4", "editor4", 2009, Subject.Languages, new Author("name4", "surname4"));
    }

}
