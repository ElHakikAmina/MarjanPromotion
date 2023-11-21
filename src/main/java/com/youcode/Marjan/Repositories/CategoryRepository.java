package com.youcode.Marjan.Repositories;

import com.youcode.Marjan.Models.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
