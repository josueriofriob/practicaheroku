package com.m4a.josueriofrio.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="cliente")
public class Cliente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long clienteId;

    @Column(name = "nombreCliente", nullable = false)
    private String nombreCliente;

    @Column(name = "apellidoCliente", nullable = false)
    private String apellidoCliente;

    @Column(name = "correoCliente", nullable = false)
    private String correoCliente;

    @JsonBackReference
    @JoinColumn(name = "pedidoId")
    @ManyToOne(fetch = FetchType.LAZY)
    private Pedido pedidos;

    public Cliente(){

    }

    public Cliente(long clienteId, String nombreCliente, String apellidoCliente, String correoCliente, Pedido pedidos) {
        this.clienteId = clienteId;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.correoCliente = correoCliente;
        this.pedidos = pedidos;
    }

    public long getClienteId() {
        return clienteId;
    }

    public void setClienteId(long clienteId) {
        this.clienteId = clienteId;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public Pedido getPedidos() {
        return pedidos;
    }

    public void setPedidos(Pedido pedidos) {
        this.pedidos = pedidos;
    }

    
}
