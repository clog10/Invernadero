
package Modelo;

import Vista.interfaceLogin;
import Vista.vistaUsuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Invernadero Gran Valle
 * @author Clog_10
 */
public class UsuarioDB {
    
    private vistaUsuario vista;

    public UsuarioDB() {
        this.vista = vista;
    }
    
     public boolean insertUsuario(Usuario c) {
        PreparedStatement ps;
        String sqlInsertVehiculo = "insert into invernadero_gran_valle.usuario values (?,?,?);";
        try {
            ps = interfaceLogin.conectiondb.getConexion().prepareStatement(sqlInsertVehiculo);
            ps.setString(1, c.getUser());
            ps.setString(2, c.getPassword());
            ps.setInt(3, c.getId_empleado());


            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Vehiculo añadido");
            return true;
        } catch (SQLException exception) {
            System.err.println("Error en al añadir (Vehiculo) " + exception);
            return false;
        }
    }
    
    
    
}






