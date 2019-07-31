
package Modelo;

import Vista.vistaPuntoVenta;
import Vista.interfaceLogin;
import java.sql.Array;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.Connection;

/**
 * Invernadero gran valle
 * @author Clog_10
 */
public class puntoVentaDB {
    
     Connection connection;
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
    
    
     /**
     * metodo insert para insertar clientes en nuestra base de datos
     * @return   un boleano para indicar que el cliente fue agregado
     */
    public boolean insertVenta(Venta c) {
        PreparedStatement ps;
        String sqlInsertCliente = "insert into invernadero_gran_valle.venta values (?,?,?,?,?,?,?);";
        try {
            ps = interfaceLogin.conectiondb.getConexion().prepareStatement(sqlInsertCliente);
            ps.setInt(1, c.getId());
            ps.setDouble(2, c.getSubtotal());
            ps.setDouble(3, c.getTotal());
            ps.setString(4, c.getCliente());
            ps.setString(5, c.getUser());
            ps.setString(6, c.getFecha());
            Array p=connection.createArrayOf("Character Vayring", c.getProductos());
            ps.setArray(7, p);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente añadido");
            return true;
        } catch (SQLException exception) {
            System.err.println("Error en al añadir (Cliente) " + exception);
            return false;
        }
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




















