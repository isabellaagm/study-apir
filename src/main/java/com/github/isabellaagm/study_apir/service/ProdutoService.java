package com.github.isabellaagm.study_apir.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.isabellaagm.study_apir.dto.produto.ProdutoRequestCreate;
import com.github.isabellaagm.study_apir.dto.produto.ProdutoRequestUpdate;
import com.github.isabellaagm.study_apir.model.Produto;
import com.github.isabellaagm.study_apir.repository.ProdutoRepository;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto createProduto(ProdutoRequestCreate dto){
        return produtoRepository.save(dto.toModel());
    }
    public Optional<Produto> getProdutoById(Long id){
        return produtoRepository.findById(id);
    }

    public List<Produto> getAll(){
    return produtoRepository.findAll();
    }
    
    public Optional<Produto> updateProduto(Long id, ProdutoRequestUpdate dto){
     return produtoRepository.findById(id)
             .map(p-> produtoRepository.save(dto.toModel(p)));
    }
 
    public boolean deleteProduto(Long id){
        if(produtoRepository.existsById(id)){
         produtoRepository.deleteById(id);
         return true;
        }
        return false;
    }

}
