package com.github.isabellaagm.study_apir.dto.order;

import com.github.isabellaagm.study_apir.model.Orders;

public class OrderResponse {
    private Long id;
    private String status;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public OrderResponse toDto(Orders o){
            this.setId(o.getId());
            this.setStatus(o.getStatus());
            return this;
    }
}
