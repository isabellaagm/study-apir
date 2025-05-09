package com.github.isabellaagm.study_apir.dto.pedido;

import java.util.List;
import java.util.stream.Collectors;

import com.github.isabellaagm.study_apir.dto.item.ItemResponse;
import com.github.isabellaagm.study_apir.model.Pedido;

public class PedidoResponse {
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

    public PedidoResponse toDto(Pedido p){
            this.setId(p.getId());
            this.setStatus(p.getStatus());

            List<ItemResponse> items = p.getItens()
            .stream()
            .map(item -> {
                ItemResponse itemResponse = new ItemResponse();

                return itemResponse;
            })
            .collect(Collectors.toList());

            
            return this;
    }
}
