/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import vista.*;

/**
 *
 * @author miche
 */
public class LineaProducto extends Producto {
    
    private int cantidad;
    private float precio;
    Administrar admi=new Administrar();
    DefaultTableModel modelo=new DefaultTableModel();

    public LineaProducto() {
    }
    public LineaProducto(int cantidad, float precio, int id, String denominacion, String proveedor) {
        super(id, denominacion, proveedor);
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }public void Listar(JTable tabla)
    {
        modelo=(DefaultTableModel)tabla.getModel();
        
        List<LineaProducto> lista= admi.Listar();
        Object[] obj=new Object[5];
        
        for (int i=0; i<lista.size();i++) {
            
            obj[0]=lista.get(i).getId();
            obj[1]=lista.get(i).getDenominacion();
            obj[2]=lista.get(i).getProveedor();
            obj[3]=lista.get(i).getCantidad();
            obj[4]=lista.get(i).getPrecio();
            
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
