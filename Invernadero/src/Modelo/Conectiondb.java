

package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * Invernadero Gran Valle
 * @author Clog_10
 */
public class Conectiondb {
    
    private String usuario = "postgres";
    private String clave = "Carlos100598";
    private String servidor = "";
    private String baseDatos;
    private static Connection conexion = null;

    //CONSTRUCTOR
    //Recibe el nombre de la base de datos
    public Conectiondb(String baseDatos, String host) {
        this.baseDatos = baseDatos;
        this.servidor = "jdbc:postgresql://" + host + ":" + 5432 + "/" + baseDatos;
        ConexionBd();
    }

    protected void ConexionBd() {

        //Registrar el driver
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("43 ERROR AL REGISTRAR EL DRIVER");
            System.exit(0); //parar la ejecución
        }

        //Establecer la conexión con el servidor
        try {
            conexion = DriverManager.getConnection(this.servidor,
                    this.usuario, this.clave);
        } catch (SQLException e) {
            System.err.println("52 ERROR AL CONECTAR CON EL SERVIDOR");
            System.exit(0); //parar la ejecución
        }
        System.out.println("Conectado a " + baseDatos);
    }

    //Devuelve el objeto Connection que se usará en la clase Controller
    public Connection getConexion() {
        return conexion;
    }

    public void closeConexion() {
        if (getConexion() != null) {
            try {
                getConexion().close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar la bd " + e);
            }
        }
    }
    
}




