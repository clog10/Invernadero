
package Modelo;

import Vista.interfaceLogin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import org.postgresql.util.PSQLException;

/**
 * Invernadero Gran Valle
 * @author Clog_10
 */

public class VentaDB {
     private Vista.vistaProductos vista;
    public VentaDB(){
        this.vista = vista;
    }
     public boolean buscarid(int id){
             try{
             PreparedStatement pstmid=interfaceLogin.conectiondb.getConexion().prepareStatement("select id_cosecha from invernadero_gran_valle.cosecha where id_cosecha = ? ");
             return true;
             }catch(PSQLException ex){
                 System.out.println(ex);
             return false;
             }catch (SQLException ex) {
             Logger.getLogger(ProductoDB.class.getName()).log(Level.SEVERE, null, ex);
             return false;
         }
         }
     /**
      * 
       
      */
     public String[] mostrarListaProductoNombre(){
            try{
                String[] nombresProductos;
                //El AS es solo un alias de la tabla
             PreparedStatement pstmmostrarproducto=interfaceLogin.conectiondb.getConexion().prepareStatement("select count(*)AS cantidadproductos  from invernadero_gran_valle.cosecha");
            ResultSet rscantidad = pstmmostrarproducto.executeQuery();
            int cantidad = 0;
            while(rscantidad.next()){
                cantidad = rscantidad.getInt("cantidadproductos");
            }
            PreparedStatement pstnombrepro=interfaceLogin.conectiondb.getConexion().prepareStatement("select nombre from invernadero_gran_valle.cosecha");
            ResultSet rsnombres = pstnombrepro.executeQuery();
            int x=0;
            nombresProductos=new String[cantidad];
            
            while(rsnombres.next() && x<cantidad){
                 nombresProductos[x]= rsnombres.getString("nombre");
                    x++;
            }
            return nombresProductos;
            }catch(PSQLException ex){
                System.out.println(ex);
                return null;
            } catch (SQLException ex) {
             Logger.getLogger(VentaDB.class.getName()).log(Level.SEVERE, null, ex);
             return null;
            }
     }
     
     public String[] mostrarListaClienteNombre(){
            try{
                String[] nombresCliente;
                //El AS es solo un alias de la tabla
             PreparedStatement pstmmostrarproducto=interfaceLogin.conectiondb.getConexion().prepareStatement("select count(*)AS cantidadcliente  from invernadero_gran_valle.cliente");
            ResultSet rscantidad = pstmmostrarproducto.executeQuery();
            int cantidad = 0;
            while(rscantidad.next()){
                cantidad = rscantidad.getInt("cantidadcliente");
            }
            PreparedStatement pstnombrepro=interfaceLogin.conectiondb.getConexion().prepareStatement("select nombre from invernadero_gran_valle.cliente");
            ResultSet rsnombres = pstnombrepro.executeQuery();
            int x=0;
            nombresCliente=new String[cantidad];
            
            while(rsnombres.next() && x<cantidad){
                 nombresCliente[x]= rsnombres.getString("nombre");
                    x++;
            }
            return nombresCliente;
            }catch(PSQLException ex){
                System.out.println(ex);
                return null;
            } catch (SQLException ex) {
             Logger.getLogger(VentaDB.class.getName()).log(Level.SEVERE, null, ex);
             return null;
            }
     }
     
     public String[] DatosProducto(String dato){
            try{
                String[] datos;
                
            PreparedStatement pstnombrepro=interfaceLogin.conectiondb.getConexion().prepareStatement("select nombre,unidad_medida,precio_u from invernadero_gran_valle.cosecha where nombre=?");
            pstnombrepro.setString(1, dato);
            ResultSet rsnombres = pstnombrepro.executeQuery();
           
            datos= new String[3];
            while(rsnombres.next() ){
                 datos[0]= rsnombres.getString("unidad_medida");
                 datos[1]= rsnombres.getString("nombre");
                 datos[2]= rsnombres.getString("precio_u");
                    
            }
            return datos;
            }catch(PSQLException ex){
                System.out.println(ex);
                return null;
            } catch (SQLException ex) {
             Logger.getLogger(VentaDB.class.getName()).log(Level.SEVERE, null, ex);
             return null;
            }
     }
     public String[] DatosCliente(String dato){
            try{
                String[] datos;
                
            PreparedStatement pstnombrepro=interfaceLogin.conectiondb.getConexion().prepareStatement("select nombre from invernadero_gran_valle.cliente where nombre=?");
            pstnombrepro.setString(1, dato);
            ResultSet rsnombres = pstnombrepro.executeQuery();
           
            datos= new String[1];
            while(rsnombres.next() ){
                 datos[0]= rsnombres.getString("nombre");
                    //System.out.println(datos[0]);
            }
            return datos;
            }catch(PSQLException ex){
                System.out.println(ex);
                return null;
            } catch (SQLException ex) {
             Logger.getLogger(VentaDB.class.getName()).log(Level.SEVERE, null, ex);
             return null;
            }
     }
     
      public DefaultTableModel listVenta2() {
         String[] titulos={"Cantidad","Unidad","Nombre Producto","Precio Unitario","Total","Nombre Cliente"};
          DefaultTableModel mode= new DefaultTableModel(null,titulos);
         String[] registros = new String[6];
        PreparedStatement ps;
        ResultSet rs;
        String consultaSQL = "Select folvio_v, nombre,unidad_medida,precio_u,cantidad from invernadero_gran_valle.cosecha;";

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
     
}




