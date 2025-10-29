package javaapplication10;

public class Cliente {
    /* Atributos */
    private String nombreCliente;
    private String correo;
    
    /* Constructor */
    public Cliente (String nombreCliente, String correo){
        this.nombreCliente = nombreCliente;
        this.correo = correo;
    }
    
    /* Encapsulamiento / GETTER - SETTER */
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    /* Métodos */
    /*equals()*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return correo.equals(cliente.correo);
    }
   
    /* toString */
    @Override
    public String toString(){
        return "cliente:"+nombreCliente+ "correo: "+correo+")";
    }
    
    /*hashCode()*/
    @Override
    public int hashCode() {
        return correo.hashCode();
    }
}