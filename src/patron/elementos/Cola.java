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
        int longitud = arrayCola.size();
        if (longitud > 0) {
            arrayCola.remove(0);
        }
    }
}
