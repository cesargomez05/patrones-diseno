package patron.tad;

import patron.elementos.Elemento;

/**
 *
 * @author César Augusto Gómez.
 */
public abstract class TAD {

    Elemento listaElementos;

    /**
     * Método para insertar un valor en la lista.
     *
     * @param valor Valor a insertar.
     */
    public void insertar(int valor) {
        System.out.println("Insertando: " + valor);
        listaElementos.agregar(valor);
    }

    /**
     * Método para insertar un valor en la lista.
     *
     * @param valor Valor a insertar.
     * @param posicion Posición donde se insertará el elemento.
     */
    public void insertarEnPosicion(int valor, int posicion) {
        if (posicion >= 0) {
            try {
                // Se crea una nueva instancia de la lista de elementos
                Elemento listaTemp = listaElementos.getClass().newInstance();

                int contador = 0;

                // Se recorre la lista
                while (!listaElementos.estaVacia()) {
                    try {
                        listaTemp.agregar(listaElementos.obtenerElemento());
                        listaElementos.sacar();
                        contador++;
                    } catch (Exception ex) {
                        break;
                    }
                }

                
                /*
                // Se valida si el valor de la posición es menor o igual al N° de elementos de la lista
                if (posicion <= contador) {
                    contador = 0;

                    // Se recorre la lista temporal
                    while (!listaTemp.estaVacia()) {
                        try {
                            if (posicion == contador) {
                                listaElementos.agregar(valor);
                            }
                            listaElementos.agregar(listaTemp.obtenerElemento());
                            listaTemp.sacar();
                            contador++;
                        } catch (Exception ex) {
                            break;
                        }
                    }

                    // Se retorna al llamado de la función
                    return;
                }*/
            } catch (InstantiationException | IllegalAccessException ex) {
                System.out.println("Hubo un error al ejecutar la función insertarEnPosicion");
                System.out.println(ex.getMessage());
                // Se retorna al llamado de la función
                return;
            }
        }

        System.out.println("La posición " + posicion + " donde desea insertar el elemento está fuera del rango permitido");
    }

    /**
     * Método para listar los valores de la lista.
     */
    public void listarValores() {
        if (listaElementos.estaVacia()) {
            System.out.println("La lista de elementos está vacia.");
        } else {
            try {
                // Se crea una nueva instancia de la lista de elementos
                Elemento listaTemp = listaElementos.getClass().newInstance();

                System.out.println("Listando elementos");

                // Se recorre la lista
                while (!listaElementos.estaVacia()) {
                    try {
                        listaTemp.agregar(listaElementos.obtenerElemento());
                        listaElementos.sacar();
                    } catch (Exception ex) {
                        break;
                    }
                }

                int valor;
                // Se recorre la lista temporal
                while (!listaTemp.estaVacia()) {
                    try {
                        valor = listaTemp.obtenerElemento();
                        System.out.println(valor);
                        listaElementos.agregar(valor);
                        listaTemp.sacar();
                    } catch (Exception ex) {
                        break;
                    }
                }
            } catch (InstantiationException | IllegalAccessException ex) {
                System.out.println("Hubo un error al ejecutar la función listarValores");
                System.out.println(ex.getMessage());
            }
        }
    }

    /**
     * Método para actualizar el valor en la posición definida.
     *
     * @param valor Valor a actualizar.
     * @param posicion Posición donde se insertará el elemento.
     */
    public void actualizar(int valor, int posicion) {
        if (posicion >= 0) {
            try {
                // Se crea una nueva instancia de la lista de elementos
                Elemento listaTemp = listaElementos.getClass().newInstance();

                int contador = 0;

                // Se recorre la lista
                while (!listaElementos.estaVacia()) {
                    try {
                        listaTemp.agregar(listaElementos.obtenerElemento());
                        listaElementos.sacar();
                        contador++;
                    } catch (Exception ex) {
                        break;
                    }
                }

                /*
                // Se valida si el valor de la posición es menor o igual al N° de elementos de la lista
                if (posicion <= contador) {
                    contador = 0;

                    // Se recorre la lista temporal
                    while (!listaTemp.estaVacia()) {
                        try {
                            if (posicion == contador) {
                                listaElementos.agregar(valor);
                            }
                            listaElementos.agregar(listaTemp.obtenerElemento());
                            listaTemp.sacar();
                            contador++;
                        } catch (Exception ex) {
                            break;
                        }
                    }

                    // Se retorna al llamado de la función
                    return;
                }*/
            } catch (InstantiationException | IllegalAccessException ex) {
                System.out.println("Hubo un error al ejecutar la función insertarEnPosicion");
                System.out.println(ex.getMessage());
                // Se retorna al llamado de la función
                return;
            }
        }

        System.out.println("La posición " + posicion + "donde desea insertar el elemento está fuera del rango permitido");
    }

    /**
     * Método para consultar si existe un valor en la lista.
     *
     * @param valor Valor a buscar en la lista.
     */
    public void buscarValor(int valor) {
        if (listaElementos.estaVacia()) {
            System.out.println("La lista de elementos está vacia.");
        } else {

        }
    }

    /**
     * Método para eliminar las ocurrencias de un valor de la lista.
     *
     * @param valor Valor que se desea eliminar.
     */
    public void eliminarPorValor(int valor) {
        if (listaElementos.estaVacia()) {
            System.out.println("La lista de elementos está vacia.");
        } else {

        }
    }

    /**
     * Método para eliminar el valor ubicado en la posición definida por
     * parámetro.
     *
     * @param posicion Posición del elemento a eliminar.
     */
    public void eliminarPorPosicion(int posicion) {
        if (listaElementos.estaVacia()) {
            System.out.println("La lista de elementos está vacia.");
        } else {

        }
    }
}
