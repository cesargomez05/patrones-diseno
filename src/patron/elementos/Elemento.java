package patron.elementos;

import java.util.ArrayList;

/**
 *
 * @author César
 */
public abstract class Elemento implements ElementoI {

    ArrayList<Integer> arrayList;

    public Elemento() {
        arrayList = new ArrayList<>();
    }

    @Override
    public void agregar(int valor) {
        arrayList.add(valor);
    }

    @Override
    public void sacar() {
        // Se debe sobreescribir en cada una de las clases
    }

    @Override
    public int obtenerLongitud() {
        return arrayList.size();
    }

    @Override
    public boolean estaVacia() {
        return obtenerLongitud() > 0;
    }
}
