package BD;

// LO QUE SE EJECUTA PARA LOS QUERYS TIENE QUE IR EN CADA METODO?

import appinventario.Empresa;
import appinventario.Producto;
import appinventario.ProductoVenta;
import appinventario.Provedor;
import appinventario.Venta;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BD {
    // Agregar conexion
    Conexion con = new Conexion();
    private Connection conexion;
    
    private Statement st, sta;
    private PreparedStatement ps;
    private ResultSet rs, rsEmp, rsProv; 
    
    public void insertaProducto(Producto obj) {
        try {
            String query = "INSERT INTO productos(codigo,nombre,marca,precioCompra,precioVenta,existencias,idProvedor) "
                         + "VALUES(?,?,?,?,?,?,?);";
            
            conexion = con.getConexion();
            ps  = conexion.prepareStatement(query);
           
            ps.setInt    ( 1, obj.getCodigo()      );
            ps.setString ( 2, obj.getNombre()   );
            ps.setString ( 3, obj.getMarca()    );
            ps.setFloat  ( 4, obj.getPrecioCompra() );
            ps.setFloat  ( 5, obj.getPrecioVenta()  );
            ps.setInt    ( 6, obj.getExistencias() );
            ps.setInt    ( 7, obj.getIdProvedor()  );
            
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
        try {
            String query = "INSERT INTO empresas(nombre,giro,email,telefono,domicilio) "
                     + "VALUES(?,?,?,?,?);";
            
            conexion = con.getConexion();
            ps = conexion.prepareStatement(query);
            
            ps.setString ( 1, obj.getNombre()   );
            ps.setString ( 2, obj.getGiro()     );
            ps.setString ( 3, obj.getEmail()    );
            ps.setString ( 4, obj.getTelefono() );
            ps.setString ( 5, obj.getDomicilio());
            
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
    
    public void insertaProvedor(Provedor obj) {   
        try {
            String query = "INSERT INTO provedores(nombre,telefono,email,fechaContrato,idEmpresa) "
                     + "VALUES(?,?,?,?,?);";
            
            conexion = con.getConexion();
            ps = conexion.prepareStatement(query);
            
            ps.setString ( 1, obj.getNombre()        );
            ps.setString ( 2, obj.getTelefono()      );
            ps.setString ( 3, obj.getEmail()         );
            ps.setString ( 4, obj.getFechaContrato() );
            ps.setInt    ( 5, obj.getIdEmpresa()         );
            
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
    
    public void insertaVenta(Venta obj) {
        try {
            String query = "INSERT INTO ventas(fecha,subtotal,total) "
                     + "VALUES(?,?,?);";
            
            conexion = con.getConexion();
            ps = conexion.prepareStatement(query);
            
            ps.setString ( 1, obj.getFecha() );
            ps.setFloat  ( 2, obj.getSubtotal()  );
            ps.setFloat  ( 3, obj.getTotal()     );
            
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
    
    public void insertaProductoVenta(ProductoVenta obj) {
        try {
            String query = "INSERT INTO ventas(codigo, prodCantidad, prodTotal, idVenta, idProd) "
                     + "VALUES(?,?,?,?,?);";
            
            conexion = con.getConexion();
            ps = conexion.prepareStatement(query);
            
            ps.setString ( 1, obj.getCodigo()   );
            ps.setInt    ( 2, obj.getProdCantidad() );
            ps.setFloat  ( 3, obj.getProdTotal()     );
            ps.setInt    ( 4, obj.getIdVenta()      );
            ps.setInt    ( 5, obj.getIdProd()       );
            
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
     
    public void muestraProductos(DefaultTableModel modelo) {
        modelo.setNumRows     (0                    );
        modelo.setColumnCount (0                 );
        modelo.addColumn      ("#"                );
        modelo.addColumn      ("Codigo"           );
        modelo.addColumn      ("Nombre"           );
        modelo.addColumn      ("Marca"            );
        modelo.addColumn      ("Precio de compra" );
        modelo.addColumn      ("Precio de venta"  );
        modelo.addColumn      ("Existencias"      );
        modelo.addColumn      ("Provedor"         );
        
        try {
            String query = "SELECT * FROM productos";

            conexion = con.getConexion();
            st = conexion.createStatement();
            sta = conexion.createStatement();
            rs = st.executeQuery(query);

            while (rs.next()) {
                int codigo         = rs.getInt    ( 2 );
                String nombre      = rs.getString ( 3 );
                String marca       = rs.getString ( 4 );
                float precioCompra = rs.getFloat  ( 5 );
                float precioVenta  = rs.getFloat  ( 6 );
                int existencias    = rs.getInt    ( 7 );
                int idProvedor     = rs.getInt    ( 8 );

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
    
    public void muestraEmpresas(DefaultTableModel modelo) {
        modelo.setNumRows     (0            );
        modelo.setColumnCount (0          );
        modelo.addColumn      ("#"         );
        modelo.addColumn      ("Nombre"    );
        modelo.addColumn      ("Giro"      );
        modelo.addColumn      ("Email"     );
        modelo.addColumn      ("Telefono"  );
        modelo.addColumn      ("Domicilio" );
        try {
            String query = "SELECT * FROM empresas";

            conexion = con.getConexion();
            st = conexion.createStatement();
            rs = st.executeQuery(query);
            
            while (rs.next()) {
                String nombre     = rs.getString ( 2 );
                String giro       = rs.getString ( 3 );
                String email      = rs.getString ( 4 );
                String telefono   = rs.getString ( 5 );
                String domicilio  = rs.getString ( 6 );
            
                Object[] nuevoRenglon = {"#", nombre, giro, email, telefono, domicilio};
                modelo.addRow(nuevoRenglon);
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
    
    public void muestraProvedores(DefaultTableModel modelo) {
        modelo.setNumRows     (0                     );
        modelo.setColumnCount (0                  );
        modelo.addColumn      ("#"                 );
        modelo.addColumn      ("Nombre"            );
        modelo.addColumn      ("Telefono"          );
        modelo.addColumn      ("Email"             );
        modelo.addColumn      ("Fecha de contrato" );
        modelo.addColumn      ("Empresa"           );
        
        try {
            String query = "SELECT * FROM provedores";

            conexion = con.getConexion();
            st = conexion.createStatement();
            rs = st.executeQuery(query);
            
            sta = conexion.createStatement(); 

            while (rs.next()) {
                String nombre         = rs.getString ( 2 );
                String telefono       = rs.getString ( 3 );
                String email          = rs.getString ( 4 );
                String fechaContrato  = rs.getString ( 5 );
                int idEmpresa         = rs.getInt    ( 6 );
                
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
                if (rsEmp != null) rsEmp.close();
                if (sta != null) sta.close();
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void muestraVenta(DefaultTableModel modelo) {
        modelo.setNumRows     (0            );
        modelo.setColumnCount (0         );
        modelo.addColumn      ("#"        );
        modelo.addColumn      ("Codigo"   );
        modelo.addColumn      ("Fecha"    );
        modelo.addColumn      ("Subtotal" );
        modelo.addColumn      ("Total"    );
        try {
            String query = "SELECT * FROM ventas AS v, productos_ventas AS pv" +
                           " WHERE v.idVenta = pv.idVenta";

            conexion = con.getConexion();
            st = conexion.createStatement();
            rs = st.executeQuery(query);

            while (rs.next()) {
                String fecha          = rs.getString(2);
                String subtotal       = rs.getString(3);
                String total          = rs.getString(4);
                String codigo         = rs.getString(5);
                Object[] nuevoRenglon = {"#", codigo, fecha, subtotal, total};
                modelo.addRow(nuevoRenglon);
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
    
    public void eliminaProducto(int codigo) {
        try {
            String query = "DELETE FROM productos WHERE codigo = " + codigo;

            conexion = con.getConexion();
            st = conexion.createStatement();
            st.executeUpdate(query);
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (st != null) st.close();
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void eliminaEmpresa(String nombre) {
        try {
            String query = "DELETE FROM empresas WHERE nombre = '" + nombre + "';";

            conexion = con.getConexion();
            st = conexion.createStatement();
            st.executeUpdate(query);
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (st != null) st.close();
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void eliminaProvedor(String telefono) {
        try {
            String query = "DELETE FROM provedores WHERE telefono = '" + telefono + "';";

            conexion = con.getConexion();
            st = conexion.createStatement();
            st.executeUpdate(query);
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (st != null) st.close();
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void eliminaVenta(String codigo) {
        try {
            String queryCodigo = "SELECT idVenta FROM productos_ventas WHERE codigo = " + codigo;
             
            conexion = con.getConexion();
            st = conexion.createStatement();
            rs = st.executeQuery(queryCodigo);

            rs.next();
            int idVenta = rs.getInt(1);
            
            String query = "DELETE FROM venta WHERE idVenta = '" + idVenta + "';";
            st.executeUpdate(query);
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (st != null) st.close();
                if (rs != null) rs.close();
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void actualizaProducto(Producto obj) {
        int codigo         = obj.getCodigo();
        String nombre      = obj.getNombre();
        String marca       = obj.getMarca();
        float precioCompra = obj.getPrecioCompra();
        float  precioVenta = obj.getPrecioVenta();
        int    existencias = obj.getExistencias();
        int idProv         = obj.getIdProvedor();
        
        try {
            String query = "UPDATE Productos SET nombre = '"+nombre+"', marca = '"+marca+"',"
                + "precioCompra = " + precioCompra + ", precioVenta = " + precioVenta + ", "
                + "existencias = " + existencias + ", idProvedor = " +idProv+ " WHERE codigo = " + codigo + ";";

            conexion = con.getConexion();
            st = conexion.createStatement();
            st.executeUpdate(query);
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (st != null) st.close();
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void actualizaEmpresa(Empresa obj) {
        String nombre    = obj.getNombre();
        String giro      = obj.getGiro();
        String email     = obj.getEmail();
        String telefono  = obj.getTelefono();
        String domicilio = obj.getDomicilio();
        
        try {
            String query = "UPDATE empresas SET giro = '"+giro+"', email = '"+email+"',"
                + "telefono = '" + telefono + "', domicilio = '" + domicilio
                + "' WHERE nombre = '" + nombre + "';";

            conexion = con.getConexion();
            st = conexion.createStatement();
            st.executeUpdate(query);
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (st != null) st.close();
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void actualizaProvedor(Provedor obj) {
        String nombre   = obj.getNombre();
        String telefono = obj.getTelefono();
        String email    = obj.getEmail();
        String fechaCon = obj.getFechaContrato();
        int empresa  = obj.getIdEmpresa();
        
        try {
            String query = "UPDATE provedores SET telefono = '"+telefono+"',"
                + "email = '" + email + "'," + "fechaContrato = '" +fechaCon+"', idEmpresa = "+empresa+" WHERE nombre = '" + nombre + "';";

            conexion = con.getConexion();
            st = conexion.createStatement();
            st.executeUpdate(query);
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (st != null) st.close();
                if (conexion != null) conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
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
    
    public void getEmpresas(JComboBox cb) {
        cb.removeAllItems();
        Connection conn = con.getConexion();
        String query = "SELECT nombre FROM empresas";
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery(query);
            
            while(rs.next()) {
                cb.addItem(rs.getString(1));
            }
            
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
    }
    
    public void getProvedores(JComboBox cb) {
        cb.removeAllItems();
        Connection conn = con.getConexion();
        String query = "SELECT nombre FROM provedores";
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery(query);
            
            while(rs.next()) {
                cb.addItem(rs.getString(1));
            }
            
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
    }
    
    public int getIdProvedor(String nombre) {
        Connection conn = con.getConexion();
        int id = -1;
        String query = "SELECT idProvedor FROM provedores WHERE nombre = '" + nombre +"'";
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery(query);
            
            rs.next();
            id = rs.getInt(1);
            
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
        
        return id;
    }
    
    public boolean hayProvedores() {
        try {
            String query = "SELECT * FROM provedores;";

            conexion = con.getConexion();
            st = conexion.createStatement();
            rs = st.executeQuery(query);
            
            if (rs.next()) {
                return true;
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
        return false;
    }
    
    public boolean hayEmpresas() {
        try {
            String query = "SELECT * FROM empresas;";

            conexion = con.getConexion();
            st = conexion.createStatement();
            rs = st.executeQuery(query);
            
            if (rs.next()) {
                return true;
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
        return false;
    }
    
    public boolean hayProductos() {
        try {
            String query = "SELECT * FROM productos;";

            conexion = con.getConexion();
            st = conexion.createStatement();
            rs = st.executeQuery(query);
            
            if (rs.next()) {
                return true;
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
        return false;
    }
    
    public boolean existeNombreEnEmpresas(String nombre) {
        try {
            String query = "SELECT * FROM empresas WHERE nombre= '"+nombre+"';";

            conexion = con.getConexion();
            st = conexion.createStatement();
            rs = st.executeQuery(query);
            
            if (rs.next()) {
                return true;
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
        return false;
    }
    
    public boolean existeEmailEnEmpresas(String email) {
        try {
            String query = "SELECT * FROM empresas WHERE email = '"+email+"';";

            conexion = con.getConexion();
            st = conexion.createStatement();
            rs = st.executeQuery(query);
            
            if (rs.next()) {
                return true;
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
        return false;
    }
    
    public boolean existeTelEnEmpresas(String tel) {
        try {
            String query = "SELECT * FROM empresas WHERE telefono = '"+tel+"';";

            conexion = con.getConexion();
            st = conexion.createStatement();
            rs = st.executeQuery(query);
            
            if (rs.next()) {
                return true;
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
        return false;
    }
    
    public boolean existeTelEnProvedores(String tel) {
        try {
            String query = "SELECT * FROM provedores WHERE telefono = '"+tel+"';";

            conexion = con.getConexion();
            st = conexion.createStatement();
            rs = st.executeQuery(query);
            
            if (rs.next()) {
                return true;
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
        return false;
    }
}
