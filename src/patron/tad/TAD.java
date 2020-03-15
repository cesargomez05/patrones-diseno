package patron.tad;

/**
 *
 * @author César Augusto Gómez.
 */
public interface TAD {

    /**
     * Método para insertar un valor en la lista.
     *
     * @param valor Valor a insertar.
     */
    public void insertar(int valor);

    /**
     * Método para insertar un valor en la lista
     *
     * @param valor Valor a insertar.
     * @param posicion Posición donde se insertará el elemento.
     */
    public void insertarEnPosicion(int valor, int posicion);

    /**
     * Método para listar los valores de la lista.
     */
    public void listarValores();

    /**
     * Método para actualizar el valor en la posición definida.
     *
     * @param valor Valor a actualizar.
     * @param posicion Posición donde se insertará el elemento.
     */
    public void actualizar(int valor, int posicion);

    /**
     * Método para consultar si existe un valor en la lista.
     *
     * @param valor Valor a buscar en la lista.
     */
    public void buscarValor(int valor);

    /**
     * Método para eliminar las ocurrencias de un valor de la lista.
     * @param valor Valor que se desea eliminar.
     */
    public void eliminarPorValor(int valor);
    
    /**
     * Método para eliminar el valor ubicado en la posición definida por parámetro.
     * @param posicion Posición del elemento a eliminar.
     */
    public void eliminarPorPosicion(int posicion);
}
