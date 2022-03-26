package com.example.Postgresql.dto;

public class MerchantProduct {
    private Integer merchantid;
    private Integer productId;
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

    public MerchantProduct(Integer merchantid, Integer productId, Integer price, Integer stock, Integer soldProducts, Integer productname, String merchantname, String description, String imageurl, String category, Integer rating, Integer algovalue) {
        this.merchantid = merchantid;
        this.productId = productId;
        this.price = price;
        this.stock = stock;
        this.soldProducts = soldProducts;
        this.productName = productname;
        this.merchantName = merchantname;
        this.description = description;
        this.imageurl = imageurl;
        this.category = category;
        this.rating = rating;
        this.algoValue = algovalue;
    }



    public Integer getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(Integer merchantid) {
        this.merchantid = merchantid;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
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

    public Integer getProductname() {
        return productName;
    }

    public void setProductname(Integer productname) {
        this.productName = productname;
    }

    public String getMerchantname() {
        return merchantName;
    }

    public void setMerchantname(String merchantname) {
        this.merchantName = merchantname;
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

    public Integer getAlgovalue() {
        return algoValue;
    }

    public void setAlgovalue(Integer algovalue) {
        this.algoValue = algovalue;
    }











}
