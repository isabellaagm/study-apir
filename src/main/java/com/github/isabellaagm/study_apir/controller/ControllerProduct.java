package com.github.isabellaagm.study_apir.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.isabellaagm.study_apir.model.Product;
import com.github.isabellaagm.study_apir.service.ProductService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("produtos")
public class ControllerProduct {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<Product> create(@RequestBody Product product) {

        Product productCreated = productService.createProduct(product);

        return ResponseEntity.status(201).body(productCreated);
    
    }

    @DeleteMapping
    public ResponseEntity<Void> delete() {
        return ResponseEntity.status(204).build();

    }

    @PutMapping
    public ResponseEntity<Optional<Product>> update(Long id, @RequestBody Product product) {

        Optional<Product> productUpdated = productService.updateProduct(id, product);

        return ResponseEntity.status(200).body(productUpdated);        
    }

    @GetMapping
    public ResponseEntity<String> find() {
        return ResponseEntity.status(200).body("Maça");        

    }
}