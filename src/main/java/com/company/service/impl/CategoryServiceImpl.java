package com.company.service.impl;

import com.company.dao.inter.CategoryDaoInter;
import com.company.entity.Category;
import com.company.service.inter.CategoryServiceInter;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryServiceInter {
    @Autowired
    private CategoryDaoInter categoryDao;

    @Override
    public Category getCategory(int id) {
        return categoryDao.getCategory(id);
    }
}
