package BD;

// LO QUE SE EJECUTA PARA LOS QUERYS TIENE QUE IR EN CADA METODO?

import appinventario.Empresa;
import appinventario.Producto;
import appinventario.ProductoVenta;
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
import javax.swing.table.DefaultTableModel;

public class BD {
    // Agregar conexion
    Conexion con = new Conexion();
    
    Statement st;
    PreparedStatement ps;
    ResultSet rs;  
    Connection conexion;
    
    Statement sta;
        ResultSet rsProv;
        ResultSet rsEmp;
    
    public void insertaProducto(Producto obj) {
        try {
            String query = "INSERT INTO productos(codigo,nombre,marca,precioCompra,precioVenta,existencias) "
                         + "VALUES(?,?,?,?,?,?);";
            
            conexion = con.getConexion();
            
            ps = conexion.prepareStatement(query);
           
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
                conexion.close();
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
    
    public void insertaProductoVenta(ProductoVenta obj) {
        Connection conn = con.getConexion();
        String query = "INSERT INTO ventas(codigo, prodCantidad, prodTotal, idVenta, idProd) "
                     + "VALUES(?,?,?,?,?);";
        
        try {
            ps = conn.prepareStatement(query);
            
            ps.setString(1, obj.getCodigo());
            ps.setInt(2, obj.getProdCantidad());
            ps.setFloat(3, obj.getProdTotal());
            ps.setInt(4, obj.getIdVenta());
            ps.setInt(5, obj.getIdProd());
            
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
    
    public void muestraProductos(DefaultTableModel modelo) {
        modelo.setNumRows(0);
        modelo.setColumnCount(0);
        modelo.addColumn("#");
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Marca");
        modelo.addColumn("Precio de compra");
        modelo.addColumn("Precio de venta");
        modelo.addColumn("Existencias");
        modelo.addColumn("Provedor");
        
        try {
            String query = "SELECT codigo, nombre, marca, precioCompra, precioVenta, existencias, idProvedor FROM productos";

            conexion = con.getConexion();
            st = conexion.createStatement();
            rs = st.executeQuery(query);
            
            sta = conexion.createStatement(); 

            while (rs.next()) {
                String codigo = rs.getString(1);
                String nombre = rs.getString(2);
                String marca  = rs.getString(3);
                float precioCompra = rs.getFloat(4);
                float precioVenta = rs.getFloat(5);
                int existencias = rs.getInt(6);
                int idProvedor = rs.getInt(7);

                String queryNombreProvedor = "SELECT nombre FROM provedores WHERE idProvedor = " + idProvedor;
                rsProv = sta.executeQuery(queryNombreProvedor);
                
                rsProv.next();
                String nombreProvedor = rsProv.getString(1);

                Object[] nuevoRenglon = {"#", codigo, nombre, marca, precioCompra, precioVenta, existencias, nombreProvedor};
                modelo.addRow(nuevoRenglon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rsProv != null) rsProv.close();
                if (sta != null) sta.close();
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void muestraProvedores(DefaultTableModel modelo) {
        modelo.setNumRows(0);
        modelo.setColumnCount(0);
        modelo.addColumn("#");
        modelo.addColumn("Nombre");
        modelo.addColumn("Telefono");
        modelo.addColumn("Email");
        modelo.addColumn("Fecha de contrato");
        modelo.addColumn("Empresa");
        
        try {
            String query = "SELECT nombre, telefono, email, fechaContrato, idEmpresa FROM provedores";

            conexion = con.getConexion();
            st = conexion.createStatement();
            rs = st.executeQuery(query);
            
            sta = conexion.createStatement(); 

            while (rs.next()) {
                String nombre         = rs.getString(1);
                String telefono       = rs.getString(2);
                String email          = rs.getString(3);
                String fechaContrato  = rs.getString(4);
                int idEmpresa         = rs.getInt(5);
                
                String queryNombreEmpresa = "SELECT nombre FROM empresas WHERE idEmpresa = " + idEmpresa;
                rsEmp = sta.executeQuery(queryNombreEmpresa);
                
                rsEmp.next();
                String nombreEmpresa = rsEmp.getString(1);

                Object[] nuevoRenglon = {"#", nombre, telefono, email, fechaContrato, nombreEmpresa};
                modelo.addRow(nuevoRenglon);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rsProv != null) rsProv.close();
                if (sta != null) sta.close();
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void muestraVentaTabla(DefaultTableModel modelo, int value) {
        try {
            String query = "SELECT * FROM ventas AS v, productos_ventas AS pv" +
                           " WHERE v.idVenta = pv.idVenta";

            conexion = con.getConexion();
            st = conexion.createStatement();
            rs = st.executeQuery(query);
            
            switch (value) {
                case 0 -> {
                    while (rs.next()) {
                        String fecha          = rs.getString(2);
                        String subtotal       = rs.getString(3);
                        String total          = rs.getString(4);
                        String codigo         = rs.getString(5);
                        int prodTotal         = rs.getInt(7);
                        
                        Object[] nuevoRenglon = {"#", fecha, subtotal, total, codigo, prodTotal};
                        modelo.addRow(nuevoRenglon);
                    }
                }
                case 1 -> {
                    while (rs.next()) {
                        String fecha          = rs.getString(2);
                        String subtotal       = rs.getString(3);
                        String total          = rs.getString(4);
                        String codigo         = rs.getString(5);
                        int prodCantidad      = rs.getInt(6);
                        int prodTotal         = rs.getInt(7);
                        
                        Object[] nuevoRenglon = {"#", fecha, subtotal, total, codigo, prodCantidad, prodTotal};
                        modelo.addRow(nuevoRenglon);
                    }
                }
                default -> System.out.println("error");
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void eliminaProducto(int valor) {
        String query = "DELETE FROM productos WHERE";
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