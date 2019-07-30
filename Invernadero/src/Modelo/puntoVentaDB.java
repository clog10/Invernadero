
package Modelo;

import Vista.vistaPuntoVenta;
import Vista.interfaceLogin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Invernadero gran valle
 * @author Clog_10
 */
public class puntoVentaDB {
    
    private vistaPuntoVenta vp;

    public puntoVentaDB() {
        this.vp=vp;
    }
    
    public List<Producto> listProducto() {
        PreparedStatement ps;
        ResultSet rs;
        String consultaSQL = "Select id_cosecha, nombre,unidad_medida,precio_u,cantidad from invernadero_gran_valle.cosecha;";

        List<Producto> pro = new ArrayList<Producto>();
        try {
            ps = interfaceLogin.conectiondb.getConexion().prepareStatement(consultaSQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto c = new Producto();
                c.setId(rs.getInt("id_cosecha"));
                c.setNombre(rs.getString("nombre"));
                c.setUnidad(rs.getString("unidad_medida"));
                c.setPrecio(rs.getInt("precio_u"));
                c.setCantidad(rs.getInt("cantidad"));
                pro.add(c);

            }
        } catch (SQLException exception) {
            System.err.println("Error al CARGAR DATOS (Producto) " + exception);
            pro = Collections.emptyList();
        }
        Collections.sort(pro);
        return pro;
    }
    
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















