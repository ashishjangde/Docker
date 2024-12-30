package com.ecommerce.product_service.controllers;

import com.ecommerce.product_service.entities.ProductEntity;
import com.ecommerce.product_service.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductRepository productRepository;

    @GetMapping
    public ResponseEntity<List<ProductEntity>> getAllProducts() {
        List<ProductEntity> productEntities = productRepository.findAll();
        return ResponseEntity.ok(productEntities);
    }

    @PostMapping
    public ResponseEntity<ProductEntity> addProduct(@RequestBody ProductEntity productEntity) {
        ProductEntity savedProduct = productRepository.save(productEntity);
        return ResponseEntity.ok(savedProduct);
    }
    
}
