package com.company.controller;

import com.company.dto.ProductDTO;
import com.company.dto.ResponseDTO;
import com.company.entity.Product;
import com.company.service.inter.CategoryServiceInter;
import com.company.service.inter.ProductServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductRestController {
    @Autowired
    private ProductServiceInter productService;

    @GetMapping("/products")
    public ResponseEntity<ResponseDTO> getProducts() {
        List<Product> products = productService.getProducts();

        return ResponseEntity.ok(ResponseDTO.of(products));
    }

    @PostMapping("/products")
    public ResponseEntity<ResponseDTO> createProducts(@RequestBody ProductDTO productDTO) {
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setDescription(productDTO.getDescription());
        product.setPrice(productDTO.getPrice());
        product.setDiscountedPrice(productDTO.getDiscountedPrice());
        product.setPhoto(productDTO.getPhoto());
        product.setQuantity(productDTO.getQuantity());

        productDTO = new ProductDTO(productService.addProduct(product));

        return ResponseEntity.ok(ResponseDTO.of(productDTO));
    }
}
