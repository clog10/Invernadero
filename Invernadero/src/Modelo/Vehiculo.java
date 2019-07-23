
package Modelo;

/**
 *
 * @author Clog_10
 */
public class Vehiculo {
    
    private String matricula,marca,modelo;
    private int numSerie,anio;

    public Vehiculo(String matricula, String marca, String modelo, int numSerie, int anio) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.numSerie = numSerie;
        this.anio = anio;
    }
    
    public Vehiculo(){
        
    }

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

    @Override
    public String toString() {
        String datos=" Vehiculo " + "\tMatricula: "+matricula+"\n";
               datos+=" Marca: " + marca + " Modelo: " + modelo + " Numero de Serie: " + numSerie + " Año: " + anio;
               
        return datos;
    }
    
    
    
}








