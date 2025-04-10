package com.github.isabellaagm.study_apir.dto;

import java.math.BigDecimal;

import com.github.isabellaagm.study_apir.model.Product;

public class ProductRequestUpdate {
    private BigDecimal valor;

    public Product toModel(Product p){
         p.setValor(this.getValor());
         return p;
     }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}