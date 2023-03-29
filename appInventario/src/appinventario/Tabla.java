package appinventario;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/* @author franc */
public class Tabla extends JTable{
    JTable tabla = new JTable();
    
    DefaultTableModel modeloTabla = (DefaultTableModel)tabla.getModel();
    
    public Tabla() {
        //tabla.setB
    }
}
