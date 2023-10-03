package org.ulpgc.is1.model;

public class Book {
    private static int NEXT_ID = 0;
    private final int id;
    private String title;
    private String editor;
    private int year;
    private Subject subject;
    private Author author;

    public Book(String title, String editor, int year, Subject subject, Author author) {
        this.id = NEXT_ID++;
        this.title = title;
        this.editor = editor;
        this.year = year;
        this.subject = subject;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
