/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron.elementos;

/**
 *
 * @author César
 */
public interface Elemento {

    /**
     * Método para insertar un elemento en el tipo de abstracción de dato.
     *
     * @param valor Valor a insertar.
     */
    public void agregar(int valor);

    /**
     * Método para sacar un elemento de la lista.
     */
    public void sacar();
}
