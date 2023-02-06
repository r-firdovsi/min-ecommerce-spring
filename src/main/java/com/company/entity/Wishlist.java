package com.company.entity;

import jakarta.persistence.*;

@Entity
public class Wishlist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @JoinColumn(name = "product_id", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;

    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;

    public Wishlist() {
    }

    public Wishlist(Long id, Product product, Customer customer) {
        this.id = id;
        this.product = product;
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
