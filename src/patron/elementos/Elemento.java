package patron.elementos;

import java.util.ArrayList;

/**
 *
 * @author César Augusto Gómez.
 */
public abstract class Elemento {

    ArrayList<Integer> arrayList;
    int numElementos;
    int posicionPivote;

    public Elemento() {
        arrayList = new ArrayList<>();
        numElementos = 0;
        posicionPivote = 0;
    }

    /**
     * Método para agregar un elemento en la lista.
     *
     * @param valor Valor a insertar.
     */
    public abstract void agregar(int valor);

    /**
     * Método para sacar el elemento de la lista.
     *
     * @throws java.lang.Exception
     */
    public abstract void sacar() throws Exception;

    /**
     * Método que obtiene el N° de elementos.
     *
     * @return N° de elementos.
     */
    public int getNumeroElementos() {
        return numElementos;
    }

    /**
     * Método para obtener el elemento accesible de la lista.
     *
     * @return Elemento visible de la lista.
     * @throws java.lang.Exception
     */
    public int obtenerElemento() throws Exception {
        if (!estaVacia()) {
            return arrayList.get(posicionPivote);
        }
        throw new Exception("No hay elementos en la lista");
    }

    /**
     * Método que permite validar si la lista se encuentra vacía.
     *
     * @return TRUE, si la lista está vacía; o FALSE
     */
    public boolean estaVacia() {
        return numElementos == 0;
    }
}
