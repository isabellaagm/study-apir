package com.github.isabellaagm.study_apir.dto.order;

import com.github.isabellaagm.study_apir.model.Orders;

public class OrderRequestUpdate {
    private String status;

    public Orders toModel(Orders o){
         o.setStatus(this.getStatus());
         return o;
     }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
