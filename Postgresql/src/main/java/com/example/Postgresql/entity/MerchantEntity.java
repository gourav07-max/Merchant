package com.example.Postgresql.entity;


import javax.persistence.*;

@Entity
@Table(name="merchant")
public class MerchantEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    public Integer id;

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



    public MerchantEntity(Integer id, String password, String name, String rating,String email) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.rating = rating;
        this.email=email;
    }

    public MerchantEntity() {

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
