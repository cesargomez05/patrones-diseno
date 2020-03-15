package patron.elementos;

/**
 *
 * @author César Augusto Gómez.
 */
public class ElementoCola extends Elemento {

    @Override
    public void sacar() {
        int longitud = obtenerLongitud();
        if (longitud > 0) {
            arrayList.remove(0);
        }
    }
}
