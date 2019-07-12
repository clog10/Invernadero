
package Modelo;

/**
 *
 * @author Clog_10
 */
public class Venta {
    private String nombre;
    private String unidad;
    private int precio;
    private int cantidad;
    private int subtotal;

    private Cliente cliente;
    
    public Venta(String nombre, String unidad, int precio, int cantidad, int subtotal,Cliente cliente) {
        this.nombre = nombre;
        this.unidad = unidad;
        this.precio = precio;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.cliente=cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
}




