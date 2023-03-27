/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appinventario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicMenuUI;
import mx.tecnm.util.Imagenes;

/**
 *
 * @author franc
 */
public class JMenuBarPers extends JFrame implements ActionListener {
    private JMenuBar mb;
    private JMenu menuFile,menuAbout,menuCerrar,menuMinimizar;
    private JMenuItem fileSalir,fileCerrarSesion,aboutVersion;
    private JFrame frame;
    
    public JMenuBarPers(JFrame frame) {
        this.frame = frame;
        mb = new JMenuBar();
        mb.setForeground(Color.red);
        mb.setPreferredSize(new Dimension(55,30));
        mb.add(Box.createHorizontalStrut(5));
        Border border = BorderFactory.createMatteBorder(0, 0, 0, 0, Color.RED);
        mb.setBorder(border);
        frame.setJMenuBar(mb);
        
        menuFile = new JMenu("Archivo");
        mb.add(menuFile);
        fileSalir = new JMenuItem("Salir");
        menuFile.add(fileSalir);
        fileCerrarSesion = new JMenuItem("Cerrar sesion");
        menuFile.add(fileCerrarSesion);
        
        menuAbout = new JMenu("Acerca de");
        mb.add(menuAbout);
        aboutVersion = new JMenuItem("Version");
        menuAbout.add(aboutVersion);
        
        mb.add(Box.createHorizontalGlue());
        
        menuMinimizar = new JMenu();
        mb.add(menuMinimizar);
        
        menuCerrar = new JMenu();
        mb.add(menuCerrar);
        
        //ImageIcon iconoCerrar = new ImageIcon("C:\\Users\\franc\\OneDrive\\Documentos\\GitHub\\proyectoIngSoftware\\appInventario\\src\\cerrar.png");
        ///menuCerrar.setIcon(iconoCerrar);
        //menuCerrar.setIcon(Imagenes.escalarImagen(menuCerrar.getIcon(), 30, 30));
        //menuCerrar.setPreferredSize(new Dimension(50,30));
        
        ImageIcon iconoMinimizar = new ImageIcon("C:\\Users\\franc\\OneDrive\\Documentos\\GitHub\\proyectoIngSoftware\\appInventario\\src\\error.png");
        menuMinimizar.setIcon(iconoMinimizar);
        menuMinimizar.setIcon(Imagenes.escalarImagen(menuMinimizar.getIcon(), 20, 20));
        
        menuCerrar.setBackground(Color.red);
        
        fileSalir.addActionListener(this);
        fileCerrarSesion.addActionListener(this);
        aboutVersion.addActionListener(this);
        
        menuCerrar.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        frame.dispose();
                    }
                });
        
        menuMinimizar.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        JFrame f = frame;
                        f.setState(Frame.ICONIFIED);
                    }
                });
        
        aboutVersion.setPreferredSize(new Dimension(100,25)); // ******
        fileCerrarSesion.setPreferredSize(new Dimension(100,25)); // ******
        fileSalir.setPreferredSize(new Dimension(100,25)); // ******
        
        fileSalir.setBorderPainted(false);
        fileCerrarSesion.setBorderPainted(false);
        
        menuCerrar.setPreferredSize(new Dimension(30, 25));
        menuCerrar.setUI(new CustomMenuUI()); // Establecemos un MenuUI personalizado
        Insets insets = new Insets(0,0,0,0);
        menuCerrar.setMargin(insets);
        
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==fileSalir) {
            frame.dispose();
        }
        if (e.getSource()==fileCerrarSesion) {
            frame.dispose();
            InicioSesion is = new InicioSesion(this, rootPaneCheckingEnabled);
            is.setVisible(true);
        }
        if (e.getSource()==aboutVersion) {
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
        }
        if (e.getSource()==menuMinimizar) {
            
        }
    }

    public JMenuBar menu() {
        return mb;
    }
    
    
class CustomMenuUI extends BasicMenuUI {
        private final ImageIcon backgroundImage = new ImageIcon("C:\\Users\\franc\\OneDrive\\Documentos\\GitHub\\proyectoIngSoftware\\appInventario\\src\\cerrar.png");

        @Override
        public void paint(Graphics g, JComponent c) {
            // Dibujamos la imagen de fondo en el menú
            if (backgroundImage != null) {
                g.drawImage(backgroundImage.getImage(), 0, 0, c.getWidth(), c.getHeight(), null);
            }

            // Dibujamos el texto y los elementos del menú
            super.paint(g, c);
        }
    }
}
