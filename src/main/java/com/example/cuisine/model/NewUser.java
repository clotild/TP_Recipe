package com.example.cuisine.model;

public class NewUser {
    private int id;
    private String name;
    private String firstname;
    private String email;
    private String password;
    private String urlphoto;

    public NewUser(int id, String name, String firstname, String email, String password, String urlphoto) {
        this.id = id;
        this.name = name;
        this.firstname = firstname;
        this.email = email;
        this.password = password;
        this.urlphoto = urlphoto;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUrlphoto() {
        return urlphoto;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUrlphoto(String urlphoto) {
        this.urlphoto = urlphoto;
    }
}
