package com.example.productmanagement.controller;


import com.example.productmanagement.controller.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

   @Autowired
    ProductService productService;

   @GetMapping("/products")
    public void getAllProducts() {
       productService.getProducts();
    }

}
