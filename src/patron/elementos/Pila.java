/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron.elementos;

import java.util.ArrayList;

/**
 * Clase Pila.
 * @author César Augusto Gómez.
 */
public class Pila implements Elemento {

    ArrayList<Integer> arrayPila;

    public Pila() {
        arrayPila = new ArrayList<>();
    }

    @Override
    public void agregar(int valor) {
        arrayPila.add(valor);
    }

    @Override
    public void sacar() {
        int longitud = arrayPila.size();
        if (longitud > 0) {
            arrayPila.remove(longitud - 1);
        }
    }

}
