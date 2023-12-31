package com.youcode.Marjan.Models.Dto;

import com.youcode.Marjan.Models.Entity.Product;
import com.youcode.Marjan.Models.Entity.Promotion;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PromotionDto {
    private Long id;
    private String name;
    private String description;
    private Double discountPercentage;
    private Long categoryId;
    private List<Long> productIds = new ArrayList<>();

    public static PromotionDto fromEntity(Promotion promotion) {
        return PromotionDto.builder()
                .id(promotion.getId())
                .name(promotion.getName())
                .description(promotion.getDescription())
                .discountPercentage(promotion.getDiscountPercentage())
                .categoryId(
                        promotion.getCategory() != null ? promotion.getCategory().getId() : null
                )
                .productIds(getProductIds(promotion.getProducts()))
                .build();
    }

    private static List<Long> getProductIds(List<Product> products) {
        return products.stream()
                .map(Product::getId)
                .collect(Collectors.toList());
    }
}
