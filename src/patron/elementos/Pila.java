package patron.elementos;

import java.util.ArrayList;

/**
 *
 * @author César Augusto Gómez.
 */
public class Pila implements ElementoTAD {

    ArrayList<Integer> arrayPila;

    public Pila() {
        arrayPila = new ArrayList<>();
    }

    @Override
    public void agregar(int valor) {
        arrayPila.add(valor);
    }

    @Override
    public void sacar() {
        int longitud = obtenerLongitud();
        if (!estaVacia()) {
            arrayPila.remove(longitud - 1);
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
}
