package com.m4a.josueriofrio.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long pedidoId;

    @Column(name = "nombreProducto", nullable = false)
    private String nombreProducto;

    @Column(name = "cantidadProducto", nullable = true)
    private int cantidadProducto;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pedidos")
    private List<Cliente> clientes;

    public Pedido(){

    }

    public Pedido(long pedidoId, String nombreProducto, int cantidadProducto, List<Cliente> clientes) {
        this.pedidoId = pedidoId;
        this.nombreProducto = nombreProducto;
        this.cantidadProducto = cantidadProducto;
        this.clientes = clientes;
    }

    public long getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(long pedidoId) {
        this.pedidoId = pedidoId;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    
    
}
