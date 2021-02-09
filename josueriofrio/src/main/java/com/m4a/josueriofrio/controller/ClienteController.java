package com.m4a.josueriofrio.controller;

import com.m4a.josueriofrio.modelo.Cliente;
import com.m4a.josueriofrio.modelo.Pedido;
import com.m4a.josueriofrio.ropository.ClienteRepository;
import com.m4a.josueriofrio.ropository.PedidoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private PedidoRepository pedidoRepository;
    
    @GetMapping("/listCli")
    public List<Cliente> getAllClientes(){

        return clienteRepository.findAll();
    }

    @PostMapping("/clientes")
    @ResponseBody
    public Cliente guardarCliente(@RequestBody Cliente cli){

        /*
        Pedido p = new Pedido();
        p.setPedidoId(0001);
        p.setCantidadProducto(12);
        p.setNombreProducto("nombreProductos");
        pedidoRepository.save(p);

        Cliente c = new Cliente();
        c.setNombreCliente("Josue");
        c.setApellidoCliente("Riofrio");
        c.setCorreoCliente("correoCliente@gmail.com");
        c.setPedidos(p);

        */

        return clienteRepository.save(c); 
    }
}
