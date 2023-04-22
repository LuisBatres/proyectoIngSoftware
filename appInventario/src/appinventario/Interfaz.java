package appinventario;

import BD.BD;
import BD.Conexion;
import java.awt.Color;
import java.awt.Insets;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.plaf.ColorUIResource;
import javax.swing.table.DefaultTableModel;
import mx.tecnm.util.Imagenes;


public class Interfaz extends javax.swing.JFrame {

    Color colorBlack = new Color(0,0,0);
    Color colorWithe = new Color(255, 255, 255);
    Color buttonsColor = new Color(25, 34, 43);
    Color buttonsColorEntered = new Color(26,36,46);
    Color buttonEliminar = new Color(255,111,111);
    Color buttonExport = new Color(109,196,109);
    Color buttonsColorEnteredTop = new Color(239,239,239);
    
    int opc = 1; // Opcion para verificar la posicion del panel lateral
    /*
        opc = 1 -> Productos
        opc = 2 -> Provedores
        opc = 3 -> Ventas
    */
    
    DefaultTableModel modelo;
    Conexion con = new Conexion();
    BD bd = new BD();
    
    public Interfaz() {
        initComponents();
        JMenuBarPers men = new JMenuBarPers ( this );
        modelo = (DefaultTableModel)table.getModel();
        
        bd.muestraProductos(modelo);
        System.out.println(modelo);
        
        
        //jbtnNuevo.setIcon ( Imagenes.escalarImagen ( jbtnNuevo.getIcon (), 50, 30 ) );
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
        jbtnEmpresas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jlblTitulo = new javax.swing.JLabel();
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
        setBackground(new java.awt.Color(204, 204, 204));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(252, 252, 252));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(25, 34, 43));

        jbtnProvedores.setBackground(new java.awt.Color(25, 34, 43));
        jbtnProvedores.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jbtnProvedores.setForeground(new java.awt.Color(255, 255, 255));
        jbtnProvedores.setText("Provedores");
        jbtnProvedores.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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

        jbtnVentas.setBackground(new java.awt.Color(25, 34, 43));
        jbtnVentas.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jbtnVentas.setForeground(new java.awt.Color(255, 255, 255));
        jbtnVentas.setText("Ventas");
        jbtnVentas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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

        jbtnProductos.setBackground(new java.awt.Color(25, 34, 43));
        jbtnProductos.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jbtnProductos.setForeground(new java.awt.Color(255, 255, 255));
        jbtnProductos.setText("Productos");
        jbtnProductos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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

        jbtnEmpresas.setBackground(new java.awt.Color(25, 34, 43));
        jbtnEmpresas.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jbtnEmpresas.setForeground(new java.awt.Color(255, 255, 255));
        jbtnEmpresas.setText("Empresas");
        jbtnEmpresas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbtnEmpresas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnEmpresas.setFocusPainted(false);
        jbtnEmpresas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnEmpresasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnEmpresasMouseExited(evt);
            }
        });
        jbtnEmpresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEmpresasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbtnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbtnProvedores, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
            .addComponent(jbtnVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbtnEmpresas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jbtnProvedores, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jbtnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jbtnEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table);

        jlblTitulo.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jlblTitulo.setText("Productos");

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("_______________________________________________________________________________________________");

        jbtnNuevo.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jbtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-por-nueva-copia-30.png"))); // NOI18N
        jbtnNuevo.setText("Nuevo");
        jbtnNuevo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jbtnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnNuevo.setFocusPainted(false);
        jbtnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnNuevo.setName("Nuevo"); // NOI18N
        jbtnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
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

        jbtnModificar.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jbtnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-editar-archivo-30.png"))); // NOI18N
        jbtnModificar.setText("Modificar");
        jbtnModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jbtnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnModificar.setFocusPainted(false);
        jbtnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnModificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
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

        jbtnEliminar.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jbtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-eliminar-30.png"))); // NOI18N
        jbtnEliminar.setText("Eliminar");
        jbtnEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jbtnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnEliminar.setFocusPainted(false);
        jbtnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
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

        jbtnExptrExcl.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jbtnExptrExcl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-export-excel-30.png"))); // NOI18N
        jbtnExptrExcl.setText("Exportar");
        jbtnExptrExcl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jbtnExptrExcl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnExptrExcl.setFocusPainted(false);
        jbtnExptrExcl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnExptrExcl.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1040, 1040, 1040)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55)
                                        .addComponent(jbtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55)
                                        .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55)
                                        .addComponent(jbtnExptrExcl, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(jbtnExptrExcl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jlblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jbtnNuevo.getAccessibleContext().setAccessibleDescription("Nuevo");

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
        ExportarExcel obj;

        try {
            obj = new ExportarExcel();
            obj.exportarExcel(table);
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
    }//GEN-LAST:event_jbtnExptrExclActionPerformed

    private void jbtnExptrExclMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnExptrExclMouseExited
        jbtnExptrExcl.setBackground(colorWithe);
        jbtnExptrExcl.setForeground(colorBlack);
        ImageIcon icono = new ImageIcon(getClass().getResource("../icons8-export-excel-30.png"));
        jbtnExptrExcl.setIcon(icono);
    }//GEN-LAST:event_jbtnExptrExclMouseExited

    private void jbtnExptrExclMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnExptrExclMouseEntered
        jbtnExptrExcl.setBackground(buttonExport);
        jbtnExptrExcl.setForeground(colorWithe);
        ImageIcon icono = new ImageIcon(getClass().getResource("../icons8-export-excel-30-white.png"));
        jbtnExptrExcl.setIcon(icono);
    }//GEN-LAST:event_jbtnExptrExclMouseEntered

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
        int indice = table.getSelectedRow();
  
        try{
            switch (opc) {
                case 1:
                    int codigo = Integer.parseInt(table.getValueAt(indice, 1).toString());
                    bd.eliminaProducto(codigo);
                    bd.muestraProductos(modelo);
                    break;         
                case 2:
                    
                    break;
                    
                case 3:
                    
                    break;
                    
                case 4:
                    String nombre = table.getValueAt(indice, 1).toString();
                    bd.eliminaEmpresa(nombre);
                    break;
                default:
                    throw new AssertionError();
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun elemento de la tabla", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jbtnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnEliminarMouseExited
        jbtnEliminar.setBackground(colorWithe);
        jbtnEliminar.setForeground(colorBlack);
        ImageIcon icono = new ImageIcon(getClass().getResource("../icons8-eliminar-30.png"));
        jbtnEliminar.setIcon(icono);
    }//GEN-LAST:event_jbtnEliminarMouseExited

    private void jbtnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnEliminarMouseEntered
        jbtnEliminar.setBackground(buttonEliminar);
        jbtnEliminar.setForeground(colorWithe);
        ImageIcon icono = new ImageIcon(getClass().getResource("../icons8-eliminar-30-white.png"));
        jbtnEliminar.setIcon(icono);
    }//GEN-LAST:event_jbtnEliminarMouseEntered

    private void jbtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarActionPerformed
        try{
            int indice = table.getSelectedRow();
            switch (opc) {
                case 1:
                    formProducto prod = new formProducto(this, rootPaneCheckingEnabled);
                    prod.setTitle("Modificar Producto");

                    String codigo = table.getValueAt(indice, 1).toString();
                    String nombre = table.getValueAt(indice, 2).toString();
                    String marca = table.getValueAt(indice, 3).toString();
                    float pC = Float.parseFloat(table.getValueAt(indice, 4)+"");
                    float pV = Float.parseFloat(table.getValueAt(indice, 5)+"");
                    int cant = Integer.parseInt(table.getValueAt(indice, 6)+"");
                    String provedor = table.getValueAt(indice, 7).toString();
                    
                    prod.setInfo(codigo,nombre, marca, pC, pV, cant, provedor);
                    prod.blockPK();
                    
                    prod.setVisible(true);
                    break;
                    
                case 2:
                    formProvedor modProv = new formProvedor(this, rootPaneCheckingEnabled);
                    modProv.setTitle("Modificar Provedor");
                    
                    String nomP = table.getValueAt(indice, 1).toString();
                    String telP = table.getValueAt(indice, 2).toString();
                    String emailP = table.getValueAt(indice, 3).toString();
                    String fechaP = table.getValueAt(indice, 4).toString();
                    String empresa = table.getValueAt(indice, 5).toString();

                    modProv.setInfo(nomP, telP, emailP, fechaP, empresa);

                    modProv.setVisible(true);
                    break;
                    
                case 3:
                    formVenta nv = new formVenta(this, rootPaneCheckingEnabled);
                    nv.setTitle("Modificar Venta");
                    
                    
                    
                    nv.setVisible(true);
                    break;
                    
                case 4:
                    formEmpresa fe = new formEmpresa(this, rootPaneCheckingEnabled);
                    fe.setTitle("Modificar Empresa");

                    String nombreE   = table.getValueAt(indice, 1).toString();
                    String giro      = table.getValueAt(indice, 2).toString();
                    String email     = table.getValueAt(indice, 3).toString();
                    String telefono  = table.getValueAt(indice, 4).toString();
                    String domicilio = table.getValueAt(indice, 5).toString();

                    fe.setInfo(nombreE, giro, email, telefono, domicilio);

                    fe.setVisible(true);
                    break;
                default:
                    throw new AssertionError();
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningun elemento de la tabla", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtnModificarActionPerformed

    private void jbtnModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnModificarMouseExited
        jbtnModificar.setBackground(colorWithe);
    }//GEN-LAST:event_jbtnModificarMouseExited

    private void jbtnModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnModificarMouseEntered
        jbtnModificar.setBackground(buttonsColorEnteredTop);
    }//GEN-LAST:event_jbtnModificarMouseEntered

    private void jbtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoActionPerformed
        switch (opc) {
            case 1:
                if (bd.hayProvedores()) {
                    formProducto fp = new formProducto(this, rootPaneCheckingEnabled);
                    fp.setTitle("Nuevo Producto");
                    fp.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "No hay provedores");
                }
                break;
            case 2:
                if (bd.hayEmpresas()) {
                    formProvedor fp = new formProvedor(this, rootPaneCheckingEnabled);
                    fp.setTitle("Nuevo Provedor");
                    fp.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "No hay empresas");
                }
                break;
            case 3:
                if (bd.hayProductos()) {
                    formVenta nv = new formVenta(this, rootPaneCheckingEnabled);
                    nv.setTitle("Nueva Venta");
                    nv.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "No hay productos");
                }
                break;
            case 4:
                formEmpresa fe = new formEmpresa(this, rootPaneCheckingEnabled);
                fe.setTitle("Nueva Empresa");
                fe.setVisible(true);
                break;
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_jbtnNuevoActionPerformed

    private void jbtnNuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnNuevoMouseExited
        jbtnNuevo.setBackground(colorWithe);
    }//GEN-LAST:event_jbtnNuevoMouseExited

    private void jbtnNuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnNuevoMouseEntered
        jbtnNuevo.setBackground(buttonsColorEnteredTop);
    }//GEN-LAST:event_jbtnNuevoMouseEntered

    private void jbtnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnProductosActionPerformed
        opc = 1;
        //bd.muestraProductos(modelo);
        actualizaTablas();
        jlblTitulo.setText("Productos");
    }//GEN-LAST:event_jbtnProductosActionPerformed

    private void jbtnProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnProductosMouseExited
        this.jbtnProductos.setBackground(buttonsColor);
    }//GEN-LAST:event_jbtnProductosMouseExited

    private void jbtnProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnProductosMouseEntered
        this.jbtnProductos.setBackground(buttonsColorEntered);
    }//GEN-LAST:event_jbtnProductosMouseEntered

    private void jbtnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVentasActionPerformed
        opc = 3;
        jlblTitulo.setText("Ventas");
        bd.muestraVenta(modelo);
    }//GEN-LAST:event_jbtnVentasActionPerformed

    private void jbtnVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnVentasMouseExited
        this.jbtnVentas.setBackground(buttonsColor);
    }//GEN-LAST:event_jbtnVentasMouseExited

    private void jbtnVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnVentasMouseEntered
        this.jbtnVentas.setBackground(buttonsColorEntered);
    }//GEN-LAST:event_jbtnVentasMouseEntered

    private void jbtnProvedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnProvedoresActionPerformed
        opc = 2;
        jlblTitulo.setText("Provedores");
        bd.muestraProvedores(modelo);
    }//GEN-LAST:event_jbtnProvedoresActionPerformed

    private void jbtnProvedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnProvedoresMouseExited
        this.jbtnProvedores.setBackground(buttonsColor);
    }//GEN-LAST:event_jbtnProvedoresMouseExited

    private void jbtnProvedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnProvedoresMouseEntered
        this.jbtnProvedores.setBackground(buttonsColorEntered);
    }//GEN-LAST:event_jbtnProvedoresMouseEntered

    private void jbtnEmpresasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnEmpresasMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnEmpresasMouseEntered

    private void jbtnEmpresasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnEmpresasMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnEmpresasMouseExited

    private void jbtnEmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEmpresasActionPerformed
        opc = 4;
        jlblTitulo.setText("Empresas");
        bd.muestraEmpresas(modelo);
    }//GEN-LAST:event_jbtnEmpresasActionPerformed

    public void actualizaTablas() {
        bd.muestraProductos(modelo);
    }
    
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
            UIManager.put("Button.focus", new ColorUIResource(new Color(0, 0, 0, 0)));
            //UIManager.put("Button.focus", Color.WHITE);
            //UIManager.put("Button.select", Color.LIGHT_GRAY);
            
            UIManager.put("Menu.shortcutKeys", null);
UIManager.put("MenuItem.acceleratorSelectionForeground", null);
UIManager.put("MenuItem.selectionBackground", UIManager.getColor("MenuBar.background"));

            
            
            
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
    private javax.swing.JButton jbtnEmpresas;
    private javax.swing.JButton jbtnExptrExcl;
    private javax.swing.JButton jbtnModificar;
    private javax.swing.JButton jbtnNuevo;
    private javax.swing.JButton jbtnProductos;
    private javax.swing.JButton jbtnProvedores;
    private javax.swing.JButton jbtnVentas;
    private javax.swing.JLabel jlblTitulo;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
