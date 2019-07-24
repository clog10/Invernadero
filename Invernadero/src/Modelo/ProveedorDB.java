
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
    String sqlInsertProveedor = "insert into invernadero_gran_valle.proveedor values (?,?,?,?,?,?,?,?,?,?,?,?,?);";
    try {
        ps = interfaceLogin.conectiondb.getConexion().prepareStatement(sqlInsertProveedor);
        ps.setInt(1, c.getId());
        ps.setString(2, c.getRazonSocial());
        ps.setString(3, c.getRfc());
        ps.setString(4, c.getCalle());
        ps.setString(5, c.getColonia());
        ps.setString(6, c.getEstado());
        ps.setInt(7, c.getNumero());
        ps.setString(8, c.getMunicipio());
        ps.setString(9, c.getEmail());
        ps.setString(10, c.getTelefono());
        ps.setString(11, c.getCelular());

        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Proveedor añadido");
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
    String consultaSQL = "Select id_prov, razon_social, rfc_prov, calle, colonia, estado,"
                          + " numero, municipio, e_mail, telefono, celular from invernadero_gran_valle.proveedor;";

    //String consultaSQL = "select * from invernadero_gran_valle.cliente;";

    List<Proveedor> proveedores = new ArrayList<Proveedor>();
    try {
        ps = interfaceLogin.conectiondb.getConexion().prepareStatement(consultaSQL);
        rs = ps.executeQuery();
        while (rs.next()) {
            Proveedor c = new Proveedor();
            c.setId(rs.getInt("id_prov"));
            c.setRazonSocial(rs.getString("razon_social"));
            c.setRfc(rs.getString("rfc_prov"));
            c.setCalle(rs.getString("calle"));
            c.setColonia(rs.getString("colonia"));
            c.setEstado(rs.getString("estado"));
            c.setNumero(rs.getInt("numero"));
            c.setMunicipio(rs.getString("municipio"));
            c.setEmail(rs.getString("e_mail"));
            c.setTelefono(rs.getString("telefono"));
            c.setCelular(rs.getString("celular"));
            
            
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
    return proveedores;
}
    
    
    
    
    
}






