package patron.elementos;

/**
 *
 * @author César Augusto Gómez.
 */
public interface ElementoTAD {

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
