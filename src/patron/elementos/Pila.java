package patron.elementos;

import java.util.ArrayList;

/**
 * Clase Pila.
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
        int longitud = arrayPila.size();
        if (longitud > 0) {
            arrayPila.remove(longitud - 1);
        }
    }
}
