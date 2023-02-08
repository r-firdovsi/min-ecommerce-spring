package com.company.dto;

import com.company.entity.Category;
import com.company.entity.Photo;
import com.company.entity.Product;

import java.util.List;

public class ProductDTO {
    private long id;
    private String name;
    private String description;
    private double price;
    private double discountedPrice;
    private String photo;
    private int quantity;

    public ProductDTO() {
    }

    public ProductDTO(Product p) {
        this.id = p.getId();
        this.name = p.getName();
        this.description = p.getDescription();
        this.price = p.getPrice();
        this.discountedPrice = p.getDiscountedPrice();
        this.photo = p.getPhoto();
        this.quantity = p.getQuantity();
    }

    public ProductDTO(int id, String name, String description, double price, double discountedPrice, String photo, int quantity, Category category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.discountedPrice = discountedPrice;
        this.photo = photo;
        this.quantity = quantity;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
