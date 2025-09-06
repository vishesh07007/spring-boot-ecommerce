package com.ecommerce.springboot_ecommerce;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long>{

    // Spring Data JPA will automatically provide:
    // - save() - save category to database
    // - findAll() - get all categories
    // - findById() - find category by ID
    // - deleteById() - delete category
    // - and many more!

}
