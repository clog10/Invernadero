 
package Modelo;

import Vista.interfaceDatos;
import Vista.interfaceLogin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.postgresql.util.PSQLException;

/**
 * Invernadero Gran Valle
 * @author Clog_10
 * Metodos los cuales contienen las consultas realizadas para la funcionalidad del proyecto.
 * @param insertProducto: Metodo que inserta productos en la base de datos.
 * @param deleteProducto: Metodo que nos permite eliminar un producto.
 * @param listProducto2: Metodo que regresa valores de la BD a un JTable.
 * @param  actualizardatos: Metodo que actualiza los datos de la tabla.
 */
 
public class ProductoDB {
     private Vista.vistaProductos vista;
     //public Conectiondb conectiondb;
     public ProductoDB(){
         this.vista = vista;
     }
     //Metodo para agregar prodcutos a la base de datos.
     /**
      * Metodo para agregar prodcutos a la base de datos.
      */
     public boolean insertProducto(Producto p) {
        PreparedStatement ps;
        String sqlInsertCliente = "insert into invernadero_gran_valle.cosecha values (?,?,?,?,?);";
        try {
            ps = interfaceLogin.conectiondb.getConexion().prepareStatement(sqlInsertCliente);
            ps.setInt(1, p.getId());
            ps.setString(2, p.getNombre());
            ps.setString(3, p.getUnidad());
            ps.setDouble(4, p.getPrecio());
            ps.setInt(5, p.getCantidad());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Producto añadido");
            return true;
        } catch (SQLException exception) {
            System.err.println("Error en al añadir (Cliente) " + exception);
            return false;
        }
    }
        //Metodo para el borrado de productos.
     /**
      * Metodo para el borrado de productos.
      */
        public boolean deleteProducto(int id) {
        PreparedStatement ps;
        String sqlDeleteProducto = "delete from invernadero_gran_valle.cosecha where id_cosecha = ?;";

        try {
            ps = interfaceLogin.conectiondb.getConexion().prepareStatement(sqlDeleteProducto);
            ps.setInt(1, id);

            ps.executeUpdate();
            return true;
        } catch (SQLException exception) {
            System.err.println("Error al borrar (Producto)" + exception);
            return false;
        }
    }
    //Metodo para regresar valores a una tabla de producto.
        /**
         * Metodo para regresar valores a una tabla de producto.
         */
    public List<Producto> listProducto() {
        PreparedStatement ps;
        ResultSet rs;
        String consultaSQL = "Select id_cosecha, nombre,unidad_medida,precio_u,cantidad from invernadero_gran_valle.cosecha;";

        List<Producto> pro = new ArrayList<Producto>();
        try {
            ps = interfaceLogin.conectiondb.getConexion().prepareStatement(consultaSQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto c = new Producto();
                c.setId(rs.getInt("id_cosecha"));
                c.setNombre(rs.getString("nombre"));
                c.setUnidad(rs.getString("unidad_medida"));
                c.setPrecio(rs.getInt("precio_u"));
                c.setCantidad(rs.getInt("cantidad"));
                pro.add(c);
                for (Producto q : pro) {
                    System.out.println(q.toString());
                }
            }
        } catch (SQLException exception) {
            System.err.println("Error al CARGAR DATOS (Producto) " + exception);
            pro = Collections.emptyList();
        }
        Collections.sort(pro);
        return pro;
    }
    
    //Metodo para regresar valores a una tabla de producto.
    /**
     * Metodo para regresar valores a una tabla de producto.
     */
     public DefaultTableModel listProducto2() {
         String[] titulos={"ID","Nombre","Unidad de Medida","Precio Unitario","Cantidad"};
          DefaultTableModel mode= new DefaultTableModel(null,titulos);
         String[] registros = new String[5];
        PreparedStatement ps;
        ResultSet rs;
        String consultaSQL = "Select id_cosecha, nombre,unidad_medida,precio_u,cantidad from invernadero_gran_valle.cosecha;";

        //String consultaSQL = "select * from invernadero_gran_valle.cliente;";

        //List<Producto> pro = new ArrayList<Producto>();
        try {
            ps = interfaceLogin.conectiondb.getConexion().prepareStatement(consultaSQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                registros[0]=rs.getString("id_cosecha");
                registros[1]=rs.getString("nombre");
                registros[2]=rs.getString("unidad_medida");
                registros[3]=rs.getString("precio_u");
                registros[4]=rs.getString("cantidad");
                mode.addRow(registros);
            }
        } catch (SQLException exception) {
            System.err.println("Error al CARGAR DATOS (Producto) " + exception);
        }
        return mode;
    }
     //Metodo que actualiza los datos de los productos.
     /**
      * Metodo que actualiza los datos de los productos.
      */
      
     public boolean actualizardatos(Producto p){
         try{
             //Consulta para actulizar los datos
             PreparedStatement pstm= interfaceLogin.conectiondb.getConexion().prepareStatement("update invernadero_gran_valle.cosecha set nombre=?,unidad_medida=?,precio_u=?,cantidad=? where id_cosecha= ?");
             pstm.setString(1,p.getNombre());
             pstm.setString(2,p.getUnidad());
             pstm.setDouble(3,p.getPrecio());
             pstm.setInt(4,p.getCantidad());
             pstm.setInt(5,p.getId());
             pstm.executeUpdate();
             return true;
         }catch(PSQLException e){
             System.out.println(e);
             return false;
         } catch (SQLException ex) {
             Logger.getLogger(ProductoDB.class.getName()).log(Level.SEVERE, null, ex);
             return false;
         }

     }
            
}//fin de la clase.



