package BD;

import appinventario.Empresa;
import appinventario.Producto;
import appinventario.Provedor;
import appinventario.Venta;
import java.sql.Statement;
import javax.swing.JTable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BD {
    // Agregar conexion
    Conexion con = new Conexion();
    
    Statement st;
    PreparedStatement ps;
    ResultSet rs;  
    
    public void insertaProducto(Producto obj) {
        Connection conn = con.getConexion();
        String query = "INSERT INTO productos(codigo,nombre,marca,precioCompra,precioVenta,existencias) "
                     + "VALUES(?,?,?,?,?,?);";
        
        try {
            ps = conn.prepareStatement(query);
           
            ps.setString(1, obj.getCodigo());
            ps.setString(2, obj.getNombre());
            ps.setString(3, obj.getMarca());
            ps.setFloat(4, obj.getPrecioCompra());
            ps.setFloat(5, obj.getPrecioVenta());
            ps.setInt(6, obj.getExistencias());
            
            ps.executeUpdate();
           
        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void insertaEmpresa(Empresa obj) {
        Connection conn = con.getConexion();
        String query = "INSERT INTO empresas(nombre,giro,email,telefono,domicilio) "
                     + "VALUES(?,?,?,?,?);";
        
        try {
            ps = conn.prepareStatement(query);
            
            ps.setString(1, obj.getNombre());
            ps.setString(2, obj.getGiro());
            ps.setString(3, obj.getEmail());
            ps.setString(4, obj.getTelefono());
            ps.setString(5, obj.getDomicilio());
            
            ps.executeUpdate();
           
        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void insertaProvedor(Provedor obj) {
        Connection conn = con.getConexion();
        String query = "INSERT INTO provedores(nombre,telefono,email,fechaContrato,idEmpresa) "
                     + "VALUES(?,?,?,?,?);";
        
        try {
            ps = conn.prepareStatement(query);
            
            ps.setString(1, obj.getNombre());
            ps.setString(2, obj.getTelefono());
            ps.setString(3, obj.getEmail());
            ps.setString(4, obj.getFechaContrato());
            ps.setInt(5, obj.getIdEmpresa());
            
            ps.executeUpdate();
           
        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void insertaVenta(Venta obj) {
        Connection conn = con.getConexion();
        String query = "INSERT INTO ventas(fecha,subtotal,total) "
                     + "VALUES(?,?,?);";
        
        try {
            ps = conn.prepareStatement(query);
            
            ps.setString(1, obj.getFecha());
            ps.setFloat(2, obj.getSubtotal());
            ps.setFloat(3, obj.getTotal());
            
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void muestraProductos(JTable table) {
        String query = "";
    }
    
    public void muestraProvedores(JTable table) {
        String query = "";
    }
    
    public void muestraVenta(JTable table) {
        String query = "";
    }
    
    public void eliminaProducto(Producto obj) {
        String query = "";
    }
    
    public void eliminaEmpresa(Empresa obj) {
        String query = "";
    }
    
    public void eliminaProvedor(Provedor obj) {
        String query = "";
    }
    
    public void eliminaVenta(Venta obj) {
        
    }
    
    public int getIdEmpresa(String value) {
        Connection conn = con.getConexion();
        String query = "SELECT idEmpresa FROM empresas"
                     + " WHERE nombre = '" + value + "';";
        
        System.out.println(query);
        int valor = -1;
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery(query);
            
            rs.next();
            valor = rs.getInt(1);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
                st.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return valor;
    }
}