package Modelo;

import java.util.Date;

/**
 * El gran valle, Invernadero
 * @author Clog_10
 */

public class Venta implements Comparable<Venta> {

    private int id;
    private int cantidad;
    private int total;
    private int subtotal;
    private Producto[] productos;
    private String cliente;
    private String user;
    private Date fecha;

    public Venta(int id, int cantidad, int subtotal,int total, String cliente,String user,Date fecha, Producto... productos) {
        this.id = id;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.productos = productos;
        this.cliente = cliente;
        this.user=user;
        this.total=total;
        this.fecha=fecha;
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

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

            //para obtener los precios de los productos y sumarlos
    public int Totales() {
        //int total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    @Override
    public String toString() {
        String datos = "Cliente: " + cliente+"\n";
        datos+="Fecha de Entrega: "+fecha+"\n";
        datos+="Vendió: "+user+"\n";
        for(Producto p:productos){
            datos +=""+p+"\n";
        }
       datos+=" subtotal:" + subtotal + " total: " + total + "\n";
        
        return datos;
    }

    @Override
    public int compareTo(Venta o) {
        return this.getFecha().compareTo(o.getFecha());
    }
    
    //Cuando llames a este metodo dale "reverseOrder" para que en la tabla se muestren las ultimas ventas primero
}

















