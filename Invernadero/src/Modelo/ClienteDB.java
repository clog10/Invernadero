package Modelo;

import Vista.interfaceDatos;
import Vista.interfaceLogin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.postgresql.util.PSQLException;

/**
 * Invernadero Gran Valle
 * @author Clog_10
 * 
 * Clase Cliente DB para crear consultas con nuestra base de datos
 * @param vista: para conectar con nuestra vistaCliente porque ahi mandaremos a llamar los metodos contenidos aqui
 *  
 */
public class ClienteDB {

    private Vista.vistaCliente vista;
    /***
     * Constructor 
     */
    
    public ClienteDB() { 
        this.vista = vista; 
    } 

    
    /**
     * metodo insert para insertar clientes en nuestra base de datos
     * @param Cliente: contiene los datos del cliente 
     * @return   un boleano para indicar que el cliente fue agregado
     */
    public boolean insertCliente(Cliente c) {
        PreparedStatement ps;
        String sqlInsertCliente = "insert into invernadero_gran_valle.cliente values (?,?,?,?,?,?,?,?,?,?,?,?,?);";
        try {
            ps = interfaceLogin.conectiondb.getConexion().prepareStatement(sqlInsertCliente);
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
    
    /**
     * 
     * metodo delete para eliminar un cliente de la base de datos
     * @return  un boleano para indicar cuando se elimina el cliente
     */
    public boolean deleteCliente(Cliente c) {
        PreparedStatement ps;
        String sqlDeleteCliente = "delete from invernadero_gran_valle.cliente where id_cliente  = ?;";

        try {
            ps = interfaceLogin.conectiondb.getConexion().prepareStatement(sqlDeleteCliente);
            ps.setInt(1, c.getId());

            ps.executeUpdate();
            return true;
        } catch (SQLException exception) {
            System.err.println("Error al borrar (Cliente)" + exception);
            return false;
        }
    }
    
    /**
     * 
     * metodo update para actualizar clientes
     * @return  un boleano para indicar que fue actualizado
     */
    
    public boolean updateCliente(Cliente c) {

        PreparedStatement ps;
        try {
            ps =  interfaceLogin.conectiondb.getConexion().prepareStatement( "update invernadero_gran_valle.cliente set nombre=?, a_paterno=?,"
                              + "a_materno=?, calle=?, numero=?, colonia=?, municipio=?, estado=?,"
                              + "telefono=?, celular=?, e_mail=?, rfc=?  where id_cliente=?");

            ps.setString(1, c.getNombre());
            ps.setString(2, c.getaPaterno());
            ps.setString(3, c.getaMaterno());
            ps.setString(4, c.getCalle());
            ps.setInt(5, c.getNumero());
            ps.setString(6, c.getColonia());
            ps.setString(7, c.getMunicipio());
            ps.setString(8, c.getEstado());
            ps.setString(9, c.getTelefono());
            ps.setString(10, c.getCelular());
            ps.setString(11, c.getEmail());
            ps.setString(12, c.getRFC());
            ps.setInt(13, c.getId());
            
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

            ps = interfaceLogin.conectiondb.getConexion().prepareStatement(sqlConsulta);
            ps.setInt(1, c.getId());

            rs = ps.executeQuery();

            if (rs.next()) {
            }
        } catch (SQLException exception) {
            System.err.println("Error al CARGAR cliente");
        }
        return clienteEncontrado;
    }
    
    /**
     * metodo list que obtendra los clientes contenidos en la base de datos
     * @return una lista con los clientes obtenidos de la base de dstos
     */
    public List<Cliente> listCliente() {
        PreparedStatement ps;
        ResultSet rs;
        String consultaSQL = "Select id_cliente, nombre,a_paterno,a_materno,calle,numero,colonia,municipio,"
                              + "estado,telefono,celular,e_mail,rfc from invernadero_gran_valle.cliente;";

        List<Cliente> clientes = new ArrayList<Cliente>();
        try {
            ps = interfaceLogin.conectiondb.getConexion().prepareStatement(consultaSQL);
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
            }
        } catch (SQLException exception) {
            System.err.println("Error al CARGAR DATOS (Cliente) " + exception);
            clientes = Collections.emptyList();
        }
        Collections.sort(clientes);
        return clientes;
    }
    
}















