package com.mysql.spring_boot_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mysql.spring_boot_crud.entity.Product;

public interface ProductRepository extends JpaRepository<Product, String> {
    Product findByName(String name);

    Product save(Product product);

    Object findById(int id);
}
