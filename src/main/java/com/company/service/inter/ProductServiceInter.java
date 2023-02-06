package com.company.service.inter;


import com.company.dto.ProductDTO;
import com.company.entity.Product;

import java.util.List;

public interface ProductServiceInter {
    public List<Product> getProducts();

    public Product addProduct(Product product);
}
