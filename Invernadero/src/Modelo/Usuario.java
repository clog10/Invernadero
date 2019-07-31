package Modelo;

/**
 * El gran valle, Invernadero
 *
 * @author Clog_10
 * 
 * @param id_empleado: para identificar el empleado dentro del sistema
 * @param user: un nombre de usuario
 * @param password: contraseña para el usuario
 */
public class Usuario implements Comparable<Usuario>{

    private int id_empleado;
    private String user, password;

    
    //Constructor con parametros
    /**
     * Constructor con parametros
     * @param id_empleado: para identificar el empleado dentro del sistema
 * @param user: un nombre de usuario
 * @param password: contraseña para el usuario
     */
    public Usuario(int id_empleado, String user, String password) {

        this.id_empleado=id_empleado;
        this.user = user;
        this.password = password;
    }
    
    //Constructor Vacio
    /**
     * Constructor Vacio
     */
    public Usuario(){
        
    }

    ////**
    // * Setter y Getter de todos los atributpos
    // * @return los datos que se vayan a requerir despues
     //*/
    
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
    
    //MEtodo para imprimir los datos del usuario
/**
 * Metodo para imprimir los datos del usuario
 * @return imprime datos del usuario
 */
    public String regresaDatos() {
        String datos = "Usuario: " + user + " Contraseña: " + password;

        return datos;
    }

    @Override
    public int compareTo(Usuario o) {
        return this.getId_empleado() > o.getId_empleado() ? 1 : this.getId_empleado() < o.getId_empleado() ? -1 : 0;
    }
}








