
package Modelo;

/**
 * El gran valle, Invernadero
 * @author Clog_10
 */
public class Proveedor {
    
    private int id;
    private String razonSocial,rfc;
    private String calle,colonia,municipio,estado;
    private int numero;
    private String telefono,celular,email;

    public Proveedor(int id,String razonSocial, String rfc, String calle, String colonia, String municipio, String estado, 
                                int numero, String telefono, String celular, String email) {
        this.id=id;
        this.razonSocial = razonSocial;
        this.rfc = rfc;
        this.calle = calle;
        this.colonia = colonia;
        this.municipio = municipio;
        this.estado = estado;
        this.numero = numero;
        this.telefono = telefono;
        this.celular = celular;
        this.email = email;
    }
    
    public Proveedor(){
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        String datos= "Proveedor" + "razonSocial=" + razonSocial + ", rfc=" + rfc+"\n";
               datos+="Calle: "+calle+" Colonia: "+colonia+" Municipio: "+municipio+" Estado: "+estado+" Numero: "+numero+"\n";
                datos+="Telefono: "+telefono+" Celular: "+celular+" Email: " + email;
        return datos;
    }
    
    
    
    
}




