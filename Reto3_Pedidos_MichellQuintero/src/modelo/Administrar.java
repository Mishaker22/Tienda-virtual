package modelo;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import vista.*;
/**
 *
 * @author miche
 */
public class Administrar {
    Conexion conectar= new Conexion();
    public static ArrayList<String> ListaId= new ArrayList();
    //Variable de tipo sql
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    
    public int AgregarProducto(LineaProducto p)
    {
        String query="INSERT INTO productos(denominacion,proveedor,cantidad,precio)VALUES(?,?,?,?)";
        try {
            conn=conectar.conex();
            ps=conn.prepareStatement(query);
            ps.setString(1, p.getDenominacion());
            ps.setString(2, p.getProveedor());
            ps.setInt(3, p.getCantidad());
            ps.setFloat(4, p.getPrecio());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error al insertar en la base de datos "+e.getMessage());
        }
        return 1;
    }
    public int AgregarPedido(Pedido p)
    {
        String query="INSERT INTO pedidos(idCliente,fecha,total,estado)VALUES(?,?,?,?)";
        try {
            conn=conectar.conex();
            ps=conn.prepareStatement(query);
            ps.setInt(1, p.getIdCliente());
            ps.setDate(2, Date.valueOf(p.getFechaPedido()));
            ps.setFloat(3, p.getTotal());
            ps.setString(4, p.getEstado().toString());
            ps.executeUpdate();
            AgarrarIdPedido();
            
        } catch (Exception e) {
            System.out.println("Error al insertar en la base de datos "+e.getMessage());
        }
        return 1;
    }
    public int AgregarPago(Pago p)
    {
        String query="INSERT INTO pagos(idPedido,idCliente,fecha,total)VALUES(?,?,?,?)";
        try {
            conn=conectar.conex();
            ps=conn.prepareStatement(query);
            ps.setInt(1, p.getIdPedido());
            ps.setInt(2, p.getIdCliente());
            ps.setDate(3, Date.valueOf(p.getFechaPago()));
            ps.setFloat(4, p.getTotal());
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("Error al insertar en la base de datos "+e.getMessage());
        }
        return 1;
    }
    public int AgregarEnvio(Envio ep)
    {
        String query="INSERT INTO envios(id,idPago,direccion,fecha,compania,estado)VALUES(?,?,?,?,?,?)";
        try {
            conn=conectar.conex();
            ps=conn.prepareStatement(query);
            ps.setInt(1, ep.getId());
            ps.setInt(2, ep.getIdPago());
            ps.setString(3, ep.getDireccionFac());
            ps.setDate(4, Date.valueOf(ep.getFechaPedido()));
            ps.setString(5, ep.getCompania().toString());
            ps.setString(6, ep.getEstado().toString());
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("Error al insertar en la base de datos "+e.getMessage());
        }
        return 1;
    }
    
    public int InsertarClienteNatural(Natural pNatural)
    {
        String query="INSERT INTO clientesnaturales(direccion,telefono,correo,pNombre,sNombre,pApellido,sApellido,documento)VALUES(?,?,?,?,?,?,?,?)";
        try {
            conn=conectar.conex();
            ps=conn.prepareStatement(query);
            
            ps.setString(1, pNatural.getDireccion());
            ps.setInt(2, pNatural.getTelefono());
            ps.setString(3, pNatural.getCorreo());
            ps.setString(4, pNatural.getPrimerNombre());
            ps.setString(5, pNatural.getSegundoNombre());
            ps.setString(6, pNatural.getPrimerApellido());
            ps.setString(7, pNatural.getSegundoApellido());
            ps.setInt(8, pNatural.getDocumentoId());
            
            ps.executeUpdate();
            AgarrarId("clientesnaturales");
            
        } catch (Exception e) {
            System.out.println("Error al insertar en la base de datos "+e.getMessage());
        }
        return 1;
    }
    public int InsertarClienteJuridico(Juridica pJuridica)
    {
        
        String query="INSERT INTO clientesjuridicos(direccion,telefono,correo,razonsocial,nit)VALUES(?,?,?,?,?)";
        try {
            conn=conectar.conex();
            ps=conn.prepareStatement(query);
            ps.setString(1, pJuridica.getDireccion());
            ps.setInt(2, pJuridica.getTelefono());
            ps.setString(3, pJuridica.getCorreo());
            ps.setString(4, pJuridica.getRazonSocial());
            ps.setInt(5, pJuridica.getNit());
            
            ps.executeUpdate();
            AgarrarId("clientesjuridicos");
            
        } catch (Exception e) {
            System.out.println("Error al insertar en la base de datos"+e.getMessage());
        }
        return 1;
    }
    //TRAE EL ULTIMO ID AGREGADO DE LA DB RECIBIENDO DE PARAMETRO EL NOMBRE DE LA TABLA DE LA DB
    public void AgarrarId(String tabla)
    {
        String id="0";
        
        if (tabla=="clientesjuridicos") {
            
            String query="SELECT * FROM clientesjuridicos WHERE id = (SELECT MAX(id) FROM clientesjuridicos)";
            try 
            {
                conn=conectar.conex();//conexion
                ps=conn.prepareStatement(query);//Ejecucion query
                rs=ps.executeQuery();//Listamos la consulta y capturamos los datos
                rs.next();
                id=rs.getString(1);
                ListaId.add(id);
                
            } catch (Exception e) {
                System.out.println("Error no se pudo obtener el id "+e.getMessage());
            }
            
        }else if(tabla=="clientesnaturales")
        {
            String query="SELECT * FROM clientesnaturales WHERE id = (SELECT MAX(id) FROM clientesnaturales)";
            try 
            {
                conn=conectar.conex();//conexion
                ps=conn.prepareStatement(query);//Ejecucion query
                rs=ps.executeQuery();//Listamos la consulta y capturamos los datos
                rs.next();
                id=rs.getString(1);
                ListaId.add(id);
                
           
            } catch (Exception e) {
                System.out.println("Error no se pudo obtener el id "+e.getMessage());
            }
            
        }
       
    }
    //TRAE EL ULTIMO ID AGREGADO DE LA TABLA PEDIDOS
    public void AgarrarIdPedido()
    {
        String id="0";
        String query="SELECT * FROM pedidos WHERE id = (SELECT MAX(id) FROM pedidos)";
        try {
            
            conn=conectar.conex();//conexion
            ps=conn.prepareStatement(query);//Ejecucion query
            rs=ps.executeQuery();//Listamos la consulta y capturamos los datos
            rs.next();
            id=rs.getString(1);
            ListaId.add(id);
            
        } catch (Exception e) {
            System.out.println("Error no se pudo obtener el id "+e.getMessage());
        }
    }
    
