package Vista;

import Modelo.Cliente;
import Modelo.ClienteDB;
import java.awt.Dimension;
import java.util.List;
import java.util.Vector;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Invernadero Gran Valle
 *
 * @author Clog_10
 */
public class vistaCliente extends javax.swing.JInternalFrame {

    private ClienteDB c;
    // private DBTabla tabla;
    private Cliente cliente;
    private JDesktopPane iM;
    private DefaultTableModel modelo;
    private Cliente clienteActualiza;

    /**
     * Creates new form vistaCliente
     */
    public vistaCliente() {
        initComponents();
        iM = this.getDesktopPane();
        c = new ClienteDB();

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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(74, 74, 74)
                .addComponent(jButton2)
                .addGap(86, 86, 86)
                .addComponent(jButton3)
                .addGap(508, 508, 508))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //Cliente cliente;
        vistaDatosCliente datosCliente = new vistaDatosCliente();
        interfaceMenu.vistaPrincipal.add(datosCliente);
        Dimension dim = interfaceMenu.vistaPrincipal.getSize();
        Dimension dimForm = datosCliente.getSize();
        datosCliente.setLocation((dim.width - dimForm.width) / 2, (dim.height - dimForm.height) / 2);
        datosCliente.toFront();
        datosCliente.setVisible(true);

        //  centrarVistaDATOS(datosCliente);                                       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try {
            this.setClosed(true);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        //int filaPulsada = vistaLibro.getTabla().tabla.getSelectedRow();
        int filaPulsada = jTable2.getSelectedRow();
        //System.out.println(filaPulsada);
        if (filaPulsada >= 0) {
            cliente = new Cliente();

            int id = (int) jTable2.getValueAt(filaPulsada, 0);
            //System.out.println(id);
            cliente.setId(id);
            c.deleteCliente(cliente);
        }

        cargarTabla();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int filaPulsada = jTable2.getSelectedRow();
        if (filaPulsada >= 0) {
            clienteActualiza = new Cliente();
            int id = (int) jTable2.getValueAt(filaPulsada, 0);
            String rfc = (String) jTable2.getValueAt(filaPulsada, 1);
            String nombre = (String) jTable2.getValueAt(filaPulsada, 2);
            String aPaterno = (String) jTable2.getValueAt(filaPulsada, 3);
            String aMaterno = (String) jTable2.getValueAt(filaPulsada, 4);
            String calle = (String) jTable2.getValueAt(filaPulsada, 5);
            int numero = (int) jTable2.getValueAt(filaPulsada, 6);
            String colonia = (String) jTable2.getValueAt(filaPulsada, 7);
            String municipio = (String) jTable2.getValueAt(filaPulsada, 8);
            String estado = (String) jTable2.getValueAt(filaPulsada, 9);
            String telefono = (String) jTable2.getValueAt(filaPulsada, 10);
            String celular = (String) jTable2.getValueAt(filaPulsada, 11);
            String email = (String) jTable2.getValueAt(filaPulsada, 12);
            
            clienteActualiza.setId(id);
            clienteActualiza.setNombre(nombre);
            clienteActualiza.setaPaterno(aPaterno);
            clienteActualiza.setaMaterno(aMaterno);
            clienteActualiza.setCalle(calle);
            clienteActualiza.setNumero(numero);
            clienteActualiza.setColonia(colonia);
            clienteActualiza.setMunicipio(municipio);
            clienteActualiza.setEstado(estado);
            clienteActualiza.setTelefono(telefono);
            clienteActualiza.setCelular(celular);
            clienteActualiza.setEmail(email);
            clienteActualiza.setRFC(rfc);

            System.out.println(clienteActualiza.regresaDatos());
 
            //cliente = clienteActualiza;
           // clienteActualiza= (Cliente) cliente.clone();
           // System.out.println(clienteActualiza.regresaDatos());
           // c.selectCliente(cliente);

            vistaDatosClienteActualiza datosCliente = new vistaDatosClienteActualiza(clienteActualiza);
            interfaceMenu.vistaPrincipal.add(datosCliente);
            Dimension dim = interfaceMenu.vistaPrincipal.getSize();
            Dimension dimForm = datosCliente.getSize();
            datosCliente.setLocation((dim.width - dimForm.width) / 2, (dim.height - dimForm.height) / 2);
            datosCliente.toFront();
            datosCliente.setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    
    public void cargarTabla() {
        Vector<Object> fila;
        List<Cliente> clientes = c.listCliente();

        /*String data[] ={
            "Id", "RFC", "Nombre", "Apellido Paterno", "Apellido Materno", "Calle", "Numero", "Colonia", "Municipio", "Estado", "Numero de Telefono", "Numero de Celular", "Email"
        };
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(data);
        Vector datos = new Vector();
        for(int i=0;i<clientes.size();i++){
            datos.add(clientes.get(i).getId());
            datos.add(clientes.get(i).getRFC());
            datos.add(clientes.get(i).getNombre());
            datos.add(clientes.get(i).getaPaterno());
            datos.add(clientes.get(i).getaMaterno());
            datos.add(clientes.get(i).getCalle());
            datos.add(clientes.get(i).getNumero());
            datos.add(clientes.get(i).getColonia());
            datos.add(clientes.get(i).getMunicipio());
            datos.add(clientes.get(i).getEstado());
            datos.add(clientes.get(i).getTelefono());
            datos.add(clientes.get(i).getCelular());
            datos.add(clientes.get(i).getEmail());
            modelo.addRow(datos);
        }
        jTable2.setModel(modelo);
         */
        int i = 0;
        for (Cliente client : clientes) {

            jTable2.setValueAt(client.getId(), i, 0);
            jTable2.setValueAt(client.getRFC(), i, 1);
            jTable2.setValueAt(client.getNombre(), i, 2);
            jTable2.setValueAt(client.getaPaterno(), i, 3);
            jTable2.setValueAt(client.getaMaterno(), i, 4);
            jTable2.setValueAt(client.getCalle(), i, 5);
            jTable2.setValueAt(client.getNumero(), i, 6);
            jTable2.setValueAt(client.getColonia(), i, 7);
            jTable2.setValueAt(client.getMunicipio(), i, 8);
            jTable2.setValueAt(client.getEstado(), i, 9);
            jTable2.setValueAt(client.getTelefono(), i, 10);
            jTable2.setValueAt(client.getCelular(), i, 11);
            jTable2.setValueAt(client.getEmail(), i, 12);

            i++;
        }

    }

    public Cliente getClienteActualiza() {
        return clienteActualiza;
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

}
