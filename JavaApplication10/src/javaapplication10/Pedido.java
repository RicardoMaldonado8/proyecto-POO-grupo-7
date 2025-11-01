package javaapplication10;
import java.util.ArrayList;

public class Pedido {
    /* Atributos */
    private Producto producto;
    private int cantidad;
    
    
    /* Constructor */
    public Pedido (Producto producto, int cantidad){
        this.producto = producto;
        this.cantidad = cantidad;
    }
    
    /* Encapsulamiento / GETTER - SETTER */
    public String getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidades() {
        return cantidad;
    }

    public void setCantidades(int cantidad) {
        this.cantidad = cantidad;
    }
    
    /* Métodos */
    
    /* toString */
    @Override
    public String toString() {
        return "Pedido de " + producto + " con " + cantidad + " artículos.";
    }
    
    
    
}
