/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author miche
 */
public class Juridica extends Cliente{
    
    //Atributos
    private String razonSocial;
    private int nit;

    //Constructor
    
    public Juridica() {
    }

    public Juridica(String razonSocial, int nit, int id, String direccion, int telefono, String correo) {
        super(id, direccion, telefono, correo);
        this.razonSocial = razonSocial;
        this.nit = nit;
    }
    
    //Metodos Accesores

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }
    
    
    
    
    
    
    
}
