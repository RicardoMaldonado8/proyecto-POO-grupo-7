package javaapplication10;

public class Factura {
    /* Atributos */
    private int numero;
    private String detalleProducto;
    private int totales;
    private int descuento; 
    
    /* Constructor */
    public Factura (int numero, String detalleProducto, int totales, int descuento){
        this.detalleProducto = detalleProducto;
        this.numero = numero;
        this.totales = totales;
        this.descuento = descuento;
    }
    
    /* Encapsulamiento / GETTER - SETTER */
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDetalleProducto() {
        return detalleProducto;
    }

    public void setDetalleProducto(String detalleProducto) {
        this.detalleProducto = detalleProducto;
    }

    public int getTotales() {
        return totales;
    }

    public void setTotales(int totales) {
        this.totales = totales;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
    
    
    
}
