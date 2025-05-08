package com.github.isabellaagm.study_apir.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.isabellaagm.study_apir.dto.order.OrderRequestCreate;
import com.github.isabellaagm.study_apir.dto.order.OrderRequestUpdate;
import com.github.isabellaagm.study_apir.dto.order.OrderResponse;
import com.github.isabellaagm.study_apir.service.OrderService;

@RestController
@RequestMapping("pedidos")
public class ControllerOrder {
    @Autowired
    private OrderService orderService;

    @PostMapping
    public ResponseEntity<OrderResponse> create(
                                @RequestBody OrderRequestCreate dto) {                                    
        
        return ResponseEntity.status(201).body(
            new OrderResponse().toDto(
                orderService.createOrder(dto)
            )
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        boolean result = orderService.deleteOrder(id);

        if (result) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }     
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrderResponse> 
            update(@PathVariable Long id, @RequestBody OrderRequestUpdate dto) {
        
        return orderService.updateOrder(id, dto)
            .map(p-> new OrderResponse().toDto(p))
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderResponse> findById(@PathVariable Long id) {
        return orderService.getOrderById(id)
            .map(p-> new OrderResponse().toDto(p))
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());     
    }

    @GetMapping
    public ResponseEntity<List<OrderResponse>> findAll() {
        List<OrderResponse> response = 
            orderService.getAll().stream()
            .map(p-> new OrderResponse().toDto(p))
            .collect(Collectors.toList()); 
        return ResponseEntity.ok(response);
    }
}
