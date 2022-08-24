/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.*;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author miche
 */
public class Envio {
    
    private int id;
    private int idPago;
    private String direccionFac;
    public static enum Estado{FINALIZADO, NOFINALIZADO};
    private LocalDate fechaPedido = LocalDate.now();
    public static enum Compania{INTERRAPIDISIMO, SERVIENTREGA, ENVIA, RAPPI, PEDIDOSYA};
    private Estado estado;
    private Compania compania;
    
    Administrar admi=new Administrar();  
    DefaultTableModel modelo=new DefaultTableModel();

    public Envio() {
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }
    
    public String getDireccionFac() {
        return direccionFac;
    }

    public void setDireccionFac(String direccionFac) {
        this.direccionFac = direccionFac;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Compania getCompania() {
        return compania;
    }

    public void setCompania(Compania compania) {
        this.compania = compania;
    }

    public void Listar(JTable tabla)
    {
        modelo=(DefaultTableModel)tabla.getModel();
        
        List<Envio> lista= admi.ListarEnvios();
        Object[] obj=new Object[6];
        
        for (int i=0; i<lista.size();i++) {
            
            obj[0]=lista.get(i).getId();
            obj[1]=lista.get(i).getIdPago();
            obj[2]=lista.get(i).getDireccionFac();
            obj[3]=lista.get(i).getFechaPedido();
            obj[4]=lista.get(i).getCompania();
            obj[5]=lista.get(i).getEstado();
            
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
