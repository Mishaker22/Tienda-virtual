/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import vista.*;

/**
 *
 * @author miche
 */

public class Pedido  {
    
    private int idCliente;
    private int idPedido;
    private LocalDate fechaPedido= LocalDate.now();
    public static enum Estado{PENDIENTE, PAGADO}
    private float total;
    public Estado estado;
    
    DefaultTableModel modelo=new DefaultTableModel();

    public Pedido() {
    }

    public Pedido(int idCliente, int idPedido, float total, Estado estado) {
        this.idCliente = idCliente;
        this.idPedido = idPedido;
        this.total = total;
        this.estado = estado;
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

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void ListarPedidos(JTable tabla)
    {
        Administrar admi=new Administrar();
        modelo=(DefaultTableModel)tabla.getModel();
        
        List<Pedido> lista= admi.ListarPedidos();
        Object[] obj=new Object[5];
        
        for (int i=0; i<lista.size();i++) {
            
            obj[0]=lista.get(i).getIdPedido();
            obj[1]=lista.get(i).getIdCliente();
            obj[2]=lista.get(i).getFechaPedido();
            obj[3]=lista.get(i).getTotal();
            obj[4]=lista.get(i).getEstado();
            
            modelo.addRow(obj);
        }
          
    }
    public void LimpiarTabla(JTable tabla)
    {
        for (int i = 0; i < tabla.getRowCount(); i++) {
            modelo.removeRow(i);
            i=i-1;
        }
    }
    
}
