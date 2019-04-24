/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.clases;

/**
 *
 * @author erics
 * @since 14-April-2019
 * @version IDE 8.2
 *      Clase padre 1
 */
public abstract class  Entrenador extends Persona{
   
    private double sueldo;
    private int edad;
    private String recomendaciones;
    
    public Entrenador(){
        
    }
    
    public Entrenador(double sueldo, int edad, String recomendaciones, int codigo, String nombre, String cedula, int telefono, String direccion, String correo) {
        super(codigo, nombre, cedula, telefono, direccion, correo);
        this.sueldo = sueldo;
        this.edad = edad;
        this.recomendaciones = recomendaciones;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRecomendaciones() {
        return recomendaciones;
    }

    public void setRecomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
    }

    //public abstract double calcularSueldo();
    
     public abstract String responderMensajes();

    @Override
    public String toString() {
        return super.toString()+"Entrenador{" + ", sueldo=" + sueldo + ", edad=" + edad + ", recomendaciones=" + recomendaciones + '}';
    }

   
    
    
}
