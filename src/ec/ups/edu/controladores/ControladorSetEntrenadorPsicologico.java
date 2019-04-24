/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.controladores;

import ec.ups.edu.clases.EntrenadorPsicologico;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author erics
 */
public class ControladorSetEntrenadorPsicologico {
    
    private Set<EntrenadorPsicologico> lista;
    private int codigo;

    public ControladorSetEntrenadorPsicologico() {
        lista = new HashSet<>();
        codigo=0;
    }
    
    //crear un num=evo objeto en la lista
    public void create(EntrenadorPsicologico objeto){
        codigo ++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }
        
    //leer un objeto en la lista por medio del codigo
    public EntrenadorPsicologico read(int codigo){
        for (EntrenadorPsicologico entre : lista) {
            if (entre.getCodigo() == codigo) {
                return entre;
            }
        }
        return null;
    }
    
    //modificar un objeto en la lista por medio del codigo
    public void update(EntrenadorPsicologico objeto){
        if(lista.contains(objeto)){
            lista.remove(objeto);
            lista.add(objeto);
        }
    }
    
    //eliminar un objeto por medio del codigo
    public void delete(int codigo){
        for (EntrenadorPsicologico entre : lista) {
            if (entre.getCodigo() == codigo){
                lista.remove(entre);
                break;
            }
        }
    }
    
    //imprime todos los objetos de la lista
    public void print(){
        for (EntrenadorPsicologico entre : lista) {
            System.out.println(entre.getNombre());
        }
    }
    
}
