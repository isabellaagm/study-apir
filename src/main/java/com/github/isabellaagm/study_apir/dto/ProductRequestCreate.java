package com.github.isabellaagm.study_apir.dto;

import java.math.BigDecimal;

public class ProductRequestCreate {
    private String nome;
    private BigDecimal valor;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public BigDecimal getValor() {
        return valor;
    }
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    
}
