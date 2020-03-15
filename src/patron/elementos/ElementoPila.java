package patron.elementos;

/**
 *
 * @author César Augusto Gómez.
 */
public class ElementoPila extends Elemento {

    @Override
    public void sacar() throws ElementoException {
        if (!estaVacia()) {
            int longitud = arrayList.size();
            arrayList.remove(longitud - 1);
        }
    }

    @Override
    public int obtenerElemento() throws ElementoException {
        if (!estaVacia()) {
            int longitud = arrayList.size();
            return arrayList.get(longitud - 1);
        }
        throw new ElementoException();
    }
}
