
package Modelo;

/**
 * El gran valle, Invernadero
 * @author Clog_10
 */

public class Cliente {
    private int id;
    private String nombre,aPaterno,aMaterno;
    private String calle,colonia,municipio,estado;
    private int numero;
    private String celular,telefono,email,RFC;

    public Cliente(int id, String RFC,String nombre, String aPaterno, String aMaterno, String calle, String colonia, String municipio, 
                                String estado, int numero, String celular, String telefono, String email) {
        this.id=id;
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.calle = calle;
        this.colonia = colonia;
        this.municipio = municipio;
        this.estado = estado;
        this.numero = numero;
        this.celular = celular;
        this.telefono = telefono;
        this.email = email;
        this.RFC = RFC;
    }
    
    public Cliente(){
        
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String regresaDatos(){
        String datos="Id: "+id+" "+nombre+" "+aPaterno+ " "+aMaterno+"\n";
        datos+=" "+calle+" "+numero+" "+colonia+" "+municipio+" "+estado+"\n";
        datos+="Telefono: "+telefono+"\tCelular: "+celular+"\tEmail: "+email+"\n";
        datos+="RFC: "+RFC;
        return datos;
    }
    
}




