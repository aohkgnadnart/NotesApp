package com.example.notesapp;

public class Note {
    private String id;
    private String title;
    private String detail;

    public Note() {
    }

    public Note(String id, String title, String detail) {
        this.id = id;
        this.title = title;
        this.detail = detail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
