package com.company.dto;

import com.company.entity.Category;
import com.company.entity.Image;
import com.company.entity.Product;

import java.util.List;

public class ProductDTO {
    private long id;
    private String name;
    private String description;
    private double price;
    private double discountedPrice;
    private String mainImage;
    private int quantity;
    private Category category;
    private List<Image> imageList;

    public ProductDTO() {
    }

    public ProductDTO(Product p) {
        this.id = p.getId();
        this.name = p.getName();
        this.description = p.getDescription();
        this.price = p.getPrice();
        this.discountedPrice = p.getDiscountedPrice();
        this.mainImage = p.getMainImage();
        this.quantity = p.getQuantity();
        this.category = p.getCategory();
        this.imageList = p.getImageList();
    }

    public ProductDTO(int id, String name, String description, double price, double discountedPrice, String mainImage, int quantity, Category category, List<Image> imageList) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.discountedPrice = discountedPrice;
        this.mainImage = mainImage;
        this.quantity = quantity;
        this.category = category;
        this.imageList = imageList;
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

    public String getMainImage() {
        return mainImage;
    }

    public void setMainImage(String mainImage) {
        this.mainImage = mainImage;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Image> getImageList() {
        return imageList;
    }

    public void setImageList(List<Image> imageList) {
        this.imageList = imageList;
    }
}
