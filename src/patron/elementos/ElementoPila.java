package patron.elementos;

/**
 *
 * @author César Augusto Gómez.
 */
public class ElementoPila extends Elemento {

    @Override
    public void sacar() {
        int longitud = obtenerLongitud();
        if (!estaVacia()) {
            arrayList.remove(longitud - 1);
        }
    }
}
