package com.ecommerce.springboot_ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.springboot_ecommerce.Product;
import com.ecommerce.springboot_ecommerce.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getallProducts(){
        return productRepository.findAll();
    }

    public List<Product> getProductsByCategoryId(Long categoryId){
        return productRepository.findbyCategoryId(categoryId);
    } 

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

}
