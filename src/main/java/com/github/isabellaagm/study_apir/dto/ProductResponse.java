package com.github.isabellaagm.study_apir.dto;

import java.math.BigDecimal;

import com.github.isabellaagm.study_apir.model.Product;

public class ProductResponse {
    private Long id;
    private String nome;
    private BigDecimal valor;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
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

    public ProductResponse toDto(Product p){
            this.setId(p.getId());
            this.setNome(p.getNome());
            this.setValor(p.getValor());

            return this;
    }
}
