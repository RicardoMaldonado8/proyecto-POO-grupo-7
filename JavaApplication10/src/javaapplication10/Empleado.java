package javaapplication10;

public class Empleado {
    /* Atributos */
    private String nombreEmpleado;
    private String cargo;
    private double sueldo;
    
    /* Constructor */
    public Empleado (String nombreEmpleado, String cargo, double sueldo){
        this.nombreEmpleado = nombreEmpleado;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }
    
    /* Encapsulamiento / GETTER - SETTER */
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    /* Métodos */
    
    /* toString */
    
    
}
