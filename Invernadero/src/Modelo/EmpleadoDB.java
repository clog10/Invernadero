
package Modelo;


import Vista.interfaceDatos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class EmpleadoDB {
    
    private Vista.vistaEmpleado vista;
    public EmpleadoDB() {
        this.vista = vista;
    }

    public boolean insertEmpleado(Empleado e) {
        PreparedStatement ps;
        String sqlInsertEmpleado = "insert into invernadero_gran_valle.empleado values (?,?,?,?,?,?,?,?,?,?);";
        try {
            ps = interfaceDatos.conectiondb.getConexion().prepareStatement(sqlInsertEmpleado);
            ps.setInt(1, e.getId());
            ps.setString(3, e.getNombre());
            ps.setString(4, e.getaPaterno());
            ps.setString(5, e.getaMaterno());
            ps.setString(6, e.getNumTel());
            ps.setString(7, e.getCalle());
            ps.setString(8, e.getColonia());
            ps.setString(9, e.getMunicipio());
            ps.setString(10, e.getEstado());
            ps.setInt(11, e.getNumero());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Empleado añadido");
            return true;
        } catch (SQLException exception) {
            System.err.println("Error en al añadir (Empleado) " + exception);
            return false;
        }
    }

    public boolean deleteEmpleado(Empleado e) {
        PreparedStatement ps;
        String sqlDeleteEmpleado = "delete from invernadero_gran_valle.empleado where id_empleado  = ?;";

        try {
            ps = interfaceDatos.conectiondb.getConexion().prepareStatement(sqlDeleteEmpleado);
            ps.setInt(1, e.getId());

            ps.executeUpdate();
            return true;
        } catch (SQLException exception) {
            System.err.println("Error al borrar (Empleado)" + exception);
            return false;
        }
    }

    public List<Empleado> listEmpleado() {
        PreparedStatement ps;
        ResultSet rs;
        //String consultaSQL = "Select id_cliente, nombre,a_paterno,a_materno,calle,numero,colonia,municipio,"
        //                      + "estado,telefono,celular,e_mail,rfc from invernadero_gran_valle.cliente;";

        String consultaSQL = "select * from invernadero_gran_valle.empleado;";

        List<Empleado> empleado = new ArrayList<Empleado>();
        //System.out.println("Hola");
        try {
            ps = interfaceDatos.conectiondb.getConexion().prepareStatement(consultaSQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Empleado e = new Empleado();
                
                e.setId(rs.getInt("id_cliente"));
                e.setNombre(rs.getString("nombre"));
                e.setaPaterno(rs.getString("a_paterno"));
                e.setaMaterno(rs.getString("a_materno"));
                e.setCalle(rs.getString("calle"));
                e.setNumero(rs.getInt("numero"));
                e.setColonia(rs.getString("colonia"));
                e.setMunicipio(rs.getString("municipio"));
                e.setEstado(rs.getString("estado"));
                e.setNumero(rs.getInt("Numero"));

                empleado.add(e);

                for (Empleado t : empleado) {
                    System.out.println(t.regresaDatos());
                }
            }
        } catch (SQLException exception) {
            System.err.println("Error al CARGAR DATOS (Empleado) " + exception);
        }
        return empleado;
    }
    
}
