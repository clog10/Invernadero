package Modelo;

import java.util.Date;

/**
 * 
 * @author AMAURY
 */
public class Venta implements Comparable<Venta> {

    private int id;
    private double total;
    private double subtotal;
    private String[] productos;
    private String cliente;
    private String fecha;
/**
 * Crea una venta 
 * @param id: identificador
 * @param subtotal: sub total del pago 
 * @param total: total del pago
 * @param cliente: cliente al que se le vende 
 * @param user: usuario
 * @param fecha: contiene la fecha en la que es emitida la venta 
 * @param productos : que productos se venden 
 */
    public Venta(int id,double subtotal,double total, String cliente,String fecha, String... productos) {
        this.id = id;
        this.subtotal = subtotal;
        this.productos = productos;
        this.cliente = cliente;
        this.total=total;
        this.fecha=fecha;
    }
    /**
     * constructor vacio
     */
    public Venta(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
/**
 * Regresa los datos de la venta 
 * @return datos de la venta 
 */
    @Override
    public String toString() {
        String datos = "Cliente: " + cliente+"\n";
        datos+="Fecha de Entrega: "+fecha+"\n";
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



























