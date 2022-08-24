package modelo;
import java.sql.*;

/**
 *
 * @author miche
 */
public class Conexion {
// credenciales de conexion o variables
    
    String user="root";
    String password="";
    String driver="com.mysql.cj.jdbc.Driver";
    String url="jdbc:mysql://127.0.0.1:3306/virtual_tienda";
    
    Connection conn;//Variable de conexion
    
    public Connection conex()
    {
        try {
            Class.forName(driver);
            conn=(Connection)DriverManager.getConnection(url, user, password);
            if (conn != null) {
                System.out.println("Conexion Exitosa");
            }
        } catch (Exception e) {
            System.out.println("Error de conexion"+e.getMessage());
        }
        return conn;
    }
    
}
