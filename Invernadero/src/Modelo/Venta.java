package Modelo;

import java.util.Date;

/**
 * El gran valle, Invernadero
 * @author Clog_10
 */

public class Venta implements Comparable<Venta> {

    private int id;
    private int cantidad;
    private double total;
    private double subtotal;
    private String[] productos;
    private String cliente;
    private String user;
    private String fecha;

    public Venta(int id, int cantidad,double subtotal,double total, String cliente,String user,String fecha, String... productos) {
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

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String[] getProductos() {
        return productos;
    }

    public void setProductos(String[] productos) {
        this.productos = productos;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        String datos = "Cliente: " + cliente+"\n";
        datos+="Fecha de Entrega: "+fecha+"\n";
        datos+="Vendió: "+user+"\n";
        for(String p:productos){
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





















