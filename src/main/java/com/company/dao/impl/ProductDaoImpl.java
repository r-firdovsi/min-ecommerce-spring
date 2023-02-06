package com.company.dao.impl;

import com.company.dao.inter.ProductDaoInter;
import com.company.entity.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDaoInter {

    @PersistenceContext
    EntityManager em;

    @Override
    public List<Product> getProducts() {
        String jpql = "select p from Product p";
        Query query = em.createQuery(jpql, Product.class);
        return query.getResultList();
    }

    @Override
    public Product addProduct(Product product) {
        em.persist(product);
        return product;
    }
}
