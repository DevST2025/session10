package com.example.ss10.model;

public class Product {
    private long id ;
    private String name;
    private double price;
    private String description;
    private String imgProduct;
    private int stock;

    public Product() {
    }

    public Product(long id, String name, double price, String description, String imgProduct, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.imgProduct = imgProduct;
        this.stock = stock;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgProduct() {
        return imgProduct;
    }

    public void setImgProduct(String imgProduct) {
        this.imgProduct = imgProduct;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
