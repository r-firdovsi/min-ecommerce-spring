package com.company.service.impl;

import com.company.dao.inter.CategoryDaoInter;
import com.company.entity.Category;
import com.company.service.inter.CategoryServiceInter;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryServiceInter {
    @Autowired
    private CategoryDaoInter categoryDao;

    @Override
    public List<Category> getCategories() {
        return categoryDao.getCategories();
    }

    @Override
    public Category getCategory(int id) {
        return categoryDao.getCategory(id);
    }

    @Override
    public Category addCategory(Category category) {
        return categoryDao.addCategory(category);
    }
}
