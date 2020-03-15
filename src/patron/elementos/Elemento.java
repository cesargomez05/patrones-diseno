package patron.elementos;

import java.util.ArrayList;

/**
 *
 * @author César Augusto Gómez.
 */
public abstract class Elemento {

    ArrayList<Integer> arrayList;

    public Elemento() {
        arrayList = new ArrayList<>();
    }

    public void agregar(int valor) {
        arrayList.add(valor);
    }

    public void sacar() {
        // Se debe sobreescribir en cada una de las clases
    }

    public int obtenerLongitud() {
        return arrayList.size();
    }

    public boolean estaVacia() {
        return obtenerLongitud() > 0;
    }
}
