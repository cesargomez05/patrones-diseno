package patron.elementos;

/**
 *
 * @author César Augusto Gómez.
 */
public interface ElementoI {

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

    /**
     * Método para obtener la longitud de la lista.
     *
     * @return Longitud de la lista.
     */
    public int obtenerLongitud();

    /**
     * Método para validar si la lista se encuentra vacía.
     *
     * @return Valor de verdad que indica si la lista se encuentra vacía.
     */
    public boolean estaVacia();
}