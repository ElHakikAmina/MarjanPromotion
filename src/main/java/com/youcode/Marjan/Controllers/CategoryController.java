package com.youcode.Marjan.Controllers;

import com.youcode.Marjan.Models.Dto.CategoryDto;
import com.youcode.Marjan.Models.Entity.Category;
import com.youcode.Marjan.Services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RestController
@RequestMapping("/api/v1/categories")
public class CategoryController {
    private final CategoryService categoryService;
    
    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<CategoryDto> getAllCategories(){
        return categoryService.getAllCategories();
    }

    @PostMapping("/create")
    public ResponseEntity<String> createAdmin(@RequestBody CategoryDto categoryDto) {
        categoryService.saveAdmin(categoryDto);
        return new ResponseEntity<>("Category created successfully", HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public Optional<Category> getCategoryById(@PathVariable Long id){
        return categoryService.getCategoryById(id);
    }
}
