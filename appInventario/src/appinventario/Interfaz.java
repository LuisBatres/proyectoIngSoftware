package appinventario;

import BD.BD;
import BD.Conexion;
import java.awt.Color;
import java.awt.Insets;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;


public class Interfaz extends javax.swing.JFrame {

    Color buttonsColor = new Color(255, 255, 255);
    Color buttonsColorEntered = new Color(190, 190, 190);
    
    DefaultTableModel modelo;

    Conexion con = new Conexion();
    BD bd = new BD();
    
    public Interfaz() {
        initComponents();
        JMenuBarPers men = new JMenuBarPers ( this );
        con.getConexion();
        
        modelo = (DefaultTableModel)tblProductos.getModel();
        
        bd.muestraProductos(modelo);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jbtnProvedores = new javax.swing.JButton();
        jbtnVentas = new javax.swing.JButton();
        jbtnProductos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbtnNuevo = new javax.swing.JButton();
        jbtnModificar = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jbtnExptrExcl = new javax.swing.JButton();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jMenu5.setText("jMenu5");

        jMenu6.setText("jMenu6");

        jPopupMenu1.setComponentPopupMenu(jPopupMenu1);
        jPopupMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPopupMenu1.setInheritsPopupMenu(true);

        jMenuItem5.setText("jMenuItem5");
        jPopupMenu1.add(jMenuItem5);

        jMenuItem6.setText("jMenuItem6");
        jPopupMenu1.add(jMenuItem6);

        jMenu7.setText("jMenu7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(25, 34, 43));

        jbtnProvedores.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jbtnProvedores.setText("Provedores");
        jbtnProvedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnProvedores.setFocusPainted(false);
        jbtnProvedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnProvedoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnProvedoresMouseExited(evt);
            }
        });
        jbtnProvedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnProvedoresActionPerformed(evt);
            }
        });

        jbtnVentas.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jbtnVentas.setText("Ventas");
        jbtnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnVentas.setFocusPainted(false);
        jbtnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnVentasMouseExited(evt);
            }
        });
        jbtnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnVentasActionPerformed(evt);
            }
        });

        jbtnProductos.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jbtnProductos.setText("Productos");
        jbtnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnProductos.setFocusPainted(false);
        jbtnProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnProductosMouseExited(evt);
            }
        });
        jbtnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnProvedores, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jbtnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jbtnProvedores, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jbtnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Codigo", "Nombre", "Marca", "Precio Compra", "Precio Venta", "Existencias", "Provedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProductos);

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel1.setText("Productos");

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("_______________________________________________________________________________________________");

        jbtnNuevo.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jbtnNuevo.setText("Nuevo");
        jbtnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnNuevo.setFocusPainted(false);
        jbtnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnNuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnNuevoMouseExited(evt);
            }
        });
        jbtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoActionPerformed(evt);
            }
        });

        jbtnModificar.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jbtnModificar.setText("Modificar");
        jbtnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnModificar.setFocusPainted(false);
        jbtnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnModificarMouseExited(evt);
            }
        });
        jbtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarActionPerformed(evt);
            }
        });

        jbtnEliminar.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jbtnEliminar.setText("Eliminar");
        jbtnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnEliminar.setFocusPainted(false);
        jbtnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnEliminarMouseExited(evt);
            }
        });
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });

        jbtnExptrExcl.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jbtnExptrExcl.setText("Exportar Excel");
        jbtnExptrExcl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnExptrExcl.setFocusPainted(false);
        jbtnExptrExcl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnExptrExclMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnExptrExclMouseExited(evt);
            }
        });
        jbtnExptrExcl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExptrExclActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(297, 297, 297)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(jbtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(jbtnExptrExcl))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnExptrExcl, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1035, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnExptrExclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExptrExclActionPerformed
        // TODO add your handling code here:
        ExportarExcel obj;

        try {
            obj = new ExportarExcel();
            obj.exportarExcel(tblProductos);
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_jbtnExptrExclActionPerformed

    private void jbtnExptrExclMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnExptrExclMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnExptrExclMouseExited

    private void jbtnExptrExclMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnExptrExclMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnExptrExclMouseEntered

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jbtnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnEliminarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnEliminarMouseExited

    private void jbtnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnEliminarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnEliminarMouseEntered

    private void jbtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarActionPerformed
        // TODO add your handling code here:
        modificarProducto mp = new modificarProducto(this, rootPaneCheckingEnabled);
        mp.setVisible(true);
    }//GEN-LAST:event_jbtnModificarActionPerformed

    private void jbtnModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnModificarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnModificarMouseExited

    private void jbtnModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnModificarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnModificarMouseEntered

    private void jbtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoActionPerformed
        // TODO add your handling code here:
        /*
        nuevoProducto np = new nuevoProducto(this, rootPaneCheckingEnabled);
        np.setVisible(true);*/

        NMProvedor provedor = new NMProvedor(this, rootPaneCheckingEnabled);
        provedor.setVisible(true);
    }//GEN-LAST:event_jbtnNuevoActionPerformed

    private void jbtnNuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnNuevoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnNuevoMouseExited

    private void jbtnNuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnNuevoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnNuevoMouseEntered

    private void jbtnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnProductosActionPerformed
        //System.out.println(this.jMenuBar.getBackground());
        bd.muestraProductos(modelo);
    }//GEN-LAST:event_jbtnProductosActionPerformed

    private void jbtnProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnProductosMouseExited
        this.jbtnProductos.setBackground(buttonsColor);
    }//GEN-LAST:event_jbtnProductosMouseExited

    private void jbtnProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnProductosMouseEntered
        this.jbtnProductos.setBackground(buttonsColorEntered);
    }//GEN-LAST:event_jbtnProductosMouseEntered

    private void jbtnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnVentasActionPerformed

    private void jbtnVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnVentasMouseExited
        this.jbtnVentas.setBackground(buttonsColor);
    }//GEN-LAST:event_jbtnVentasMouseExited

    private void jbtnVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnVentasMouseEntered
        this.jbtnVentas.setBackground(buttonsColorEntered);
    }//GEN-LAST:event_jbtnVentasMouseEntered

    private void jbtnProvedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnProvedoresActionPerformed
        //System.out.println(this.jMenuBar.getBackground());
        bd.muestraProvedores(modelo);
    }//GEN-LAST:event_jbtnProvedoresActionPerformed

    private void jbtnProvedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnProvedoresMouseExited
        this.jbtnProvedores.setBackground(buttonsColor);
    }//GEN-LAST:event_jbtnProvedoresMouseExited

    private void jbtnProvedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnProvedoresMouseEntered
        this.jbtnProvedores.setBackground(buttonsColorEntered);
    }//GEN-LAST:event_jbtnProvedoresMouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        try {
            Color texto = new Color(255,255,255);
            Color fondoJMenuBar = new Color(26,36,46);
            Color fondoJMenuBarHover = new Color(40, 51, 66);
            
            int menuSpacing = 5; // espacio en píxeles
            Border emptyBorder = BorderFactory.createEmptyBorder(0, menuSpacing, 0, menuSpacing);
            
            Insets insets = new Insets(0, 0, 0, 0);
            UIManager.put("MenuBar.margin", insets);
        
            UIManager.put( "MenuBar.background", fondoJMenuBar);
            UIManager.put("MenuBar.borderBottom", Color.RED);
            
            UIManager.put ( "Menu.foreground"             , texto);
            //UIManager.put("Menu.contentMargins", new InsetsUIResource(0, 0, 0, 0));
            UIManager.put ( "Menu.selectionBackground"    , texto);
            UIManager.put("Menu.border", emptyBorder);
            UIManager.put ( "Menu.selectionBackground"    , fondoJMenuBarHover);
            UIManager.put ( "Menu.selectionForeground"    , texto);
            
            UIManager.put ( "MenuItem.background"         , fondoJMenuBarHover);
            UIManager.put ( "MenuItem.foreground"         , texto);
            UIManager.put ( "MenuItem.selectionBackground", fondoJMenuBar);
            UIManager.put ( "MenuItem.selectionForeground", texto);
            UIManager.put ( "MenuItem.border"             , BorderFactory.createEmptyBorder());
            
            
            UIManager.put("Button.background", Color.WHITE);
            //UIManager.put("Button.focus", Color.WHITE);
            //UIManager.put("Button.select", Color.LIGHT_GRAY);
            
            
            
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
   
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Interfaz interfaz = new Interfaz();
                interfaz.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnExptrExcl;
    private javax.swing.JButton jbtnModificar;
    private javax.swing.JButton jbtnNuevo;
    private javax.swing.JButton jbtnProductos;
    private javax.swing.JButton jbtnProvedores;
    private javax.swing.JButton jbtnVentas;
    private javax.swing.JTable tblProductos;
    // End of variables declaration//GEN-END:variables
}
