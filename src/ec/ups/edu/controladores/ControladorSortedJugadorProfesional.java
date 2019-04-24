/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.controladores;

import ec.ups.edu.clases.JugarProfesional;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author erics
 */
public class ControladorSortedJugadorProfesional {
      private SortedSet<JugarProfesional> lista;
    private int codigo;

    public ControladorSortedJugadorProfesional() {
        lista = new TreeSet<>();
        codigo=0;
    }
    
    //crear un num=evo objeto en la lista
    public void create(JugarProfesional objeto){
        codigo ++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
        
    }
            
    //leer un objeto en la lista por medio del codigo
    public JugarProfesional read(int codigo){
        for (JugarProfesional ju : lista) {
            if (ju.getCodigo() == codigo) {
                return ju;
            }
        }
        return null;
    }
    
    //modificar un objeto en la lista por medio del codigo
    public void update(JugarProfesional objeto){
        if(lista.contains(objeto)){
            lista.remove(objeto);
            lista.add(objeto);
        }
    }
    
    //eliminar un objeto por medio del codigo
    public void delete(int codigo){
        for (JugarProfesional ju : lista) {
            if (ju.getCodigo() == codigo){
                lista.remove(ju);
                break;
            }
        }
    }
    
    //imprime todos los objetos de la lista
    public void print(){
        System.out.println("Lista \n");
        
        for (JugarProfesional ju : lista) {
            System.out.println(ju.getNombre());
        }
    }
    
}
