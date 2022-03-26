package com.example.Postgresql.dto;

import java.io.Serializable;

public class Merchant implements Serializable {

    private Integer id;
    private String password;
    private String name;
    private String rating;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;

    public Merchant(Integer id, String rating, String password, String name,String email) {
        this.id = id;
        this.rating = rating;
        this.password = password;
        this.name = name;
        this.email=email;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
