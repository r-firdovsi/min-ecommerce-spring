package com.company.dao.inter;

import com.company.entity.Product;

import java.util.List;

public interface ProductDaoInter {
    public List<Product> getProducts();

    public Product addProduct(Product product);
}
