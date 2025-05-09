package com.github.isabellaagm.study_apir.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.isabellaagm.study_apir.dto.pedido.PedidoRequestCreate;
import com.github.isabellaagm.study_apir.dto.pedido.PedidoRequestUpdate;
import com.github.isabellaagm.study_apir.model.Pedido;
import com.github.isabellaagm.study_apir.repository.PedidoRepository;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido createPedido(PedidoRequestCreate dto){
        return pedidoRepository.save(dto.toModel());
    }
    public Optional<Pedido> getPedidoById(Long id){
        return pedidoRepository.findById(id);
    }

    public List<Pedido> getAll(){
    return pedidoRepository.findAll();
    }
    
    public Optional<Pedido> updatePedido(Long id, PedidoRequestUpdate dto){
     return pedidoRepository.findById(id)
             .map(o-> pedidoRepository.save(dto.toModel(o)));
    }
 
    public boolean deletePedido(Long id){
        if(pedidoRepository.existsById(id)){
            pedidoRepository.deleteById(id);
         return true;
        }
        return false;
    }
}