    public int Modificar(LineaProducto p)
    {
        String query="UPDATE `productos` SET `denominacion`=?,`proveedor`=?,`cantidad`=?,`precio`=? Where id=?";
 
        try {
            conn=conectar.conex();
            ps=conn.prepareStatement(query);
            ps.setString(1, p.getDenominacion());
            ps.setString(2, p.getProveedor());
            ps.setInt(3, p.getCantidad());
            ps.setFloat(4, p.getPrecio());
            ps.setInt(5, p.getId());
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("Error al intentar modificar la fila "+e.getMessage());
        }
        return 1;
    }
    public int ModificarPedido(Pedido p)
    {
        String query="UPDATE `pedidos` SET `idCliente`=?,`fecha`=?,`total`=?,`estado`=? Where id=?";
 
        try {
            conn=conectar.conex();
            ps=conn.prepareStatement(query);
            ps.setInt(1, p.getIdCliente());
            ps.setDate(2, Date.valueOf(p.getFechaPedido()));
            ps.setFloat(3, p.getTotal());
            ps.setString(4, p.getEstado().toString());
            ps.setInt(5, p.getIdPedido());
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("Error al intentar modificar la fila "+e.getMessage());
        }
        return 1;
    }
    public void Eliminar(int id)
    {
        String query="DELETE FROM `productos` WHERE id = ?";
        try {
            conn=conectar.conex();
            ps=conn.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("No se pudo eliminar el producto"+e.getMessage());
        }
        
    }
    public List Listar()
    {
        //Creamos una variable tipo lista
        List<LineaProducto> dato= new ArrayList<>();
        String query="SELECT * FROM `productos`";
        
        try {
            conn=conectar.conex();//conexion
            ps=conn.prepareStatement(query);//Ejecucion query
            rs=ps.executeQuery();//Listamos la consulta y capturamos los datos
            
            while(rs.next())
            {
                LineaProducto p=new LineaProducto();
                
                p.setId(rs.getInt(1));
                p.setDenominacion(rs.getString(2));
                p.setProveedor(rs.getString(3));
                p.setCantidad(rs.getInt(4));
                p.setPrecio(rs.getFloat(5));
                
                //Agregarla a dato
                dato.add(p);
            }
        } catch (Exception e) {
            System.out.println("Error al copiar la informacion de la BD"+e.getMessage());
        }
        return dato;
    }
    public List ListarEnvios()
    {
        //Creamos una variable tipo lista
        List<Envio> dato= new ArrayList<>();
        String query="SELECT * FROM `envios`";
        
        try {
            conn=conectar.conex();//conexion
            ps=conn.prepareStatement(query);//Ejecucion query
            rs=ps.executeQuery();//Listamos la consulta y capturamos los datos
            
            while(rs.next())
            {
                Envio ep=new Envio();
                
                ep.setId(rs.getInt(1));
                ep.setIdPago(rs.getInt(2));
                ep.setDireccionFac(rs.getString(3));
                ep.setFechaPedido(rs.getDate(4).toLocalDate());
                ep.setCompania(Envio.Compania.valueOf(rs.getString(5)));
                ep.setEstado(Envio.Estado.valueOf(rs.getString(6)));
                
                //Agregarla a dato
                dato.add(ep);
            }
        } catch (Exception e) {
            System.out.println("Error al copiar la informacion de la BD"+e.getMessage());
        }
        return dato;
    }
    public List ListarNaturales()
    {
        //Creamos una variable tipo lista
        List<Natural> dato= new ArrayList<>();
        String query="SELECT * FROM `clientesnaturales`";
        
        try {
            conn=conectar.conex();//conexion
            ps=conn.prepareStatement(query);//Ejecucion query
            rs=ps.executeQuery();//Listamos la consulta y capturamos los datos
            
            while(rs.next())
            {
                Natural n=new Natural();
                
                n.setIdCliente(rs.getInt(1));
                n.setDireccion(rs.getString(2));
                n.setTelefono(rs.getInt(3));
                n.setCorreo(rs.getString(4));
                n.setPrimerNombre(rs.getString(5));
                n.setSegundoNombre(rs.getString(6));
                n.setPrimerApellido(rs.getString(7));
                n.setSegundoNombre(rs.getString(8));
                n.setDocumentoId(rs.getInt(9));
                
                //Agregarla a dato
                dato.add(n);
            }
        } catch (Exception e) {
            System.out.println("Error al copiar la informacion de la DB "+e.getMessage());
        }
        return dato;
    }
    
