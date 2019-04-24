/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.clases;

import ec.ups.edu.interfaces.Principal;
import java.util.Objects;

/**
 *
 * @author erics
 */
public final class JugadorExtra extends Jugador implements Principal{
    
     
        private String lugardeNacimiento;
        private double peso;
        private boolean titularsuplente;
        
        public JugadorExtra(){
            
        }
            //constructor

    public JugadorExtra(String lugardeNacimiento, double peso, boolean titularsuplente, int edad, double estatura, double salario, String posiciondeJuego, int codigo, String nombre, String cedula, int telefono, String direccion, String correo) {
        super(edad, estatura, salario, posiciondeJuego, codigo, nombre, cedula, telefono, direccion, correo);
        this.lugardeNacimiento = lugardeNacimiento;
        this.peso = peso;
        this.titularsuplente = titularsuplente;
    }
   
   
        //get and set

    public String getLugardeNacimiento() {
        return lugardeNacimiento;
    }

    public void setLugardeNacimiento(String lugardeNacimiento) {
        this.lugardeNacimiento = lugardeNacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isTitularsuplente() {
        return titularsuplente;
    }

    public void setTitularsuplente(boolean titularsuplente) {
        this.titularsuplente = titularsuplente;
    }
    public String Entrenando() {
        return "\tJugador Extra " + this.getNombre() + "Esta en la banca";
    }

    public String descansar() {
        return "\tJugador Extra  " + this.getNombre() + " está Jugando practica";
    }
    public String Lesionado() {
        return "\tJugador Profesional " + super.getNombre() + " está dispuesto a jugar";
    }

    @Override
    public String toString() {
        return super.toString()+ "JugadorExtra{" + ", lugardeNacimiento=" + lugardeNacimiento + ", peso=" + peso + ", titularsuplente=" + titularsuplente + '}';
    }
        
    public int calcularEdad(){
         String fechaInicio = "25/04/2014";
        String fechaActual = "12/04/2019";
        String[] aFechaIng = fechaInicio.split("/");
        Integer diaInicio = Integer.parseInt(aFechaIng[0]);
        Integer mesInicio = Integer.parseInt(aFechaIng[1]);
        Integer anioInicio = Integer.parseInt(aFechaIng[2]);

        String[] aFecha = fechaActual.split("/");
        Integer diaActual = Integer.parseInt(aFecha[0]);
        Integer mesActual = Integer.parseInt(aFecha[1]);
        Integer anioActual = Integer.parseInt(aFecha[2]);

        int b = 0;
        int dias = 0;
        int mes = 0;
        int anios = 0;
        int meses = 0;
        mes = mesInicio - 1;
        if (mes == 2) {
            if ((anioActual % 4 == 0) && ((anioActual % 100 != 0) || (anioActual % 400 == 0))) {
                b = 29;
            } else {
                b = 28;
            }
        } else if (mes <= 7) {
            if (mes == 0) {
                b = 31;
            } else if (mes % 2 == 0) {
                b = 30;
            } else {
                b = 31;
            }
        } else if (mes > 7) {
            if (mes % 2 == 0) {
                b = 31;
            } else {
                b = 30;
            }
        }
        if ((anioInicio > anioActual) || (anioInicio == anioActual && mesInicio > mesActual)
                || (anioInicio == anioActual && mesInicio == mesActual && diaInicio > diaActual)) {
        } else {
            if (mesInicio <= mesActual) {
                anios = anioActual - anioInicio;
                if (diaInicio <= diaActual) {
                    meses = mesActual - mesInicio;
                    //dias = b - (diaInicio - diaActual);
                } else {
                    if (mesActual == mesInicio) {
                        anios = anios - 1;
                    }
                    meses = (mesActual - mesInicio - 1 + 12) % 12;
                    //dias = b - (diaInicio - diaActual);
                }
            } else {
                anios = anioActual - anioInicio - 1;
                if (diaInicio > diaActual) {
                    meses = mesActual - mesInicio - 1 + 12;
                    //dias = b - (diaInicio - diaActual);
                } else {
                    meses = mesActual - mesInicio + 12;
                    //dias = diaActual - diaInicio;
                }
            }
        }
        System.out.println("El lagarto "+this.getNombre()+ " tiene: " + anios+" años "+ meses+" meses y "+ dias+" días \n");
        return 0;
        
    }

    @Override
    public String verTelevision() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String comer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String dormir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.lugardeNacimiento);
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.peso) ^ (Double.doubleToLongBits(this.peso) >>> 32));
        hash = 73 * hash + (this.titularsuplente ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final JugadorExtra other = (JugadorExtra) obj;
        if (Double.doubleToLongBits(this.peso) != Double.doubleToLongBits(other.peso)) {
            return false;
        }
        if (this.titularsuplente != other.titularsuplente) {
            return false;
        }
        if (!Objects.equals(this.lugardeNacimiento, other.lugardeNacimiento)) {
            return false;
        }
        return true;
    }

    
}
