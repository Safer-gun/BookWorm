package com.jnu.bookworm.base;

import java.io.Serializable;

public class Book implements Serializable {
    private String title;
    private String jianjie;
    private String headId;
    private String isbn;
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Book(String title, String jianjie, String headId,String isbn,String author) {
        this.title = title;
        this.headId = headId;
        this.jianjie=jianjie;
        this.isbn=isbn;
        this.author=author;
    }

    public String getTitle() {
        return title;
    }
    public String getJianjie() {return jianjie;}

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHeadId() {
        return headId;
    }

    public void setHeadId(String headId) {
        this.headId = headId;
    }
    public void setJianjie(String jianjie) {this.jianjie = jianjie;}

}
