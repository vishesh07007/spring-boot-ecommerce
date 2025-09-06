package com.ecommerce.springboot_ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.springboot_ecommerce.Category;
import com.ecommerce.springboot_ecommerce.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getallCategory(){
        return categoryRepository.findAll();
    }

    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    public Category saveCategory(Category category){
        return categoryRepository.save(category);
    }
 
}
