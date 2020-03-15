package patron.elementos;

import java.util.ArrayList;

/**
 *
 * @author César Augusto Gómez.
 */
public class Cola implements ElementoTAD {

    ArrayList<Integer> arrayCola;

    public Cola() {
        arrayCola = new ArrayList<>();
    }

    @Override
    public void agregar(int valor) {
        arrayCola.add(valor);
    }

    @Override
    public void sacar() {
        if (!estaVacia()) {
            arrayCola.remove(0);
        }
    }

    @Override
    public int obtenerLongitud() {
        return arrayCola.size();
    }

    @Override
    public boolean estaVacia() {
        return obtenerLongitud() > 0;
    }
}
