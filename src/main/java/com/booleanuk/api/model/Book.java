package com.booleanuk.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;

    @Column(name = "title")
    private String title;

    @Column(name = "genre")
    private String genre;

    @ManyToOne
    @JoinColumn(name = "author_id")
    @JsonIgnoreProperties({"books"})
    private Author author;

    @ManyToOne
    @JoinColumn(name = "publisher_id")
    @JsonIgnoreProperties({"books"})
    private Publisher publisher;

    public Book() {
    }

    public Book(String title, String genre, Author author, Publisher publisher) {
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.publisher = publisher;
    }

    public Integer getBookId() {
        return this.bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return this.publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
}
