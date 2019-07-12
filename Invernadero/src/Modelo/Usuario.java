package Modelo;

/**
 * El gran valle, Invernadero
 *
 * @author Clog_10
 */
public class Usuario {

    private Empleado empleado;

    private String user, password;

    public Usuario(Empleado empleado, String user, String password) {
        this.empleado = empleado;
        this.user = user;
        this.password = password;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String regresaDatos() {
        String datos = "Id: " + empleado.getId() + " " + empleado.getNombre() + " "
                + empleado.getaPaterno() + " " + empleado.getaMaterno() + "\n";
        datos += "Usuario: " + user + " Contraseña: " + password;

        return datos;
    }
}