    //Hace la conexion con la DB Y trae todos los elementos de la tabla clientesjuridicos
    public List ListarJuridicos()
    {
        //Creamos una variable tipo lista
        List<Juridica> dato= new ArrayList<>();
        String query="SELECT * FROM `clientesjuridicos`";
        
        try {
            conn=conectar.conex();//conexion
            ps=conn.prepareStatement(query);//Ejecucion query
            rs=ps.executeQuery();//Listamos la consulta y capturamos los datos
            
            while(rs.next())
            {
                Juridica j=new Juridica();
                
                j.setIdCliente(rs.getInt(1));
                j.setDireccion(rs.getString(2));
                j.setTelefono(rs.getInt(3));
                j.setCorreo(rs.getString(4));
                j.setRazonSocial(rs.getString(5));
                j.setNit(rs.getInt(6));
  
                //Agregarla a dato
                dato.add(j);
            }
        } catch (Exception e) {
            System.out.println("Error al copiar la informacion de la DB "+e.getMessage());
        }
        return dato;
    }
    //Traer todos los registros de la tabla pedidos de la DB
     public List ListarPedidos()
    {
        //Creamos una variable tipo lista
        List<Pedido> dato= new ArrayList<>();
        String query="SELECT * FROM `pedidos`";
        
        try {
            conn=conectar.conex();//conexion
            ps=conn.prepareStatement(query);//Ejecucion query
            rs=ps.executeQuery();//Listamos la consulta y capturamos los datos
            
            while(rs.next())
            {
                Pedido p=new Pedido();
                
                p.setIdPedido(rs.getInt(1));
                p.setIdCliente(rs.getInt(2));
                p.setFechaPedido(rs.getDate(3).toLocalDate());
                p.setTotal(rs.getFloat(4));
                p.setEstado(Pedido.Estado.valueOf(rs.getString(5)));
                
                //Agregarla a dato
                dato.add(p);
            }
        } catch (Exception e) {
            System.out.println("Error al leer la informacion de la DB "+e.getMessage());
        }
        return dato;
    }
     public List ListarPagos()
    {
        //Creamos una variable tipo lista
        List<Pago> dato= new ArrayList<>();
        String query="SELECT * FROM `pagos`";
        
        try {
            conn=conectar.conex();//conexion
            ps=conn.prepareStatement(query);//Ejecucion query
            rs=ps.executeQuery();//Listamos la consulta y capturamos los datos
            
            while(rs.next())
            {
                Pago p=new Pago();
                
                p.setId(rs.getInt(1));
                p.setIdPedido(rs.getInt(2));
                p.setIdCliente(rs.getInt(3));
                p.setFechaPago(rs.getDate(4).toLocalDate());
                p.setTotal(rs.getFloat(5));
                
                //Agregarla a dato
                dato.add(p);
            }
        } catch (Exception e) {
            System.out.println("Error al leer la informacion de la DB "+e.getMessage());
        }
        return dato;
    }
     public int SeleccionarRegistro(int id)
    {
        int idPago=0;
        String query="SELECT id FROM `pagos` WHERE idPedido = "+id;
        try {
            conn=conectar.conex();
            ps=conn.prepareStatement(query);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                idPago=rs.getInt("id");
            }
            
        } catch (Exception e) {
            System.out.println("No se pudo traer el registro "+e.getMessage());
        }
        return idPago;
    }
     public void EliminarPedido(int id)
    {
        String query="DELETE FROM `pedidos` WHERE id = ?";
        try {
            conn=conectar.conex();
            ps=conn.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("No se pudo eliminar el pedido"+e.getMessage());
        }
        
    }
}
