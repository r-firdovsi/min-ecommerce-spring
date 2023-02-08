package com.company.service.inter;

import com.company.entity.Category;

import java.util.List;

public interface CategoryServiceInter {
    public List<Category> getCategories();

    public Category getCategory(int id);

    public Category addCategory(Category category);
}
