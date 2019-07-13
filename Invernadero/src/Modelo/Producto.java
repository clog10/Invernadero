
package Modelo;

/**
 * El gran valle, Invernadero
 * @author Clog_10
 */
public class Producto {
    public int id;
    public String nombre;
    private int precio;
    private String unidad;

    public Producto(int id, String nombre,int precio,String unidad) {
        this.id = id;
        this.nombre = nombre;
        this.unidad=unidad;
        this.precio=precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    @Override
    public String toString() {
        String datos= "Producto " + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", unidad=" + unidad  ;
        return datos;
    }
    
    
    
}


