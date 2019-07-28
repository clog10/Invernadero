
package Modelo;

import Vista.interfaceLogin;
import Vista.vistaVenta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.postgresql.util.PSQLException;

/**
 * Invernadero Gran Valle
 * @author Clog_10
 */
public class VentaDB {
     private vistaVenta venta;
    public VentaDB(){
        this.venta = venta;
    }
     /**public boolean buscarid(int id){
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
         }*/
    
    
}






