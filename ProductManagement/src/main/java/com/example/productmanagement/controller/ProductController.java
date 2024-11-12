package com.example.productmanagement.controller;


import com.example.productmanagement.controller.service.ProductService;
import com.example.productmanagement.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

   @Autowired
    ProductService productService;

   @GetMapping("/products")
    public List<Product> getAllProducts() {
       return productService.getProducts();
    }

}
