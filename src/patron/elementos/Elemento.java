package patron.elementos;

import java.util.ArrayList;

/**
 *
 * @author César Augusto Gómez.
 */
public abstract class Elemento {

    ArrayList<Integer> arrayList;

    public Elemento() {
        arrayList = new ArrayList<>();
    }

    /**
     * Método para agregar un elemento en la lista.
     *
     * @param valor Valor a insertar.
     */
    public void agregar(int valor) {
        arrayList.add(valor);
    }

    /**
     * Método para obtener el elemento accesible de la lista.
     *
     * @return Elemento visible de la lista.
     * @throws java.lang.Exception
     */
    public abstract int obtenerElemento() throws Exception;

    /**
     * Método para sacar el elemento de la lista.
     *
     * @throws java.lang.Exception
     */
    public abstract void sacar() throws Exception;

    /**
     * Método que permite validar si la lista se encuentra vacía.
     *
     * @return TRUE, si la lista está vacía; o FALSE
     */
    public boolean estaVacia() {
        return arrayList.isEmpty();
    }
}
