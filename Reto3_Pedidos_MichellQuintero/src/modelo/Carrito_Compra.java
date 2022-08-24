/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.*; // Este paquete contiene LocalDate, LocalTime y LocalDateTime.
import java.time.format.*;  // Este paquete contiene DateTimeFormatter.

/**
 *
 * @author miche
 */
public class Carrito_Compra {
    
    public static LocalDateTime hoy= LocalDateTime.now();
    public static LocalDateTime unDia= LocalDateTime.now().plusHours(24);

    
    public static String InicializarFechaInicio()
            
    {
        String d,m,a,h,mi,s,fechaComp;
        d=Integer.toString(hoy.getDayOfMonth());
        m=Integer.toString(hoy.getMonthValue());
        a=Integer.toString(hoy.getYear());
        h=Integer.toString(hoy.getHour());
        mi=Integer.toString(hoy.getMinute());
        s=Integer.toString(hoy.getSecond());
        
        fechaComp=d+"-"+m+"-"+a+" "+h+":"+mi+":"+s;
        return fechaComp;
   
    }
    public static String InicializarFechaFinal()
            
    {
        String d,m,a,h,mi,s,fechaComp;
        d=Integer.toString(unDia.getDayOfMonth());
        m=Integer.toString(unDia.getMonthValue());
        a=Integer.toString(unDia.getYear());
        h=Integer.toString(unDia.getHour());
        mi=Integer.toString(unDia.getMinute());
        s=Integer.toString(unDia.getSecond());
        
        fechaComp=d+"-"+m+"-"+a+" "+h+":"+mi+":"+s;
        return fechaComp;
   
    }
    
    
    
}
