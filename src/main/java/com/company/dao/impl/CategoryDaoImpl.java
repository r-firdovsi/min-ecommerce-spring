package com.company.dao.impl;

import com.company.dao.inter.CategoryDaoInter;
import com.company.entity.Category;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryDaoImpl implements CategoryDaoInter {
    @PersistenceContext
    EntityManager em;

    @Override
    public Category getCategory(int id) {
        Query query = em.createNativeQuery("select * from category where id = ?", Category.class);
        query.setParameter(1, id);

        List<Category> list = query.getResultList();

        if (list.size() == 1) {
            return list.get(0);
        }

        return null;
    }
}
