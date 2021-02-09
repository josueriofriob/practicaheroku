package com.m4a.josueriofrio.controller;

import java.util.List;

import com.m4a.josueriofrio.modelo.Pedido;
import com.m4a.josueriofrio.ropository.PedidoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;

    @GetMapping("/listDep")
    public List<Pedido> getAllPedidos(){
        return pedidoRepository.findAll();
    }

    
    
}
