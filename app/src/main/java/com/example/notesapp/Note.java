package com.example.notesapp;

public class Note {
    private String title;
    private String detail;

    public Note() {
    }

    public Note(String title, String detail) {
        this.title = title;
        this.detail = detail;
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
