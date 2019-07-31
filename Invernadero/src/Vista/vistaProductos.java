/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Producto;
import Modelo.ProductoDB;
import java.awt.Color;
import java.awt.Dimension;
import java.beans.PropertyVetoException;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lenovo
 * Clase tipo vista de productos.
 * @param p: Instancia que nos permite acceder a las consultas.
 * @param producto: Instancia que nos permite acceder al modelo del producto.
 * @param modelo: Modelo para el uso del JTable.
 * @param datitos: Arreglo de Strings(cadenas) para editar el producto.
 */
public class vistaProductos extends javax.swing.JInternalFrame {
    //Se define una instancia de ProductoDB que contiene los metodos con las consultas.
    private ProductoDB p;
    //El modelo de la clase productos.
    private Producto producto;
    private DefaultTableModel modelo;
    //Arreglo de datos para la tabla de productos.
    String []datitos;
    /**
     * Creates new form productos
     */
    public vistaProductos() {
        initComponents();
        this.getContentPane().setBackground(Color.decode("#F0EFE8"));
        modelo=(DefaultTableModel)jTable2.getModel();       
        p= new ProductoDB();
       //Se actulizan los datos con cargarTabla2
        cargarTabla2();
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

        setBackground(new java.awt.Color(240, 239, 232));
        setTitle("PRODUCTOS");

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
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Unidad de Medida", "Precio Unitario", "Cantidad en Almacen"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setRowHeight(25);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable2);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/agregar.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/editar.png"))); // NOI18N
        jButton2.setToolTipText("");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/eliminar.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Metodo para el boton eliminar.
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //int filaPulsada = vistaLibro.getTabla().tabla.getSelectedRow();
        //int filaPulsada = jTable2.getSelectedRow();
        //System.out.println(filaPulsada);
        //if (filaPulsada >= 0) {
          //  producto = new Producto();
            //int id = (int) jTable2.getValueAt(filaPulsada, 0);
            //System.out.println(id);
            //producto.setId(id);           
            boolean resultado= p.deleteProducto(Integer.parseInt(datitos[0]));
            if(resultado)
                System.out.println("SE elimino");
            
            else System.out.println("No se elimino");
    //modelo.removeRow(filaPulsada);
            //JOptionPane.showMessageDialog(this, "Eliminado");        
        //}
        //this.setClosed(true);
        //System.out.println("Entre");
        interfaceMenu.pro.cargarTabla2();       
    }//GEN-LAST:event_jButton3ActionPerformed
    //Metodo del boton registar, que nos permite abrir una nueva vista.
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        vistaDatosProductos vista= new vistaDatosProductos();
        //vistaDatosCliente datosCliente  = new vistaDatosCliente();
        interfaceMenu.vistaPrincipal.add(vista);
        Dimension dim = interfaceMenu.vistaPrincipal.getSize();
        Dimension dimForm = vista.getSize();
        vista.setLocation((dim.width-dimForm.width)/2, (dim.height-dimForm.height)/2);
        vista.toFront();
        vista.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    //Metodo para el boton editar, que nos permite editar los productos.
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        vistaDatosProductosEditar editar= new vistaDatosProductosEditar();
        interfaceMenu.vistaPrincipal.add(editar);
        
        editar.setjTextField1(datitos[0]);
        editar.setjTextField2(datitos[1]);
        editar.setjComboBox1(datitos[2]);
        editar.setjTextField3(datitos[3]);
        editar.setjTextField4(datitos[4]);
        editar.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
    //Evento de la tabla productos, que nos permite hacer click y recibir los datos de un fila
    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        int numero= jTable2.getSelectedRow();
        datitos= new String[modelo.getColumnCount()];
        for(int i=0;i<datitos.length;i++){
            datitos[i]= (String) jTable2.getValueAt(numero, i);
            System.out.println(datitos[i]);
        }
    }//GEN-LAST:event_jTable2MouseClicked
      /*public void cargarTabla() {
        Vector<Object> fila;
        List<Producto> produc = p.listProducto();     
        
        int i=0;
        modelo.setColumnCount(0);
        for (Producto pro : produc) {
            String [] dato= {String.valueOf(pro.getId()),pro.getNombre(),pro.getUnidad(),String.valueOf(pro.getPrecio()),String.valueOf(pro.getCantidad())};
            modelo.addRow(dato);
            System.out.println("El numero es:"+i);
            modelo.setValueAt(pro.getNombre(), i, 1);
            modelo.setValueAt(pro.getUnidad(),i,2);
            modelo.setValueAt(pro.getPrecio(), i,3);
            modelo.setValueAt(pro.getCantidad(), i, 4);
            
            i++;
            modelo.fireTableDataChanged();
        }
    }*/
    //Metodo para regresar valores de la tabla.
    public void cargarTabla2(){
     jTable2.setModel(p.listProducto2());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
