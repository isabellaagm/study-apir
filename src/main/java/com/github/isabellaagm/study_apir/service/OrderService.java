package com.github.isabellaagm.study_apir.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.isabellaagm.study_apir.dto.order.OrderRequestCreate;
import com.github.isabellaagm.study_apir.dto.order.OrderRequestUpdate;
import com.github.isabellaagm.study_apir.model.Orders;
import com.github.isabellaagm.study_apir.repository.OrderRepository;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public Orders createOrder(OrderRequestCreate dto){
        return orderRepository.save(dto.toModel());
    }
    public Optional<Orders> getOrderById(Long id){
        return orderRepository.findById(id);
    }

    public List<Orders> getAll(){
    return orderRepository.findAll();
    }
    
    public Optional<Orders> updateOrder(Long id, OrderRequestUpdate dto){
     return orderRepository.findById(id)
             .map(o-> orderRepository.save(dto.toModel(o)));
    }
 
    public boolean deleteOrder(Long id){
        if(orderRepository.existsById(id)){
            orderRepository.deleteById(id);
         return true;
        }
        return false;
    }
}
