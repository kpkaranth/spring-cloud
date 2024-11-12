package com.example.productmanagement.controller.service;

import com.example.productmanagement.entity.Product;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    public List<Product> getProducts() {

      return Arrays.asList(Product.builder().id(1L)
              .description("desc-1")
              .imageUrl("imageUrl-1")
                      .name("name-1")
              .price(BigDecimal.valueOf(100)).build());

    }
}
