package com.example.setting.model;

public class Email {
    private int id;
    private String email;
    private Setting setting;

    public Email() {
    }

    public Email(int id, String email, Setting setting) {
        this.id = id;
        this.email = email;
        this.setting = setting;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Setting getSetting() {
        return setting;
    }

    public void setSetting(Setting setting) {
        this.setting = setting;
    }
}

