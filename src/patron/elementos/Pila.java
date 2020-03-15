package patron.elementos;

import java.util.ArrayList;

/**
 *
 * @author César Augusto Gómez.
 */
public class Pila extends ElementoTAD {

    @Override
    public void sacar() {
        int longitud = obtenerLongitud();
        if (!estaVacia()) {
            arrayList.remove(longitud - 1);
        }
    }
}
