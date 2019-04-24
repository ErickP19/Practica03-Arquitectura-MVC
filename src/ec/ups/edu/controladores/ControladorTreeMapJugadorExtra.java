/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.controladores;

import ec.ups.edu.clases.JugadorExtra;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author erics
 */
public class ControladorTreeMapJugadorExtra {
    private int codigo;
    private Map<Integer, JugadorExtra> lista;

    public ControladorTreeMapJugadorExtra() {
        lista = new TreeMap<>();
        codigo = 0;
    }

    //crear un num=evo objeto en la lista
    public void create(JugadorExtra objeto) {
        codigo++;
        objeto.setCodigo(codigo);
        lista.put(codigo, objeto);
    }

    //leer un objeto en la lista por medio del codigo
    public JugadorExtra read(int codigo) {
        if (lista.get(codigo) != null) {
            return lista.get(codigo);
        }
        return null;

    }

    //modificar un objeto en la lista por medio del codigo
    public void update(JugadorExtra objeto) {
        lista.put(objeto.getCodigo(), objeto);
    }

    //eliminar un objeto por medio del codigo
    public void delete(int codigo) {
        lista.remove(codigo);
    }

    //imprime todos los objetos de la lista
    public void listar() {
        System.out.println("Lista \n");

        for (Map.Entry<Integer, JugadorExtra> ju : lista.entrySet()) {
            int key = ju.getKey();
            String nomJugador = ju.getValue().getNombre();
            System.out.println("Key: " + key + " Jugador Extra: " + nomJugador);
        }
    }
    
}
