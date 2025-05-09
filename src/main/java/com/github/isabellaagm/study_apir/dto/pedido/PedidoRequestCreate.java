package com.github.isabellaagm.study_apir.dto.pedido;

import java.util.List;

import com.github.isabellaagm.study_apir.model.Item;
import com.github.isabellaagm.study_apir.model.Pedido;

public class PedidoRequestCreate {
    private List<Item> itens;

    public Pedido toModel(){
         Pedido p = new Pedido();
         p.setItens(this.getItens());
         return p;
     }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
    
}
