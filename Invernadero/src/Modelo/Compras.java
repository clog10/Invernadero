
package Modelo;

/**
 * 
 * Clase Compras que nos servirá para crear compras y llevar el control de los gastos
 * de la empresa
 * 
 * @param  id: identificador de la compra
 * @param productos: los productos que se compraron
 * @param fecha: fecha en la que se compró el producto
 * @param total: costo de la compra
 */
public class Compras {
    private String productos;
    private String fecha;
    private double total;
 /**
  * onstructor de la clase con parametros
  * @param productos: los productos que se compraron
 * @param fecha: fecha en la que se compró el producto
 * @param total: costo de la compra
  */
   
    public Compras( String productos, String fecha, double total) {
        this.productos = productos;
        this.fecha = fecha;
        this.total = total;
    }
    
    /**
     *Constructor vacio 
     */
    public Compras(){
        
    }

    //Getter y Setter de los parametros
    public String getProductos() {
        return productos;
    }
    public void setProductos(String productos) {
        this.productos = productos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    //Metodo toString que imprime los dstos de la compra
    /**
     * Metodo toString que imprime los dstos de la compra
     * @return Regresa datos de la compra
     */
   
    @Override
    public String toString() {
        return "Compras{" +  ", productos=" + productos + ", fecha=" + fecha + ", total=" + total + '}';
    }
    
    
    
    
}











