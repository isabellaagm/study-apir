package com.github.isabellaagm.study_apir.dto.produto;

import java.math.BigDecimal;

import com.github.isabellaagm.study_apir.model.Produto;

public class ProdutoRequestUpdate {

    private BigDecimal valor;

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Produto toModel(Produto p){
        p.setValor(this.valor);
        return p;
    }
}