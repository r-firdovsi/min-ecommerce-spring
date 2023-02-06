package com.company.service.impl;

import com.company.dao.inter.ProductDaoInter;
import com.company.entity.Product;
import com.company.service.inter.ProductServiceInter;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductServiceInter {

    @Autowired
    private ProductDaoInter productDao;

    @Override
    public List<Product> getProducts() {
        return productDao.getProducts();
    }

    @Override
    public Product addProduct(Product product) {
        return productDao.addProduct(product);
    }
}
