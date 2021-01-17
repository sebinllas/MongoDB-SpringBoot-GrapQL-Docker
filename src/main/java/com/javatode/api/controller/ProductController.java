package com.javatode.api.controller;

import com.javatode.api.model.Product;
import com.javatode.api.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> readProducts () {
        return ResponseEntity.ok(productService.readProducts());
    }

    @PostMapping
    public ResponseEntity<Void> createProducts () {
        productService.createProducts();
        return ResponseEntity.ok().build();
    }
}
