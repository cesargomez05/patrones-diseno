package patron.tad;

import patron.elementos.ElementoCola;

/**
 *
 * @author César Augusto Gómez.
 */
public class TADCola implements TAD {

    ElementoCola miCola;

    public TADCola() {
        miCola = new ElementoCola();
    }

    @Override
    public void insertar(int valor) {
        System.out.println("Insertando: " + valor);
        miCola.agregar(valor);
    }

    @Override
    public void insertarEnPosicion(int valor, int posicion) {
        /*System.out.println("Insertando: " + valor + " en la posición " + posicion);

        if (estaVacia()) {
            insertar(valor);
        } else {
            
        }*/
    }

    @Override
    public void listarValores() {
        /*int longitud = obtenerLongitud();

        if (longitud == 0) {
            System.out.println("No hay elementos en la lista");
        } else {
            System.out.println("Imprimiendo valores");
        }*/
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
