
package Modelo;

/**
 * El gran valle, Invernadero
 * @author Clog_10
 */
public class Venta {
    private int id;
    private String nombre;
    private String unidad;
    private int precio;
    private int cantidad;
    private int subtotal;
    private Producto [] productos;
    private Cliente cliente;
    
    public Venta(int id,String nombre, String unidad, int precio, int cantidad, int subtotal,Cliente cliente,Producto ... productos) {
        this.id=id;
        this.nombre = nombre;
        this.unidad = unidad;
        this.precio = precio;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.productos=productos;
        this.cliente=cliente;
        this.productos=productos;
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

    public void Totales(){
        //para obtener los totales de los productos y sumarlos
    }
    
    @Override
    public String toString() {
        String datos= "Nombre: "+nombre+" Unidad: "+unidad+" Precio: "+precio+" Cantidad: "+cantidad+" subtotal:"+subtotal+"\n";
        datos+="Cliente: " + cliente.toString();
        
        return datos;
    }
    
    
    
}













