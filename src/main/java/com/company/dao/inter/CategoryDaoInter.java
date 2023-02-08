package com.company.dao.inter;

import com.company.entity.Category;

import java.util.List;

public interface CategoryDaoInter {
    public List<Category> getCategories();

    public Category getCategory(int id);

    public Category addCategory(Category category);
}
