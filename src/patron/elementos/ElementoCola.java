package patron.elementos;

/**
 *
 * @author César Augusto Gómez.
 */
public class ElementoCola extends Elemento {

    @Override
    public void sacar() {
        if (!estaVacia()) {
            arrayList.remove(0);
        }
    }
}
