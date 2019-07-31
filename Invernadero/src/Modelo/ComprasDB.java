
package Modelo;

import Vista.interfaceLogin;
import Vista.vistaCompraHerramienta;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Invernadero Gran Valle
 * @author Clog_10
 * 
 * Clase que nos servirá para conectar con nuestra base de datos y manupular la
 * tabla compras que nos ayudará para llevar un control de gastos
 * 
 * @param vitsa: referencia de vistaCompraHerramienta porque ahi mandaremos llamar los metodos 
 *               que se contienen aqui
 */
public class ComprasDB {
    
    private vistaCompraHerramienta vista;
    
    //Constructor 
    public ComprasDB(){
        this.vista=vista;
    }
    
    /**
     * metodo insert para insertar compras en nuestra base de datos
     * @return   un boleano para indicar que la compra fue agregado
     */
     public boolean insertCompra(Compras c) {
        PreparedStatement ps;
        String sqlInsertCompra = "insert into invernadero_gran_valle.compras values (?,?,?);";
        try {
            ps = interfaceLogin.conectiondb.getConexion().prepareStatement(sqlInsertCompra);
            ps.setString(1, c.getFecha());
            ps.setString(2, c.getProductos());
            ps.setDouble(3, c.getTotal());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Compra añadida");
            return true;
        } catch (SQLException exception) {
            System.err.println("Error en al añadir (Compra) " + exception);
            return false;
        }
    }
     
     /**
     * metodo list que obtendra las compras contenidas en la base de datos
     * @return una lista con las compras obtenidas de la base de dstos
     */
     public List<Compras> listCompras() {
        PreparedStatement ps;
        ResultSet rs;
        String consultaSQL = "Select fecha,productos,total from invernadero_gran_valle.compras;";

        List<Compras> compras = new ArrayList<Compras>();
        try {
            ps = interfaceLogin.conectiondb.getConexion().prepareStatement(consultaSQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Compras c = new Compras();
                c.setFecha(rs.getString("fecha"));
                c.setProductos(rs.getString("productos"));
                c.setTotal(rs.getDouble("total"));
                
                compras.add(c); 
            }
        } catch (SQLException exception) {
            System.err.println("Error al CARGAR DATOS (Compras) " + exception);
        }
        return compras;
    }
    
}

















