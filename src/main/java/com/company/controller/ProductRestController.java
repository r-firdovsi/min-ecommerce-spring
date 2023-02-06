package com.company.controller;

import com.company.dto.ProductDTO;
import com.company.entity.Category;
import com.company.entity.Product;
import com.company.service.inter.CategoryServiceInter;
import com.company.service.inter.ProductServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductRestController {
    @Autowired
    private ProductServiceInter productService;

    @Autowired
    private CategoryServiceInter categoryService;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @PostMapping("/products")
    public Product createProducts(@RequestBody ProductDTO productDTO) {
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setDescription(productDTO.getDescription());
        product.setPrice(productDTO.getPrice());
        product.setDiscountedPrice(productDTO.getDiscountedPrice());
        product.setMainImage(productDTO.getMainImage());
        product.setQuantity(productDTO.getQuantity());

//        Category category = categoryService.getCategory(productDTO.getCategory());
//        product.setCategory(productDTO.getCategory());

        return productService.addProduct(product);
    }
}