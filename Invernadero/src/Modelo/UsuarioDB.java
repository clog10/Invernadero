
package Modelo;

import Vista.interfaceLogin;
import Vista.vistaUsuario;
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
 * Clase UsuarioDB que contiene metodos para conectar con nuestra base de datos
 * @param vista que conecta con nuestra vistaUsuario porque ahi ejecutaremos 
 *              los metodos que contiene
 */
public class UsuarioDB {
    
    private vistaUsuario vista;

    public UsuarioDB() {
        this.vista = vista;
        
    }
    
    /**
     * metodo insert para insertar Usuarios en nuestra base de datos
     * @return   un boleano para indicar que el usuario fue agregado
     */
     public boolean insertUsuario(Usuario c) {
        PreparedStatement ps;
        String sqlInsertVehiculo = "insert into invernadero_gran_valle.usuario values (?,?,?);";
        try {
            ps = interfaceLogin.conectiondb.getConexion().prepareStatement(sqlInsertVehiculo);
            ps.setString(1, c.getUser());
            ps.setString(2, c.getPassword());
            ps.setInt(3, c.getId_empleado());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario añadido");
            return true;
        } catch (SQLException exception) {
            System.err.println("Error en al añadir (Usuario) " + exception);
            return false;
        }
    }
     
        /**
     * 
     * metodo delete para eliminar un usuario de la base de datos
     * @return  un boleano para indicar cuando se elimina el usuario
     */
     public boolean deleteUsuario(Usuario c) {
        PreparedStatement ps;
        String sqlDeleteUsuario = "delete from invernadero_gran_valle.usuario where usuario = ?;";

        try {
            ps = interfaceLogin.conectiondb.getConexion().prepareStatement(sqlDeleteUsuario);
            ps.setString(1, c.getUser());

            ps.executeUpdate();
            return true;
        } catch (SQLException exception) {
            System.err.println("Error al eliminar (Usuario)" + exception);
            return false;
        }
    }
     
        /**
     * metodo list que obtendra los empleados contenidos en la base de datos
     * @return una lista con los empleados obtenidos de la base de dstos
     */
     public List<Empleado> listEmpleado() {
        PreparedStatement ps;
        ResultSet rs;
        String consultaSQL = "Select id_empleado, nombre,a_paterno,a_materno,calle,numero,colonia,municipio,"
                              + "estado,telefono from invernadero_gran_valle.empleado;";
        //String consultaSQL = "select * from invernadero_gran_valle.empleado;";
        List<Empleado> empleado = new ArrayList<Empleado>();
        try {
            ps = interfaceLogin.conectiondb.getConexion().prepareStatement(consultaSQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Empleado e = new Empleado();
                
                e.setId(rs.getInt("id_empleado"));
                e.setNombre(rs.getString("nombre"));
                e.setaPaterno(rs.getString("a_paterno"));
                e.setaMaterno(rs.getString("a_materno"));
                e.setCalle(rs.getString("calle"));
                e.setNumero(rs.getInt("numero"));
                e.setColonia(rs.getString("colonia"));
                e.setMunicipio(rs.getString("municipio"));
                e.setEstado(rs.getString("estado"));
                e.setNumTel(rs.getString("telefono"));

                empleado.add(e);

            }
        } catch (SQLException exception) {
            System.err.println("Error al CARGAR DATOS (Empleado) " + exception);
            empleado = Collections.emptyList();
        }
        Collections.sort(empleado);
        return empleado;
    }
     
         /**
     * metodo list que obtendra los usuarios contenidos en la base de datos
     * @return una lista con los usuarios obtenidos de la base de dstos
     */
      public List<Usuario> listUsuario() {
        PreparedStatement ps;
        ResultSet rs;
        String consultaSQL = "Select usuario,contraseña,id_empleado from invernadero_gran_valle.usuario;";

        List<Usuario> usuarios= new ArrayList<Usuario>();
        try {
            ps = interfaceLogin.conectiondb.getConexion().prepareStatement(consultaSQL);
            rs = ps.executeQuery();
            while (rs.next()) {
               Usuario c = new Usuario();
                c.setId_empleado(rs.getInt("id_empleado"));
                c.setUser(rs.getString("usuario"));
                c.setPassword(rs.getString("contraseña"));

                usuarios.add(c); 
            }
        } catch (SQLException exception) {
            System.err.println("Error al CARGAR DATOS (Vehiculos) " + exception);
            usuarios = Collections.emptyList();
        }
        Collections.sort(usuarios);
        return usuarios;
    }
      
      
}














