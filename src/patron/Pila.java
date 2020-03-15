/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron;

import java.util.ArrayList;

/**
 *
 * @author César
 */
public class Pila implements TAD {

    ArrayList<Integer> arrayPila;

    public Pila() {
        arrayPila = new ArrayList<>();
    }

    @Override
    public void insertar(int valor) {
        // Se inserta el valor en la fila
        arrayPila.add(valor);
    }

    @Override
    public void insertarEnPosicion(int valor, int posicion) {

    }

    @Override
    public void listarValores() {

    }

    @Override
    public void actualizar(int valor, int posicion) {

    }

    @Override
    public void buscarValor(int valor) {

    }

    @Override
    public void eliminarPorValor(int valor) {

    }

    @Override
    public void eliminarPorPosicion(int posicion) {

    }
}
