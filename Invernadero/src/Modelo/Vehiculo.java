
package Modelo;

/**
 * Invernadero Gran Valle
 * @author Clog_10
 * 
 * @param matricula: para añadir matricula de los vehiculos
 * @param marca: para añadir la marca del vehiculo
 * @param modelo: para agregar modelo del vehiculo
 * @param numSerie: para añadir numero de serie al vehiculo
 * @param anio: para añadir el año del vehiculo
 */
public class Vehiculo implements Comparable<Vehiculo> {
    
    private String matricula,marca,modelo;
    private int numSerie,anio;

    //Constructor con parametros
    /**
     * Constructor con parametros
     * @param matricula: para añadir matricula de los vehiculos
 * @param marca: para añadir la marca del vehiculo
 * @param modelo: para agregar modelo del vehiculo
 * @param numSerie: para añadir numero de serie al vehiculo
 * @param anio: para añadir el año del vehiculo
     */
    public Vehiculo(String matricula, String marca, String modelo, int numSerie, int anio) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.numSerie = numSerie;
        this.anio = anio;
    }
    
    //Constructor Vacio
    /**
     * Constructor Vacio
     */
    public Vehiculo(){
         
    }

    
    //Getter y Setter de los parametros
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    
    //metodo toString para imprimir los datos del vehiculo
    /**
     * metodo toString para imprimir los datos del vehiculo
     * @return mprimir los datos del vehiculo
     */
    @Override
    public String toString() {
        String datos=" Vehiculo " + "\tMatricula: "+matricula+"\n";
               datos+=" Marca: " + marca + " Modelo: " + modelo + " Numero de Serie: " + numSerie + " Año: " + anio;
               
        return datos;
    }

    @Override
    public int compareTo(Vehiculo o) {
        return this.getNumSerie() > o.getNumSerie() ? 1 : this.getNumSerie() < o.getNumSerie() ? -1 : 0;
    }
    
    
    
}














