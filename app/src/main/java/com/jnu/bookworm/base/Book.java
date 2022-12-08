package com.jnu.bookworm.base;

import java.io.Serializable;

public class Book implements Serializable {
    private String title;
    private String jianjie;
    private String headId;

    public Book(String title, String jianjie,String headId) {
        this.title = title;
        this.headId = headId;
        this.jianjie=jianjie;
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
