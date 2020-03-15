package patron.elementos;

/**
 *
 * @author César Augusto Gómez.
 */
public class ElementoCola extends Elemento {

    @Override
    public void sacar() throws ElementoException {
        if (!estaVacia()) {
            arrayList.remove(0);
        }
    }

    @Override
    public int obtenerElemento() throws ElementoException {
        if (!estaVacia()) {
            return arrayList.get(0);
        }
        throw new ElementoException();
    }
}
