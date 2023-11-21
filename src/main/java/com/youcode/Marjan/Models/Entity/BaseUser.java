package com.youcode.Marjan.Models.Entity;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseUser {
    private String name;
    private String email;
    private String password;
}
