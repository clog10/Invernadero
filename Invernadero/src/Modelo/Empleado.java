
package Modelo;

/**
 * Empleado  
 *  @param  id:identificador del empleado dentro del sistema
 *  @param nombre:  guarda el nombre del empleado 
 *  @param aPaterno:  guarda el apellido paterno del empleado 
 *  @param aMaterno:  guarda el nombre del empleado 
 *  @param calle: guarda la calle 
 *  @param numero: guarda el numero de casa
 *  @param colonia: guarda la colonia 
 *  @param municipio: guarda el municipio 
 *  @param estado: guarda el estado del cliente 
 *  @param numTel: numero de telefono movil 
  */
public class Empleado implements Comparable <Empleado>{
    private int id;
    private String nombre,aPaterno,aMaterno;
    private String numTel;
    private String calle,colonia,municipio,estado;
    private int numero;

     /**
     * Constructor de empleado
     * 
 *  @param  id:identificador del empleado dentro del sistema
 *  @param nombre:  guarda el nombre del empleado 
 *  @param aPaterno:  guarda el apellido paterno del empleado 
 *  @param aMaterno:  guarda el nombre del empleado 
 *  @param calle: guarda la calle 
 *  @param numero: guarda el numero de casa
 *  @param colonia: guarda la colonia 
 *  @param municipio: guarda el municipio 
 *  @param estado: guarda el estado del cliente 
 *  @param numTel: numero de telefono movil 
     */
    public Empleado(int id, String nombre, String aPaterno, String aMaterno, 
                            String calle, int numero, String colonia, String municipio, String estado, String numTel) {
        this.id = id;
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.numTel = numTel;
        this.calle = calle;
        this.colonia = colonia;
        this.municipio = municipio;
        this.estado = estado;
        this.numero = numero;
    }
    /**
     * Constructor con parametros
     */
    public Empleado(int parseInt, String text, String text0, String text1, String text2, String text3, String text4, String text5, String text6, int parseInt0, String text7, String text8, String text9) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
/**
     * Constructor vacio
     */
    public Empleado() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getaPaterno() {
        return aPaterno;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public String getaMaterno() {
        return aMaterno;
    }

    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    /**
     * El metodo se encarga de regresar lso datos
     * @return regresa los datos del empleado
     */
    
    public String regresaDatos(){
        String datos="Id: "+id+" "+nombre+" "+aPaterno+ " "+aMaterno+"\n";
               datos+=" "+calle+" "+numero+" "+colonia+" "+municipio+" "+estado+"\n";
               datos+="Numero de Celular: "+numTel;
        return datos;
    }

    @Override
    public int compareTo(Empleado o) {
        return this.getId() > o.getId() ? 1 : this.getId() < o.getId() ? -1 : 0;
    }
    
    
}




