package com.se.medicaltourism.model;

class FileDocDao{
    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    private String name;

    public FileDocDao(String name, String content) {
        this.name = name;
        this.content = content;
    }

    private String content;

    public void write(){

    }
    public void read(){

    }
};
public class Field {
    private String name;
    private String content;
    private FileDocDao dao;

    public Field(String id) {
        this.name = id;
        this.content = "";
        dao = new FileDocDao(id, content);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
