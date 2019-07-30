
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
    
     public boolean insertVehiculo(Vehiculo c) {
        PreparedStatement ps;
        String sqlInsertVehiculo = "insert into invernadero_gran_valle.vehiculo values (?,?,?,?,?);";
        try {
            ps = interfaceLogin.conectiondb.getConexion().prepareStatement(sqlInsertVehiculo);
            ps.setString(1, c.getMatricula());
            ps.setString(2, c.getMarca());
            ps.setString(3, c.getModelo());
            ps.setInt(4, c.getNumSerie());
            ps.setInt(5, c.getAnio());


            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Vehiculo añadido");
            return true;
        } catch (SQLException exception) {
            System.err.println("Error en al añadir (Vehiculo) " + exception);
            return false;
        }
    }
    
    
    
}





