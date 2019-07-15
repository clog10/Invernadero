
package Modelo;

/**
 *
 * @author Clog_10
 */
public class Vehiculo {
    
    private String matricula,marca,modelo;
    private int numSerie,anio;
    private Empleado operador;

    public Vehiculo(String matricula, String marca, String modelo, int numSerie, int anio, Empleado operador) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.numSerie = numSerie;
        this.anio = anio;
        this.operador = operador;
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

    public Empleado getOperador() {
        return operador;
    }

    public void setOperador(Empleado operador) {
        this.operador = operador;
    }

    @Override
    public String toString() {
        String datos=" Vehiculo " + "\tMatricula: "+matricula+"\n";
               datos+=" Marca: " + marca + " Modelo: " + modelo + " Numero de Serie: " + numSerie + " Año: " + anio;
               datos+=" Operador: " + operador.toString() ;
               
        return datos;
    }
    
    
    
}




