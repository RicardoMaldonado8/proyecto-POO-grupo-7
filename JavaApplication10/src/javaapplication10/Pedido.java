package javaapplication10;

public class Pedido {
    /* Atributos */
    private String productoSeleccionado;
    private int cantidades;
    
    /* Constructor */
    public Pedido (String productoSeleccionado, int cantidades){
        this.productoSeleccionado = productoSeleccionado;
        this.cantidades = cantidades;
    }
    
    /* Encapsulamiento / GETTER - SETTER */
    public String getProductoSeleccionado() {
        return productoSeleccionado;
    }

    public void setProductoSeleccionado(String productoSeleccionado) {
        this.productoSeleccionado = productoSeleccionado;
    }

    public int getCantidades() {
        return cantidades;
    }

    public void setCantidades(int cantidades) {
        this.cantidades = cantidades;
    }
    
    /* Métodos */
    
    /* toString */
    
}
