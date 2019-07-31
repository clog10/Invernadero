
package Modelo;

import Vista.interfaceDatos;
import Vista.interfaceLogin;
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
 * Clase para conectr con nuestra base de datos
 * @param vista que es una referencia a la clase vistaVehiculos porque ahi llamaremos 
 *              los metodos contenidos aqui
 */
public class VehiculoDB {
    
    private Vista.vistaVehiculos vista;
    
    public VehiculoDB(){
            this.vista = vista;
    }
    
    
    /**
     * metodo insert para insertar vehiculos en nuestra base de datos
     * @return   un boleano para indicar que el vehiculo fue agregado
     */
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
     
     /**
     * 
     * metodo update para actualizar vehiculos
     * @return  un boleano para indicar que fue actualizado
     */
      public boolean updateVehiculo(Vehiculo c) {
        PreparedStatement ps;
        try {
            ps = interfaceLogin.conectiondb.getConexion().prepareStatement("update invernadero_gran_valle.vehiculo set marca=?,"
                                                                     + "modelo=?, numero_serie=?, anio=? where matricula=?");
            
            ps.setString(1, c.getMarca());
            ps.setString(2, c.getModelo());
            ps.setInt(3, c.getNumSerie());
            ps.setInt(4, c.getAnio());
            ps.setString(5, c.getMatricula());

            ps.executeUpdate();
            //System.out.println("Actualizado");
            return true;
        } catch (SQLException exception) {
            System.err.println("Error en al Actualizar (Vehiculo) " + exception);
            return false;
        }
    }
      
     /**
     * 
     * metodo delete para eliminar un vehiculo de la base de datos
     * @return  un boleano para indicar cuando se elimina el vehiculo
     */
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
     
     /**
     * metodo list que obtendra los vehiculos contenidos en la base de datos
     * @return una lista con los vehiculos obtenidos de la base de dstos
     */
     public List<Vehiculo> listVehiculo() {
        PreparedStatement ps;
        ResultSet rs;
        String consultaSQL = "Select matricula,marca,modelo,numero_serie,anio from invernadero_gran_valle.vehiculo;";

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
            }
        } catch (SQLException exception) {
            System.err.println("Error al CARGAR DATOS (Vehiculos) " + exception);
            vehiculos = Collections.emptyList();
        }
        Collections.sort(vehiculos);
        return vehiculos;
    }
    
}

