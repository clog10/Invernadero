package Modelo;

/**
 * El gran valle, Invernadero
 *
 * @author Clog_10
 */
public class Venta {

    private int id;
    private int cantidad;
    private int precio;
    private int subtotal;
    private Producto[] productos;
    private Cliente cliente;
    private Usuario user;

    public Venta(int id, int cantidad, int subtotal, Cliente cliente,Usuario user, Producto... productos) {
        this.id = id;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.productos = productos;
        this.cliente = cliente;
        this.user=user;
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public int Totales() {
        //para obtener los totales de los productos y sumarlos
        int total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    @Override
    public String toString() {
        String datos = "Cliente: " + cliente.toString();
        datos+="Vendió: "+user.getEmpleado().getNombre()+" "+user.getEmpleado().getaPaterno()+" "+user.getEmpleado().getaMaterno();
       // datos = " Cantidad: " + cantidad + " subtotal:" + subtotal + " total: " + precio + "\n";
        for(Producto p:productos){
            datos +=""+p;
        }
        datos+=" subtotal:" + subtotal + " total: " + precio + "\n";;
        
        return datos;
    }
}



