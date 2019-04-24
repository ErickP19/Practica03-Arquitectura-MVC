/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.clases;

import ec.ups.edu.interfaces.Principal;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author erics
 *  Clase hija 1
 */
public final class EntrenadorPersonal extends Entrenador implements Principal{
        private String titulo;
        private String tipoIdioma;
        private String rutina;
       // private Date fechadeContratacion;
    
    /**
     *
     */
    public EntrenadorPersonal(){
            
        }
        //constructor

    public EntrenadorPersonal(String titulo, String tipoIdioma, String rutina, double sueldo, int edad, String recomendaciones, int codigo, String nombre, String cedula, int telefono, String direccion, String correo) {
        super(sueldo, edad, recomendaciones, codigo, nombre, cedula, telefono, direccion, correo);
        this.titulo = titulo;
        this.tipoIdioma = tipoIdioma;
        this.rutina = rutina;
    }

    

    //get and set
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipoIdioma() {
        return tipoIdioma;
    }

    public void setTipoIdioma(String tipoIdioma) {
        this.tipoIdioma = tipoIdioma;
    }

    public String getRutina() {
        return rutina;
    }

    public void setRutina(String rutina) {
        this.rutina = rutina;
    }
    public String comer() {
        return "\tEl Entrenador " + this.getNombre() + " está comiendo";
    }

   
    public String descansar() {
        return "\tEl Entrenador " + this.getNombre() + " está descansando";
    }

    public String trabajar() {
        return "\tEl Entrenador " + this.getNombre() + " está trabajando";
    }
    
    @Override
    public String toString() {
        return super.toString()+"EntrenadorPersonal{" +  ", titulo=" + titulo + ", tipoIdioma=" + tipoIdioma + ", rutina=" + rutina  + '}';
    }
    
    
     public static int pedirHoras(){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce las horas que ha trabajado: ");
		int horas = teclado.nextInt();
		return horas;
	}     
    public double calcularSueldo(){
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

  

