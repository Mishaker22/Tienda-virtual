/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.*;

/**
 *
 * @author miche
 */
public class Pago {
    
    private int id;
    private int idCliente;
    private int idPedido;
    private LocalDate fechaPago;
    private Float Total;

    public Pago() {
    }

    public Pago(int id, int idCliente, int idPedido, LocalDate fechaPago, Float Total) {
        this.id = id;
        this.idCliente = idCliente;
        this.idPedido = idPedido;
        this.fechaPago = fechaPago;
        this.Total = Total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Float getTotal() {
        return Total;
    }

    public void setTotal(Float Total) {
        this.Total = Total;
    }
    
    
}
