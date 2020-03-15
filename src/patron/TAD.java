package patron;

/**
 *
 * @author César
 */
public interface TAD {

    /**
     * Método para insertar un valor al final de la lista.
     *
     * @param valor Valor a insertar
     */
    public void insertar(int valor);

    /**
     * Método para insertar un valor en una determinada posición de la lista
     *
     * @param valor Valor a insertar.
     * @param posicion Posición de la lista donde se insertará el elemento.
     */
    public void insertarEnPosicion(int valor, int posicion);

    /**
     * Método para listar los valores existentes en la lista.
     */
    public void listarValores();

    /**
     * Método para actualizar un valor de la lista.
     *
     * @param valor Valor a actualizar.
     * @param posicion Posición de la lista donde se actualizará el elemento.
     */
    public void actualizar(int valor, int posicion);

    /**
     * Método para bu
     * @param valor 
     */
    public void buscarValor(int valor);

    public void eliminarPorValor(int valor);

    public void eliminarPorPosicion(int posicion);
}
