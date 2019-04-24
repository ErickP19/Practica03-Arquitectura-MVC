/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.clases;

import ec.ups.edu.interfaces.Principal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author erics
 */
public final class EntrenadorPsicologico extends Entrenador implements Principal  {
  
       private String titulo;
       private String tituloCharlas;
       private Date FechaContratacion;
       
       public EntrenadorPsicologico(){
           
       }
       
    // constructor

    public EntrenadorPsicologico(String titulo, String tituloCharlas, Date FechaContratacion, double sueldo, int edad, String recomendaciones, int codigo, String nombre, String cedula, int telefono, String direccion, String correo) {
        super(sueldo, edad, recomendaciones, codigo, nombre, cedula, telefono, direccion, correo);
        this.titulo = titulo;
        this.tituloCharlas = tituloCharlas;
        this.FechaContratacion = FechaContratacion;
    }
    
    public String getTituloCharlas() {
        return tituloCharlas;    
    }

    // get and set
    public void setTituloCharlas(String tituloCharlas) {
        this.tituloCharlas = tituloCharlas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaContratacion() {
        return FechaContratacion;
    }

    public void setFechaContratacion(Date FechaContratacion) {
        this.FechaContratacion = FechaContratacion;
    }

    public String comer() {
        return "\tEntrenador Psicologico " + this.getNombre() + " está comiendo";
    }

    public String descansar() {
        return "\tEntrenador Psicologico  " + this.getNombre() + " está descansando";
    }
    public String verTelevision() {
        return "\tEntrenador Psicologico  " + super.getNombre() + " está respondiendo mensajes";
    }

    @Override
    public String toString() {
        SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
        return super.toString()+ "EntrenadorPsicologico{" + ", titulo=" + titulo + ", FechaContratacion=" + formato.format(FechaContratacion.getTime()) +'}';
    }
    public static int pedirHoras(){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce las horas que ha trabajado: ");
		int horas = teclado.nextInt();
		return horas;
	}     
    
    public double calcularSueldo (){
    int resultado = 0, horasExtra = 0; 						
		final int horasNormales = 35;
		if (pedirHoras() <= 35){			
			resultado = pedirHoras() * 15;		
		} else{		
			horasExtra = (pedirHoras() - 35) * 22;		
			resultado = horasNormales * 15 + horasExtra;	
		}
		return resultado;
	}

    @Override
    public String responderMensajes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String dormir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    }

