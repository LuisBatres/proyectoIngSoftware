package appinventario;

import BD.Conexion;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;

public class Interfaz extends javax.swing.JFrame {

    Color buttonsColor = new Color(255, 255, 255);
    Color buttonsColorEntered = new Color(190, 190, 190);

    public Interfaz() {
        initComponents();
        
        Conexion con = new Conexion();
        con.conexion();
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
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbtnNuevo = new javax.swing.JButton();
        jbtnModificar = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabelArchivo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

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
        setUndecorated(true);
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
                .addContainerGap(118, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(32767, 15));
        jPanel3.setMinimumSize(new java.awt.Dimension(100, 15));
        jPanel3.setPreferredSize(new java.awt.Dimension(518, 10));

        jLabelArchivo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelArchivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelArchivo.setText("Archivo");
        jLabelArchivo.setComponentPopupMenu(jPopupMenu1);
        jLabelArchivo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelArchivo.setOpaque(true);
        jLabelArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelArchivoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelArchivoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelArchivoMouseExited(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Acerca de");
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabelArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 558, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(77, 77, 77)
                                        .addComponent(jbtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(74, 74, 74)
                                .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(103, 103, 103)
                        .addComponent(jLabel2))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jbtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jMenuBar.setBorder(null);
        jMenuBar.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar.setMaximumSize(new java.awt.Dimension(50, 22));
        jMenuBar.setMinimumSize(new java.awt.Dimension(50, 22));
        jMenuBar.setOpaque(true);
        jMenuBar.setPreferredSize(new java.awt.Dimension(50, 22));

        jMenu1.setText("File");

        jMenuItem1.setText("Cerrar Sesion");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar.add(jMenu1);

        jMenu2.setText("About");

        jMenuItem3.setText("Version");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar.add(jMenu2);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnProvedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnProvedoresActionPerformed
        System.out.println(this.jMenuBar.getBackground());
    }//GEN-LAST:event_jbtnProvedoresActionPerformed

    private void jbtnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnVentasActionPerformed

    private void jbtnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnProductosActionPerformed
        System.out.println(this.jMenuBar.getBackground());
    }//GEN-LAST:event_jbtnProductosActionPerformed

    private void jbtnProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnProductosMouseEntered
        this.jbtnProductos.setBackground(buttonsColorEntered);
    }//GEN-LAST:event_jbtnProductosMouseEntered

    private void jbtnProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnProductosMouseExited
        this.jbtnProductos.setBackground(buttonsColor);
    }//GEN-LAST:event_jbtnProductosMouseExited

    private void jbtnProvedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnProvedoresMouseEntered
        this.jbtnProvedores.setBackground(buttonsColorEntered);
    }//GEN-LAST:event_jbtnProvedoresMouseEntered

    private void jbtnProvedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnProvedoresMouseExited
        this.jbtnProvedores.setBackground(buttonsColor);
    }//GEN-LAST:event_jbtnProvedoresMouseExited

    private void jbtnVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnVentasMouseEntered
        this.jbtnVentas.setBackground(buttonsColorEntered);
    }//GEN-LAST:event_jbtnVentasMouseEntered

    private void jbtnVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnVentasMouseExited
        this.jbtnVentas.setBackground(buttonsColor);
    }//GEN-LAST:event_jbtnVentasMouseExited

    private void jbtnNuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnNuevoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnNuevoMouseEntered

    private void jbtnNuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnNuevoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnNuevoMouseExited

    private void jbtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnNuevoActionPerformed

    private void jbtnModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnModificarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnModificarMouseEntered

    private void jbtnModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnModificarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnModificarMouseExited

    private void jbtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnModificarActionPerformed

    private void jbtnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnEliminarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnEliminarMouseEntered

    private void jbtnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnEliminarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnEliminarMouseExited

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,
            "Software Inventario\n\n"
            + "Integrantes:\n"
            + "Iván Osmar Vasquez Flores - 20130827\n" +
            "Adrián Torres de Alba - 20130763\n" +
            "Heriberto Agustín Zuñiga Silveti - 20130769\n" +
            "Luis Enrique Batres Martínez - 20130806\n" +
            "Marcos Eduardo Solis Ceniceros - 20130844\n" +
            "Francisco Quezada Rivera - 20130815\n\n" +
            "1.0.0 v", "Acerca De", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        int opcion = JOptionPane.showConfirmDialog(null, "¿Esta seguro que quiere salir?", "SALIR", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if(opcion == JOptionPane.YES_OPTION)
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        InicioSesion is = new InicioSesion(this, rootPaneCheckingEnabled);
        is.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jLabelArchivoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelArchivoMouseEntered
        this.jLabelArchivo.setForeground(new Color(255,255,255));
        this.jPopupMenu1.setVisible(true);
    }//GEN-LAST:event_jLabelArchivoMouseEntered

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabelArchivoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelArchivoMouseExited
        this.jLabelArchivo.setBackground(new Color(255,255,255));
        this.jLabelArchivo.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_jLabelArchivoMouseExited

    private void jLabelArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelArchivoMouseClicked
        
        
    }//GEN-LAST:event_jLabelArchivoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        System.out.println("N");
        Color color = new Color(255, 255, 255);
        UIManager.put("MenuBar.background", new Color(255,255,255));
        UIManager.put("nimbusBase", color);
        
        try {
            System.out.println("llego");
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelArchivo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnModificar;
    private javax.swing.JButton jbtnNuevo;
    private javax.swing.JButton jbtnProductos;
    private javax.swing.JButton jbtnProvedores;
    private javax.swing.JButton jbtnVentas;
    // End of variables declaration//GEN-END:variables
}
