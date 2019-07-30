package Modelo;

/**
 * El gran valle, Invernadero
 *
 * @author Clog_10
 */
public class Usuario implements Comparable<Usuario>{

    //private Empleado empleado;
    private int id_empleado;
    private String user, password;

    public Usuario(int id_empleado, String user, String password) {
        //this.empleado = empleado;
        this.id_empleado=id_empleado;
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String regresaDatos() {
      //  String datos = "Id: " + empleado.getId() + " " + empleado.getNombre() + " "
        //        + empleado.getaPaterno() + " " + empleado.getaMaterno() + "\n";
        String datos = "Usuario: " + user + " Contraseña: " + password;

        return datos;
    }

    @Override
    public int compareTo(Usuario o) {
        return this.getId_empleado() > o.getId_empleado() ? 1 : this.getId_empleado() < o.getId_empleado() ? -1 : 0;
    }
}





