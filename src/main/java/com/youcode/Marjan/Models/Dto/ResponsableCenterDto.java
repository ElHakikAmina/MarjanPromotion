package com.youcode.Marjan.Models.Dto;

import com.youcode.Marjan.Models.Entity.ResponsableCenter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponsableCenterDto {
    private Long id;
    private String name;
    private String email;
    private String password;

    public static ResponsableCenterDto fromEntity(ResponsableCenter responsableCenter){
        return ResponsableCenterDto.builder()
                .id(responsableCenter.getId())
                .name(responsableCenter.getName())
                .email(responsableCenter.getEmail())
                .build();
    }
}
