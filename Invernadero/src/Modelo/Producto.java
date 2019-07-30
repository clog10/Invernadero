
package Modelo;

/**
 * El gran valle, Invernadero
 * @author Clog_10
 */
public class Producto implements Comparable<Producto> {
    //Variables para la clase producto que se utilizaran.
    public int id;
    public String nombre;
    private double precio;
    private String unidad;
    private int cantidad;
    //Constructor de la clase Producto.
    public Producto(int id,String nombre,double precio,String unidad,int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.unidad=unidad;
        this.precio=precio;
        this.cantidad=cantidad;
    }

    public Producto() {
        
    }
  //Setter y getter de las variables del producto
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
    public void setCantidad(int cantidad){
        this.cantidad=cantidad;
    }
    public int getCantidad(){
        return cantidad;
    }
    @Override
    public String toString() {
        String datos= "Producto " + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", unidad=" + unidad +"cantidad=" +cantidad;
        return datos;
    }    

    @Override
    public int compareTo(Producto o) {
        return this.getId() > o.getId() ? 1 : this.getId() < o.getId() ? -1 : 0;
    }
}



