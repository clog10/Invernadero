/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Producto;
import Modelo.ProductoDB;
import java.awt.Dimension;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author lenovo
 */
public class productos extends javax.swing.JInternalFrame {
    private ProductoDB p;
    private Producto producto;
    /**
     * Creates new form productos
     */
    public productos() {
        initComponents();
        p= new ProductoDB();
        //cargarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Unidad de Medida", "Precio Unitario", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/agregar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/editar.png"))); // NOI18N
        jButton2.setToolTipText("");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/eliminar.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(84, 84, 84)
                .addComponent(jButton3)
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      /*  vistaDatosProductos vista= new vistaDatosProductos();
        //vistaDatosCliente datosCliente  = new vistaDatosCliente();
        interfaceMenu.vistaPrincipal.add(vista);
        Dimension dim = interfaceMenu.vistaPrincipal.getSize();
        Dimension dimForm = vista.getSize();
        vista.setLocation((dim.width-dimForm.width)/2, (dim.height-dimForm.height)/2);
        vista.toFront();
        vista.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
      public void cargarTabla() {
        Vector<Object> fila;
        List<Producto> productos = p.listProducto();     
        
        int i=0;
        for (Producto pro : productos) {

            jTable2.setValueAt(pro.getId(),i ,0);
            jTable2.setValueAt(pro.getNombre(), i, 1);
            jTable2.setValueAt(pro.getUnidad(),i,2);
            jTable2.setValueAt(pro.getPrecio(), i,3);
            jTable2.setValueAt(pro.getCantidad(), i, 4);

            i++;
        }
   */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}

