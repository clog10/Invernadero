/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author lenovo
 */
public class Herramienta {
    public int id_herramienta;
    public String nombre;
    private int precio;
    private int cantidad;
   
    public Herramienta(int id_herramienta,String nomrbe,int precio,int cantidad){
        this.id_herramienta=id_herramienta;
        this.nombre=nomrbe;
        this.precio=precio;
        this.cantidad=cantidad;
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

    public int getId_herramienta() {
        return id_herramienta;
    }

    public void setId_herramienta(int id_herramienta) {
        this.id_herramienta = id_herramienta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public String toString(){
        String datos= "Herramienta"+"id_herramienta= "+id_herramienta+"Nombre= "+nombre+"Precio= "+precio+"Cantidad= "+cantidad;
        return datos;
    }
}
