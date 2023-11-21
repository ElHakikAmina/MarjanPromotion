package com.youcode.Marjan.Repositories;

import com.youcode.Marjan.Models.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
