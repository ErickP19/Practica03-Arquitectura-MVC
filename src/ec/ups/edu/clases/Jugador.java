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
 *          Clase padre 2
 */
public abstract class Jugador extends Persona {

        private int edad ;
        private double estatura;
        private double salario;
        private String posiciondeJuego;
        
        public Jugador(){
            
        }
      

        //constructor
    public Jugador(int edad, double estatura, double salario, String posiciondeJuego, int codigo, String nombre, String cedula, int telefono, String direccion, String correo) {   
        super(codigo, nombre, cedula, telefono, direccion, correo);
        this.edad = edad;
        this.estatura = estatura;
        this.salario = salario;
        this.posiciondeJuego = posiciondeJuego;
    }

    //get and set
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getPosiciondeJuego() {
        return posiciondeJuego;
    }

    public void setPosiciondeJuego(String posiciondeJuego) {
        this.posiciondeJuego = posiciondeJuego;
    }

   // public abstract int calcularEdad();
     public abstract String verTelevision();

    @Override
    public String toString() {
        return super.toString()+"Jugador{" + "edad=" + edad + ", estatura=" + estatura + ", salario=" + salario + ", posiciondeJuego=" + posiciondeJuego + '}';
    }
        
}
