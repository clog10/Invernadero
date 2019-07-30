
package Modelo;


import Vista.interfaceDatos;
import Vista.interfaceLogin;
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
            ps = interfaceLogin.conectiondb.getConexion().prepareStatement(sqlInsertEmpleado);
            ps.setInt(1, e.getId());
            ps.setString(2, e.getNombre());
            ps.setString(3, e.getaPaterno());
            ps.setString(4, e.getaMaterno());
            ps.setString(5, e.getCalle());
            ps.setInt(6, e.getNumero());
            ps.setString(7, e.getColonia());
            ps.setString(8, e.getMunicipio());
            ps.setString(9, e.getEstado());
            ps.setString(10,e.getNumTel());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Empleado añadido");
            return true;
        } catch (SQLException exception) {
            System.err.println("Error en al añadir (Empleado) " + exception);
            return false;
        }
    }
    
      public boolean updateEmpleado(Empleado e){
        PreparedStatement ps;
        try {
            ps = interfaceLogin.conectiondb.getConexion().prepareStatement("update invernadero_gran_valle.empleado set nombre=?, a_paterno=?,"
                              + "a_materno=?, calle=?, numero=?, colonia=?, municipio=?, estado=?,"
                              + "telefono=? where id_empleado=?");
           
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getaPaterno());
            ps.setString(3, e.getaMaterno());
            ps.setString(4, e.getCalle());
            ps.setInt(5, e.getNumero());
            ps.setString(6, e.getColonia());
            ps.setString(7, e.getMunicipio());
            ps.setString(8, e.getEstado());
            ps.setString(9,e.getNumTel());
            ps.setInt(10, e.getId());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Empleado Actualizado");
            return true;
        } catch (SQLException exception) {
            System.err.println("Error en al Actualizar (Empleado) " + exception);
            return false;
        }
    }

    public boolean deleteEmpleado(Empleado e) {
        PreparedStatement ps;
        String sqlDeleteEmpleado = "delete from invernadero_gran_valle.empleado where id_empleado  = ?;";

        try {
            ps = interfaceLogin.conectiondb.getConexion().prepareStatement(sqlDeleteEmpleado);
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
            ps = interfaceLogin.conectiondb.getConexion().prepareStatement(consultaSQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Empleado e = new Empleado();
                
                e.setId(rs.getInt("id_empleado"));
                e.setNombre(rs.getString("nombre"));
                e.setaPaterno(rs.getString("a_paterno"));
                e.setaMaterno(rs.getString("a_materno"));
                e.setNumTel(rs.getString("telefono"));
                e.setCalle(rs.getString("calle"));
                e.setNumero(rs.getInt("numero"));
                e.setColonia(rs.getString("colonia"));
                e.setMunicipio(rs.getString("municipio"));
                e.setEstado(rs.getString("estado"));
                e.setNumTel(rs.getString("telefono"));

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










