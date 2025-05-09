package com.github.isabellaagm.study_apir.dto.pedido;

import com.github.isabellaagm.study_apir.model.Pedido;

public class PedidoRequestUpdate {
    private String status;

    public Pedido toModel(Pedido p){
         p.setStatus(this.getStatus());
         return p;
     }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
