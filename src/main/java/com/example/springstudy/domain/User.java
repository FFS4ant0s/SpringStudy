package com.example.springstudy.domain;

public class User {
    private String name;
    private String email;



    public User() {
    }


    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
