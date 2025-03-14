package com.github.isabellaagm.study_apir.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.github.isabellaagm.study_apir.dto.ProductRequestCreate;
import com.github.isabellaagm.study_apir.model.Product;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();

    private Long sequence = 1L;

    public Product createProduct(ProductRequestCreate dto) {

        Product product = new Product();
        product.setId(sequence++);
        product.setNome(dto.getNome());
        product.setValor(dto.getValor());
        products.add(product);

        return null;
    }
    public Optional<Product> getProductById(Long id) {
        return products.stream()
        .filter(p -> p.getId().equals(id))
        .findFirst();
    }

    public List<Product> getAll(){
        return products;
    }

    public Optional<Product> updateProduct(Long id, Product product) { 
        return products.stream()
        .filter(e -> e.getId().equals(id))
        .findFirst()
        .map(p -> {
            p.setNome(product.getNome());
            p.setValor(product.getValor());
            return p;
        });
    }
    public boolean deleteProduct(Long id) {
       return products.removeIf(p -> p.getId().equals(id));
    }
}
