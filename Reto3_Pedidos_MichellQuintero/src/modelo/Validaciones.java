/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import javax.swing.*;


/**
 *
 * @author miche
 */
public class Validaciones {
    
    //Valida que las casillas contengan letras
    public void ValidarCaracteres(java.awt.event.KeyEvent evt)
    {
        char c= evt.getKeyChar();
        if ((c<'a' || c>'z')&&(c<'A'||c>'Z')&&(evt.getKeyChar()!=8)
                &&(evt.getKeyChar()!=32)&&(evt.getKeyChar()!=46)) 
        {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permiten Letras!");
        }
    }
    //Valida que las casillas contengan numeros
    public void ValidarNumeros(java.awt.event.KeyEvent evt)
    {
        char c= evt.getKeyChar();
        if((c<'0' || c>'9') &&(evt.getKeyChar()!=8)&&(evt.getKeyChar()!=32))
        {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permiten numeros!");
        }
    }
    public void ValidarCorreo(java.awt.event.KeyEvent evt)
    {
        
        if(evt.getKeyChar()>=32 && evt.getKeyChar()<=44 || evt.getKeyChar()==47
                ||evt.getKeyChar()>=58&&evt.getKeyChar()<=63
                ||evt.getKeyChar()>=91&&evt.getKeyChar()<=94
                ||evt.getKeyChar()==96
                ||evt.getKeyChar()>=123&&evt.getKeyChar()<=255)
        {
            evt.consume();
            JOptionPane.showMessageDialog(null, "No se permite ese caracter en especifico    ");
        }
    } 
}
