/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Cliente;
import Modelo.ClienteDB;
import Modelo.DBTabla;
import java.awt.Dimension;
import java.util.List;
import java.util.Vector;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 * Invernadero Gran Valle
 * @author Clog_10
 */
public class vistaCliente extends javax.swing.JInternalFrame {

    private ClienteDB c;
   // private DBTabla tabla;
    private  Cliente cliente;
    private JDesktopPane iM;
    /**
     * Creates new form vistaCliente
     */
    public vistaCliente() {
        initComponents();
        iM = this.getDesktopPane();
        c=new ClienteDB();
        cargarTabla();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setTitle("Clientes");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "RFC", "Nombre", "Apellido Paterno", "Apellido Materno", "Calle", "Numero", "Colonia", "Municipio", "Estado", "Numero de Telefono", "Numero de Celular", "Email"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/eliminar.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/editar.png"))); // NOI18N
        jButton2.setBorder(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/agregar.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1213, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jButton1)
                .addGap(124, 124, 124)
                .addComponent(jButton2)
                .addGap(115, 115, 115)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(148, 148, 148))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
                                      

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //Cliente cliente;
        vistaDatosCliente datosCliente  = new vistaDatosCliente();
        interfaceMenu.vistaPrincipal.add(datosCliente);
        datosCliente.toFront();
        datosCliente.setVisible(true);
        System.out.println("asdfas");
        
      //  centrarVistaDATOS(datosCliente);
        
        
    }                                        

    public void centrarVistaDATOS(JInternalFrame fr){
        iM.add(fr);
        Dimension dim = iM.getSize();
        Dimension dimForm = fr.getSize();
        fr.setLocation((dim.width-dimForm.width)/2, (dim.height-dimForm.height)/2);
        fr.setClosable(true);
        fr.show();
    
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try{
            this.setClosed(true);
        }catch(Exception e){
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

  /*  public void vaciarCampos(){
        jTextField1.setText(" ");
        jTextField2.setText(" ");
        jTextField3.setText(" ");
        jTextField4.setText(" ");
        jTextField5.setText(" ");
        jTextField6.setText(" ");
        jTextField7.setText(" ");
        jTextField8.setText(" ");
        jTextField9.setText(" ");
        jTextField10.setText(" ");
        jTextField11.setText(" ");
        jTextField12.setText(" ");
        jTextField13.setText(" ");
    }*/
    
   

    
    
        protected void cargarTabla() {
        Vector<Object> fila;
        List<Cliente> clientes = c.listCliente();
        int i=0;
        for (Cliente client : clientes) {
            
            
           
            
           /* fila = new Vector<Object>();
            fila.add(client.getId());
            fila.add(client.getRFC());
            fila.add(client.getNombre());
            fila.add(client.getaPaterno());
            fila.add(client.getaMaterno());
            fila.add(client.getCalle());
            fila.add(client.getNumero());
            fila.add(client.getColonia());
            fila.add(client.getMunicipio());
            fila.add(client.getEstado());
            fila.add(client.getTelefono());
            fila.add(client.getCelular());
            fila.add(client.getEmail());*/
           
/*
            jTable2.setValueAt(client.getId(),i ,0);
            jTable2.setValueAt(client.getRFC(), i, 1);
            jTable2.setValueAt(client.getNombre(),i,2);
            jTable2.setValueAt(client.getaPaterno(), i,3);
            jTable2.setValueAt(client.getaMaterno(), i, 4);
            jTable2.setValueAt(client.getCalle(),i,5);
            jTable2.setValueAt(client.getNumero(),i,6);
            jTable2.setValueAt(client.getColonia(),i,7);
            jTable2.setValueAt(client.getMunicipio(),i,8);
            jTable2.setValueAt(client.getEstado(),i,9);
            jTable2.setValueAt(client.getTelefono(), i, 10);
            jTable2.setValueAt(client.getCelular(), i, 11);
            jTable2.setValueAt(client.getEmail(), i, 12);
*/
            //getTabla().tableModel.addRow(fila);
           
            i++;
        }
    }
        
       // public DBTabla getTabla() { return tabla; }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables


}

