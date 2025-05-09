package com.github.isabellaagm.study_apir.dto.produto;

import java.math.BigDecimal;

import com.github.isabellaagm.study_apir.model.Produto;

public class ProdutoRequestCreate {

    private String nome;

    public Produto toModel(){
        BigDecimal VALOR_PADRAO = new BigDecimal(500);
        Produto produto = new Produto();
        produto.setNome(this.nome);
        produto.setValor(VALOR_PADRAO);
        return produto;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}