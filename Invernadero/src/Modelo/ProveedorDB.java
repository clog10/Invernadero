
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
 * Clase ProveedorDB que contiene las consultas
 * @param insertProveedor: Metodo que agrega o inserta un proveedor en la Base de Datos.
 * @param updateProveedor: Metodo que actualiza los datos del proveedor en la Base de Datos.
 * @param deleteProveedor: Metodo que elimina un proveedor de la Base de Datos.
 * @param listProveedor: Metodo que regresa los datos del proveedor. 
 * @
 */
public class ProveedorDB {
    
    
    private Vista.vistaProveedor vista;
//public List<Proveedor> clientes;

// private static ProveedorDB c;
public ProveedorDB() {
    // conectiondb = new Conectiondb(db, "127.0.0.1");
    this.vista = vista;
}

public boolean insertProveedor(Proveedor c) {
    PreparedStatement ps;
    String sqlInsertProveedor = "insert into invernadero_gran_valle.proveedor values (?,?,?,?,?,?,?,?,?,?,?);";
    try {
        ps = interfaceLogin.conectiondb.getConexion().prepareStatement(sqlInsertProveedor);
        ps.setInt(1, c.getId());
        ps.setString(2, c.getRfc());
        ps.setString(3, c.getRazonSocial());
        ps.setString(4, c.getCalle());
        ps.setString(5, c.getNumero()+"");
        ps.setString(6, c.getColonia());
        ps.setString(7, c.getEstado());
        ps.setString(8, c.getMunicipio());
        ps.setString(9, c.getTelefono());
        ps.setString(10, c.getCelular());
        ps.setString(11, c.getEmail());

        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Proveedor añadido");
        return true;
    } catch (SQLException exception) {
        System.err.println("Error en al añadir (Proveedor) " + exception);
        return false;
    }
}

public boolean updateProveedor(Proveedor c) {
    PreparedStatement ps;
    try {
        ps = interfaceLogin.conectiondb.getConexion().prepareStatement("update invernadero_gran_valle.proveedor set rfc_prov=?,"
                + " razon_social=?,calle=?, numero=?, colonia=?, municipio=?, estado=?,telefono=?, celular=?, e_mail=? "
                + "where id_prov=?");
        
        ps.setString(1, c.getRfc());
        ps.setString(2, c.getRazonSocial());
        ps.setString(3, c.getCalle());
        ps.setString(4, c.getNumero());
        ps.setString(5, c.getColonia());
        ps.setString(6, c.getMunicipio());
        ps.setString(7, c.getEstado());
        ps.setString(8, c.getTelefono());
        ps.setString(9, c.getCelular());
        ps.setString(10, c.getEmail());
        ps.setInt(11, c.getId());

        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Proveedor actualizado");
        return true;
    } catch (SQLException exception) {
        System.err.println("Error en al añadir (Proveedor) " + exception);
        return false;
    }
}

public boolean deleteProveedor(Proveedor c) {
    PreparedStatement ps;
    String sqlDeleteProveedor = "delete from invernadero_gran_valle.proveedor where id_cliente  = ?;";

    try {
        ps = interfaceLogin.conectiondb.getConexion().prepareStatement(sqlDeleteProveedor);
        ps.setInt(1, c.getId());

        ps.executeUpdate();
        return true;
    } catch (SQLException exception) {
        System.err.println("Error al borrar (Proveedor)" + exception);
        return false;
    }
}

public List<Proveedor> listProveedor() {
    PreparedStatement ps;
    ResultSet rs;
    String consultaSQL = "Select id_prov, rfc_prov, razon_social, calle, numero, colonia, municipio,"
                          + " estado, telefono, celular, e_mail from invernadero_gran_valle.proveedor;";

    //String consultaSQL = "select * from invernadero_gran_valle.cliente;";

    List<Proveedor> proveedores = new ArrayList<Proveedor>();
    try {
        ps = interfaceLogin.conectiondb.getConexion().prepareStatement(consultaSQL);
        rs = ps.executeQuery();
        while (rs.next()) {
            Proveedor c = new Proveedor();
            c.setId(rs.getInt("id_prov"));
            c.setRfc(rs.getString("rfc_prov"));
            c.setRazonSocial(rs.getString("razon_social"));      
            c.setCalle(rs.getString("calle"));
            c.setNumero(rs.getString("numero"));
            c.setColonia(rs.getString("colonia"));
            c.setMunicipio(rs.getString("municipio"));
            c.setEstado(rs.getString("estado"));
            c.setTelefono(rs.getString("telefono"));
            c.setCelular(rs.getString("celular"));
            c.setEmail(rs.getString("e_mail"));
            
            proveedores.add(c);

            /*
            for (Proveedor q : proveedores) {
                System.out.println(q.regresaDatos());
            } */
        }
    } catch (SQLException exception) {
        System.err.println("Error al CARGAR DATOS (Proveedor) " + exception);
        proveedores =  Collections.emptyList();
    }
    
    Collections.sort(proveedores);
    return proveedores;
}
       
}//fin de la clase




