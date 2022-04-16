package com.example.books.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Book {
    @NotEmpty(message = "ID is empty!!")
    @Size(min = 2, max = 8)
    private String id;
    @NotEmpty(message = "Name is empty!!")
    private String name;
    @NotEmpty(message = "Author is empty!!")
    private String author;
    @NotEmpty(message = "genre is empty!!")
    private String genre;

    public Book(String id, String name, String author, String genre) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.genre = genre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
