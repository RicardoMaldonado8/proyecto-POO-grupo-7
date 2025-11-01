/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author Parrales
 */
public class Tienda implements Vendible{
    private list<Producto> catalogo;
    private list<Cliente> cliente;
    private List<Empleado> empleados;
    private Map<Integer, Factura> facturas;
    
    // Contador de facturas
    private int numeroFactura = 1000;
    public Tienda(){
        this.catalogo= new ArrayList<>();
        this.cliente=new ArrayList<>();
        this.empleados=new ArrayList<>();
        this.facturas=new HashMap<>();
        
        
        
        
    }
}
