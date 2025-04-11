package com.github.isabellaagm.study_apir.dto.order;

import java.util.List;

import com.github.isabellaagm.study_apir.model.Item;
import com.github.isabellaagm.study_apir.model.Orders;

public class OrderRequestCreate {
    private List<Item> items;

    public Orders toModel(){
         Orders o = new Orders();
         o.setItems(this.getItems());
         return o;
     }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
    
}
