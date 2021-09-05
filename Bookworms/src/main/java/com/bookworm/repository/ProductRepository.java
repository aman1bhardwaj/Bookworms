package com.bookworm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bookworm.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
