
package Modelo;

/**
 * El gran valle, Invernadero
 * @author Clog_10
 */
public class Venta {
    private int id;
    private int cantidad;
    private int subtotal;
    private Producto [] productos;
    private Cliente cliente;
    
    public Venta(int id, int cantidad, int subtotal,Cliente cliente,Producto ... productos) {
        this.id=id;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.productos=productos;
        this.cliente=cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int Totales(){
        //para obtener los totales de los productos y sumarlos
        int total=0;
        for(Producto p:productos){
            total+=p.getPrecio();
        }
        return total;
    }
    
    @Override
    public String toString() {
        String datos= "  Cantidad: "+cantidad+" subtotal:"+subtotal+"\n";
        datos+="Cliente: " + cliente.toString();
        
        return datos;
    }
    
}


