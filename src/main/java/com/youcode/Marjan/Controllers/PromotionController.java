package com.youcode.Marjan.Controllers;

import com.youcode.Marjan.Models.Dto.PromotionDto;
import com.youcode.Marjan.Models.Entity.Promotion;
import com.youcode.Marjan.Services.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
@RequestMapping("/api/v1/promotions")
public class PromotionController {
    private final PromotionService promotionService;

    @Autowired
    public PromotionController(PromotionService promotionService){
        this.promotionService = promotionService;
    }

    @GetMapping
    public List<PromotionDto> getPromotions(){
        return promotionService.getPromotions();
    }

    @GetMapping("/{id}")
    public PromotionDto getPromotion(@PathVariable Long id){
        return promotionService.getPromotionById(id);
    }

    @PostMapping("/create")
    public Promotion createPromotion(@RequestBody PromotionDto promotion){
        return promotionService.createPromotion(promotion);
    }

}
