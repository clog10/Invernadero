
package Modelo;

/**
 * Ivernadero Gran Valle
 * @author Clog_10
 */
public class Pedido {
    
    private Venta venta;
    private Cliente cliente;
    private Empleado empleado;
    private Vehiculo vehiculo;

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        String datos= "Pedido:\n";
               datos+="Venta: " + venta.toString()+"\n";  
               datos+="Cliente: " + cliente.toString()+"\n" ;
               datos+="Empleado: " + empleado.toString()+"\n" ;
               datos+="Vehiculo: " + vehiculo.toString()+"\n" ;
        return datos;
    }
    
}






