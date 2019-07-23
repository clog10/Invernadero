package Modelo;

import Vista.interfaceDatos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Invernadero Gran Valle
 *
 * @author Clog_10
 */
public class ClienteDB {

    // private Conectiondb conectiondb;
    //private String db = "Invernadero";
    private Vista.vistaCliente vista;
    //public List<Cliente> clientes;

    // private static ClienteDB c;
    public ClienteDB() { 
        // conectiondb = new Conectiondb(db, "127.0.0.1");
        this.vista = vista; 
    } 

    public boolean insertCliente(Cliente c) {
        PreparedStatement ps;
        String sqlInsertCliente = "insert into invernadero_gran_valle.cliente values (?,?,?,?,?,?,?,?,?,?,?,?,?);";
        try {
            ps = interfaceDatos.conectiondb.getConexion().prepareStatement(sqlInsertCliente);
            ps.setInt(1, c.getId());
            ps.setString(2, c.getNombre());
            ps.setString(3, c.getaPaterno());
            ps.setString(4, c.getaMaterno());
            ps.setString(5, c.getCalle());
            ps.setInt(6, c.getNumero());
            ps.setString(7, c.getColonia());
            ps.setString(8, c.getMunicipio());
            ps.setString(9, c.getEstado());
            ps.setString(10, c.getTelefono());
            ps.setString(11, c.getCelular());
            ps.setString(12, c.getEmail());
            ps.setString(13, c.getRFC());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente añadido");
            return true;
        } catch (SQLException exception) {
            System.err.println("Error en al añadir (Cliente) " + exception);
            return false;
        }
    }

    public boolean deleteCliente(Cliente c) {
        PreparedStatement ps;
        String sqlDeleteCliente = "delete from invernadero_gran_valle.cliente where id_cliente  = ?;";

        try {
            ps = interfaceDatos.conectiondb.getConexion().prepareStatement(sqlDeleteCliente);
            ps.setInt(1, c.getId());

            ps.executeUpdate();
            return true;
        } catch (SQLException exception) {
            System.err.println("Error al borrar (Cliente)" + exception);
            return false;
        }
    }
    
    public boolean updateCliente(Cliente c) {

        PreparedStatement ps;
        String sqlUpdateCliente = "update invernadero_gran_valle.cliente set id_cliente = ?, nombre = ?, a_paterno = ?,"
                              + "a_materno = ?, calle = ?, numero = ?, colonia = ?, municipio = ?, estado = ?,"
                              + "telefono =?, celular = ?, e_mail = ?, rfc = ?  where id = ?;";
        try {

            ps =  interfaceDatos.conectiondb.getConexion().prepareStatement(sqlUpdateCliente);


            ps.setInt(1, c.getId());
            ps.setString(2, c.getNombre());
            ps.setString(3, c.getaPaterno());
            ps.setString(4, c.getaMaterno());
            ps.setString(5, c.getCalle());
            ps.setInt(6, c.getNumero());
            ps.setString(7, c.getColonia());
            ps.setString(8, c.getMunicipio());
            ps.setString(9, c.getEstado());
            ps.setString(10, c.getTelefono());
            ps.setString(11, c.getCelular());
            ps.setString(12, c.getEmail());
            ps.setString(13, c.getRFC());
            
            ps.executeUpdate();

            return true;
        } catch (SQLException exception) {
            System.err.println("Error al Actualizar (Cliente " + exception);
            return false;
        }
    }

    public Cliente selectCliente(Cliente c) {

        PreparedStatement ps;

        ResultSet rs;

        Cliente clienteEncontrado = null;

        String sqlConsulta = "select * from invernadero_gran_valle.cliente where id_cliente = ?;";
        try {

            ps = interfaceDatos.conectiondb.getConexion().prepareStatement(sqlConsulta);
            ps.setInt(1, c.getId());

            rs = ps.executeQuery();

            if (rs.next()) {
         /*       clienteEncontrado = new Cliente(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
                                    rs.getString(5), rs.getString(6),rs.getString(7),rs.getString(8),rs.getInt(9),
                                      rs.getString(10), rs.getString(11),rs.getString(12));*/
            }
        } catch (SQLException exception) {
            System.err.println("Error al CARGAR cliente");
        }
        return clienteEncontrado;
    }
    
    public List<Cliente> listCliente() {
        PreparedStatement ps;
        ResultSet rs;
        String consultaSQL = "Select id_cliente, nombre,a_paterno,a_materno,calle,numero,colonia,municipio,"
                              + "estado,telefono,celular,e_mail,rfc from invernadero_gran_valle.cliente;";

        //String consultaSQL = "select * from invernadero_gran_valle.cliente;";

        List<Cliente> clientes = new ArrayList<Cliente>();
        try {
            ps = interfaceDatos.conectiondb.getConexion().prepareStatement(consultaSQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId(rs.getInt("id_cliente"));
                c.setNombre(rs.getString("nombre"));
                c.setaPaterno(rs.getString("a_paterno"));
                c.setaMaterno(rs.getString("a_materno"));
                c.setCalle(rs.getString("calle"));
                c.setNumero(rs.getInt("numero"));
                c.setColonia(rs.getString("colonia"));
                c.setMunicipio(rs.getString("municipio"));
                c.setEstado(rs.getString("estado"));
                c.setTelefono(rs.getString("telefono"));
                c.setCelular(rs.getString("celular"));
                c.setEmail(rs.getString("e_mail"));
                c.setRFC(rs.getString("rfc"));

                clientes.add(c);

              /*  for (Cliente q : clientes) {
                    System.out.println(q.regresaDatos());
                }*/
            }
        } catch (SQLException exception) {
            System.err.println("Error al CARGAR DATOS (Cliente) " + exception);
        }
        return clientes;
    }
}














