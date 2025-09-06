package com.ecommerce.springboot_ecommerce;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{

    List<Product> findbyCategoryId(Long categoryId);

    
}
