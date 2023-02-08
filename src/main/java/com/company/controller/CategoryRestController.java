package com.company.controller;

import com.company.dto.CategoryDTO;
import com.company.dto.ResponseDTO;
import com.company.entity.Category;
import com.company.service.inter.CategoryServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryRestController {

    @Autowired
    private CategoryServiceInter categoryServiceInter;

    @GetMapping("/categories")
    public ResponseEntity<ResponseDTO> getCategories() {
        List<Category> categories = categoryServiceInter.getCategories();

        return ResponseEntity.ok(ResponseDTO.of(categories));
    }

    @GetMapping("/categories/{id}")
    public ResponseEntity<ResponseDTO> getCategory(@PathVariable("id") int id) {
        Category category = categoryServiceInter.getCategory(id);
        CategoryDTO categoryDTO = new CategoryDTO(category);

        return ResponseEntity.ok(ResponseDTO.of(categoryDTO));
    }

    @PostMapping("/categories")
    public ResponseEntity<ResponseDTO> createCategory(@RequestBody CategoryDTO categoryDTO) {
        Category category = new Category();
        category.setName(categoryDTO.getName());
        category.setDescription(categoryDTO.getDescription());

        categoryDTO = new CategoryDTO(categoryServiceInter.addCategory(category));

        return ResponseEntity.ok(ResponseDTO.of(categoryDTO));
    }
}
