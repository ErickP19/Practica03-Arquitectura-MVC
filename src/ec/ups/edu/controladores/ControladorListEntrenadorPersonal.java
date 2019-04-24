/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.controladores;

import ec.ups.edu.clases.EntrenadorPersonal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author erics
 */
public class ControladorListEntrenadorPersonal {
    
    private List<EntrenadorPersonal> lista;
    private int codigo;

    public ControladorListEntrenadorPersonal() {
        lista=new ArrayList<>();
        codigo=0;
    }
    
    //crear un num=evo objeto en la lista
    public void create(EntrenadorPersonal objeto){
        codigo++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }
    
    //leer un objeto en la lista por medio del codigo
    public EntrenadorPersonal read(int codigo){
        for (EntrenadorPersonal entre : lista){
            if (entre.getCodigo() == codigo){
                return entre;
            }
        }
        return null;
    }
    
    //modificar un objeto en la lista por medio del codigo
    public void update(EntrenadorPersonal objeto){
        for (int i = 0; i < lista.size(); i++) {
            EntrenadorPersonal e = new EntrenadorPersonal();
            if(e.getCodigo() == objeto.getCodigo()){
                lista.set(i, e);
                break;
            }
            
        }
    }
    
    //eliminar un objeto por medio del codigo
    public void delete(int codigo){
        for (int i = 0; i < lista.size(); i++) {
            EntrenadorPersonal e = lista.get(i);
            if(e.getCodigo() == codigo){
                lista.remove(i);
                break;
            }
        }
    }
    
    //imprime todos los objetos de la lista
    public void print(){
        System.out.println("Lista \n");
        
        for (EntrenadorPersonal entre : lista) {
            System.out.println(entre.getNombre());
        }
    }
    
    
}
