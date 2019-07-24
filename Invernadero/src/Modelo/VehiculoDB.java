
package Modelo;

import Vista.interfaceDatos;
import Vista.interfaceLogin;
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
public class VehiculoDB {
    
    private Vista.vistaVehiculos vista;
    
    public VehiculoDB(){
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
     
      public boolean insertVehiculoActualiza(Vehiculo c) {
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
            JOptionPane.showMessageDialog(null, "Vehiculo Actualizado");
            return true;
        } catch (SQLException exception) {
            System.err.println("Error en al Actualizar (Vehiculo) " + exception);
            return false;
        }
    }
     
     public boolean deleteVehiculo(Vehiculo c) {
        PreparedStatement ps;
        String sqlDeleteVehiculo = "delete from invernadero_gran_valle.vehiculo where matricula  = ?;";

        try {
            ps = interfaceLogin.conectiondb.getConexion().prepareStatement(sqlDeleteVehiculo);
            ps.setString(1, c.getMatricula());

            ps.executeUpdate();
            return true;
        } catch (SQLException exception) {
            System.err.println("Error al borrar (Vehiculo)" + exception);
            return false;
        }
    }
     
     public List<Vehiculo> listVehiculo() {
        PreparedStatement ps;
        ResultSet rs;
        String consultaSQL = "Select matricula, marca,modelo,numero_serie,anio;";

        List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        try {
            ps = interfaceLogin.conectiondb.getConexion().prepareStatement(consultaSQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Vehiculo c = new Vehiculo();
                c.setMatricula(rs.getString("matricula"));
                c.setMarca(rs.getString("marca"));
                c.setModelo(rs.getString("modelo"));
                c.setNumSerie(rs.getInt("numero_serie"));
                c.setAnio(rs.getInt("anio"));


                vehiculos.add(c); 

              for (Vehiculo q : vehiculos) {
                    System.out.println(q.toString());
                }
            }
        } catch (SQLException exception) {
            System.err.println("Error al CARGAR DATOS (Vehiculos) " + exception);
        }
        return vehiculos;
    }
    
}



















