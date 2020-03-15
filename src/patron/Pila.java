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
        System.out.println("Insertando: " + valor);
        arrayPila.add(valor);
    }

    @Override
    public void insertarEnPosicion(int valor, int posicion) {
        System.out.println("Insertando: " + valor + " en la posición " + posicion);

        if (estaVacia()) {
            insertar(valor);
        } else {
            
        }
    }

    @Override
    public void listarValores() {
        int longitud = obtenerLongitud();

        if (longitud == 0) {
            System.out.println("No hay elementos en la lista");
        } else {
            System.out.println("Imprimiendo valores");
        }
    }

    @Override
    public int obtenerLongitud() {
        return arrayPila.size();
    }

    @Override
    public boolean estaVacia() {
        return obtenerLongitud() > 0;
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
