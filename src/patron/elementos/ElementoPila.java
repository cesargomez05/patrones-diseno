package patron.elementos;

/**
 *
 * @author César Augusto Gómez.
 */
public class ElementoPila extends Elemento {

    @Override
    public void sacar() {
        if (!estaVacia()) {
            int longitud = arrayList.size();
            arrayList.remove(longitud - 1);
        }
    }
}
