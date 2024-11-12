package com.example.productmanagement.entity;


import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Product {

    Long id;
    String name;
    String description;
    String imageUrl;
    BigDecimal price;
}
