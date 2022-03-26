package com.example.Postgresql.entity;


import javax.persistence.*;

@Entity
@Table(name="merchantproduct")
public class MerchantProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Integer id;

    @ManyToOne
    //Adding the name
    @JoinColumn(name = "merchantid", referencedColumnName = "id")
    MerchantEntity merchantEntity;


    private Integer productid;
    private Integer price;
    private Integer stock;
    private Integer soldProducts;
    private Integer productName;
    private String merchantName;
    private String description;
    private String imageurl;
    private String category;
    private Integer rating;
    private Integer algoValue;

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getSoldProducts() {
        return soldProducts;
    }

    public void setSoldProducts(Integer soldProducts) {
        this.soldProducts = soldProducts;
    }

    public Integer getProductName() {
        return productName;
    }

    public void setProductName(Integer productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Integer getAlgoValue() {
        return algoValue;
    }

    public void setAlgoValue(Integer algoValue) {
        this.algoValue = algoValue;
    }


    public MerchantEntity getMerchantEntity() {
        return merchantEntity;
    }

    public Integer setMerchantEntity(MerchantEntity merchantEntity) {
        this.merchantEntity = merchantEntity;
        return null;
    }



    public MerchantProductEntity(){}







}
