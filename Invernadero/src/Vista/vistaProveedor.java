/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Proveedor;
import Modelo.ProveedorDB;
import static Vista.interfaceMenu.vistaPrincipal;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.List;
import java.util.Vector;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author gurren-lagann
 */
public class vistaProveedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form vistaProveedor
     */
      private ProveedorDB c;
   // private DBTabla tabla;
    private  Proveedor proveedor,proveedorActualiza;
    private JDesktopPane iM;
    public vistaProveedor() {
        initComponents();
        this.getContentPane().setBackground(Color.decode("#F0EFE8"));
        iM = this.getDesktopPane();
        c = new ProveedorDB();
        jTable2.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,12));
        jTable2.getTableHeader().setOpaque(false);
        jTable2.getTableHeader().setBackground(new Color(32,136,203));
        jTable2.getTableHeader().setForeground(new Color(255,255,255));
        jTable2.setRowHeight(25);
        cargarTabla();
    }
    
    
    public void cargarTabla() {
        Vector<Object> fila;
        List<Proveedor> proveedores = c.listProveedor();
       
        
        int i=0;
        for (Proveedor prov : proveedores) {

            jTable2.setValueAt(prov.getId(),i ,0);
            jTable2.setValueAt(prov.getRazonSocial(), i, 1);
            jTable2.setValueAt(prov.getRfc(),i,2);
            jTable2.setValueAt(prov.getCalle(), i,3);
            jTable2.setValueAt(prov.getNumero(),i,4);
            jTable2.setValueAt(prov.getColonia(), i, 5);
            jTable2.setValueAt(prov.getMunicipio(),i,6);
            jTable2.setValueAt(prov.getEstado(),i,7);
            jTable2.setValueAt(prov.getTelefono(),i,8);
            jTable2.setValueAt(prov.getCelular(), i, 9);
            jTable2.setValueAt(prov.getEmail(),i,10);

            i++;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(240, 239, 232));
        setTitle("Proovedores");
        setPreferredSize(new java.awt.Dimension(900, 400));

        jTable2.setBackground(new java.awt.Color(255, 255, 255));
        jTable2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable2.setForeground(new java.awt.Color(0, 0, 0));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Razón Social", "RFC", "Calle", "Numero", "Colonia", "Municipio", "Estado", "Telefono", "Celular", "Email"
            }
        ));
        jTable2.setFocusable(false);
        jTable2.setGridColor(new java.awt.Color(128, 128, 128));
        jTable2.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable2.setRowHeight(25);
        jTable2.setSelectionBackground(new java.awt.Color(238, 238, 238));
        jTable2.setShowVerticalLines(false);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/agregar.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/editar.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/eliminar.png"))); // NOI18N
        jButton3.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(171, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(158, 158, 158)
                .addComponent(jButton2)
                .addGap(161, 161, 161)
                .addComponent(jButton3)
                .addContainerGap(171, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        vistaDatosProveedor datosProveedor = new vistaDatosProveedor();
        interfaceMenu.vistaPrincipal.add(datosProveedor);
        datosProveedor.setClosable(true);
        Dimension dim = interfaceMenu.vistaPrincipal.getSize();
        Dimension dimForm = datosProveedor.getSize();
        datosProveedor.setLocation((dim.width - dimForm.width) / 2, (dim.height - dimForm.height) / 2);
        datosProveedor.toFront();
        datosProveedor.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        int filaPulsada = jTable2.getSelectedRow();
        if (filaPulsada >= 0) {
            proveedorActualiza = new Proveedor();
            int id = (int) jTable2.getValueAt(filaPulsada, 0);
            String rsocial = (String) jTable2.getValueAt(filaPulsada, 1);
            String rfc = (String) jTable2.getValueAt(filaPulsada, 2);
            String calle = (String) jTable2.getValueAt(filaPulsada, 3);
            String numero = (String) jTable2.getValueAt(filaPulsada, 4);
            String colonia = (String) jTable2.getValueAt(filaPulsada, 5);
            String municipio = (String) jTable2.getValueAt(filaPulsada, 6);
            String estado = (String) jTable2.getValueAt(filaPulsada, 7);
            String telefono = (String) jTable2.getValueAt(filaPulsada, 8);
            String celular = (String) jTable2.getValueAt(filaPulsada, 9);
            String email = (String) jTable2.getValueAt(filaPulsada, 10);
            
            proveedorActualiza.setId(id);
            proveedorActualiza.setRazonSocial(rsocial);
            proveedorActualiza.setRfc(rfc);
            proveedorActualiza.setCalle(calle);
            proveedorActualiza.setNumero(numero);
            proveedorActualiza.setColonia(colonia);
            proveedorActualiza.setMunicipio(municipio);
            proveedorActualiza.setEstado(estado);
            proveedorActualiza.setTelefono(telefono);
            proveedorActualiza.setCelular(celular);
            proveedorActualiza.setEmail(email);

            //System.out.println(proveedorActualiza.regresaDatos());
            //c.deleteCliente(proveedorActualiza);

            vistaDatosProveedorActualiza datosProveedor = new vistaDatosProveedorActualiza(proveedorActualiza);
            datosProveedor.setClosable(true);
            interfaceMenu.vistaPrincipal.add(datosProveedor);
            Dimension dim = interfaceMenu.vistaPrincipal.getSize();
            Dimension dimForm = datosProveedor.getSize();
            datosProveedor.setLocation((dim.width - dimForm.width) / 2, (dim.height - dimForm.height) / 2);
            datosProveedor.toFront();
            datosProveedor.setVisible(true);
        }else{
                    JOptionPane.showMessageDialog(null, "Seleccione un elemento de la tabla para continuar...");

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {                                         
            // TODO add your handling code here:
            vistaPrincipal.removeAll();
            vistaPrincipal.updateUI();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
