package com.example.entity;

import com.example.entity.Base.IntegerBaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "category")
@Getter
@Setter
public class CategoryEntity extends IntegerBaseEntity {

    @Column(name = "name")
    private String name;
}
