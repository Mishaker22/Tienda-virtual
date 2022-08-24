/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author miche
 */
public class Cliente {
    
    //Atributos
    protected int idCliente;
    protected String direccion;
    protected int telefono;
    protected String correo;
    
    //Constructor

    public Cliente() {
    }
    
    
    public Cliente(int id, String direccion, int telefono, String correo)
    {
        this.idCliente=id;
        this.direccion=direccion;
        this.telefono=telefono;
        this.correo=correo;
    }
    
    //Metodos accesores
    public int getIdCliente() {
        return idCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }
    
    public String getCorreo(){
        return correo;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
