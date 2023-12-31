package com.sudip.ecommerce_poc.repository;

import com.sudip.ecommerce_poc.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Products, Integer> {
}
