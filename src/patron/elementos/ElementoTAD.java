package patron.elementos;

import java.util.ArrayList;

/**
 *
 * @author César
 */
public abstract class ElementoTAD implements TAD {

    ArrayList<Integer> arrayList;

    public ElementoTAD() {
        arrayList = new ArrayList<>();
    }

    @Override
    public void agregar(int valor) {
        arrayList.add(valor);
    }

    @Override
    public void sacar() {
        
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
