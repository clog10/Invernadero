/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import java.awt.Graphics;
/**
 *
 * @author AMAURY
 */
public class interfaceMenu extends javax.swing.JFrame {

    /**
     * Creates new form interfaceMenu
     */
    
    private Icon iconoEscalado;
    private Icon anu;
    public interfaceMenu() {
        initComponents();

        /*
        ImageIcon imgIcon = new ImageIcon(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/resources/logo.png")));
        Image img = imgIcon.getImage();
        Image img2 = img.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
        iconoEscalado = new ImageIcon(img2);
        jLabel1.setIcon(iconoEscalado);
        
        //icono anu
        ImageIcon imgIconA = new ImageIcon(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/resources/anu.png")));
        Image imgA = imgIconA.getImage();
        Image img2A = imgA.getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_SMOOTH);
        anu = new ImageIcon(img2A);
        jLabel5.setIcon(anu); */
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int w = getSize().width;
        int h = getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;
        setLocation(x, y);
        this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);
        this.setResizable(false);
    }

        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        ImageIcon icon = new ImageIcon(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/resources/fondo.png")));
        Image img = icon.getImage();
        vistaPrincipal = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(img,0,0,getWidth(),getHeight(),this);

            }

        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jMenu1.setText("jMenu1");

        jMenuItem5.setText("jMenuItem5");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(this.HIDE_ON_CLOSE);
        setBackground(new java.awt.Color(240, 236, 232));
        setIconImage(new ImageIcon(getClass().getResource("/resources/icon.png")).getImage());
        setPreferredSize(new java.awt.Dimension(710, 470));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout vistaPrincipalLayout = new javax.swing.GroupLayout(vistaPrincipal);
        vistaPrincipal.setLayout(vistaPrincipalLayout);
        vistaPrincipalLayout.setHorizontalGroup(
            vistaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        vistaPrincipalLayout.setVerticalGroup(
            vistaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(51, 51, 51));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setToolTipText("");

        jMenu2.setText("Ventas");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem1.setText("Punto de Venta");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Ventas");
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Almacen");
        jMenuItem3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Pedidos");
        jMenuItem4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Administracion");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem7.setText("Empleados");
        jMenuItem7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("Vehiculos");
        jMenuItem8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem9.setText("Proovedores");
        jMenuItem9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem10.setText("Estadisticas");
        jMenuItem10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.add(jMenuItem10);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vistaPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vistaPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        //vistaPrincipal.removeAll();
        //vistaPrincipal.updateUI();           

        vistaVehiculos vehiculos = new vistaVehiculos();
        //BasicInternalFrameUI bi = (BasicInternalFrameUI)vehiculos.getUI();
        //bi.setNorthPane(null);
        //vehiculos.setBorder(null);
        centrarVista(vehiculos);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    //Metodo para centrar los JInternalFrame dentro  del desktop frame
    public void centrarVista(JInternalFrame fr){
        try {
            reiniciarVista();
            vistaPrincipal.add(fr);
            Dimension dim = vistaPrincipal.getSize();
            Dimension dimForm = fr.getSize();
            fr.setLocation((dim.width-dimForm.width)/2, (dim.height-dimForm.height)/2);
            fr.setMaximum(true);
            fr.setUI(null);
            fr.show();
        } catch (PropertyVetoException ex) {
            Logger.getLogger(interfaceMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
       /* vistaPrincipal.removeAll();
        vistaPrincipal.updateUI();           
        this.setSize(980,580);
        vistaProveedor proveedor = new vistaProveedor();
        BasicInternalFrameUI bi = (BasicInternalFrameUI)proveedor.getUI();
        bi.setNorthPane(null);
        proveedor.setBorder(null);
        vistaPrincipal.add(proveedor);
        proveedor.setVisible(true);
        proveedor.setSize(950,500);
        this.setSize(980,580);
        this.repaint(); */
       reiniciarVista();
       vistaProveedor proveedor = new vistaProveedor();
       centrarVista(proveedor);
       
    }//GEN-LAST:event_jMenuItem9ActionPerformed
    

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // TODO add your handling code here:
        Dimension d = this.getContentPane().getSize();
            // code to save frame size or calculate internal frame sizes
        this.validate();
    }//GEN-LAST:event_formComponentResized

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed
    
     private void cerrar(){
        if (JOptionPane.showConfirmDialog(rootPane, "¿Esta seguro que desea salir?, su sesión será cerrada.",
                "Cerrar Sesión", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);
    }  
     
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        cerrar();
        this.dispose();
        interfaceLogin closeCurrentWindow = new interfaceLogin();
        closeCurrentWindow.setVisible(true);//Open the new window
        
    }//GEN-LAST:event_formWindowClosing
    
    //Metodo para reiniciar la vista de la ventana principal y no se encimen los jinternaframes
    public void reiniciarVista(){
        vistaPrincipal.removeAll();
        vistaPrincipal.updateUI();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfaceMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaceMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaceMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaceMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaceMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JDesktopPane vistaPrincipal;
    // End of variables declaration//GEN-END:variables
}
