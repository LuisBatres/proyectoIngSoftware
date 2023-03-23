package BD;

import appinventario.Empresa;
import appinventario.Producto;
import appinventario.Provedor;
import appinventario.Venta;
import javax.swing.JTable;

public class BD {
    // Agregar conexion
    
    public void insertaProducto(Producto obj) {
        int id = obj.getIdProd();
        String query = "INSERT INTO producto WHERE id = " + id;
    }
    
    public void insertaEmpresa(Empresa obj) {
        int id = obj.getIdEmpresa();
        String query = "INSERT INTO producto WHERE id = " + id;
    }
    
    public void insertaProvedor(Provedor obj) {
        int id = obj.getIdProvedor();
        String query = "INSERT INTO producto WHERE id = " + id;
    }
    
    public void insertaVenta(Venta obj) {
        String query = "";
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
}