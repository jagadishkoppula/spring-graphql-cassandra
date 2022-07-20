package com.springgraphql.sample.bookdetails.data;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table(value="books")
public class Book {
    @PrimaryKey
    @Column(value="id")
    private String id;
    @Column(value="name")
    private String name;
    @Column(value="pageCount")
    private int pageCount;
    @Column(value="author")
    private String author;

    public Book(String id, String name, int pageCount, String author) {
        this.id = id;
        this.name = name;
        this.pageCount = pageCount;
        this.author = author;
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

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getAuthorId() {
        return author;
    }

    public void setAuthorId(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", pageCount=" + pageCount +
                ", author='" + author + '\'' +
                '}';
    }
}
