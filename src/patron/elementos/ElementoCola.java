package patron.elementos;

/**
 *
 * @author César Augusto Gómez.
 */
public class ElementoCola extends Elemento {

    @Override
    public void sacar() throws Exception {
        if (!estaVacia()) {
            arrayList.remove(0);
        } else {
            throw new Exception("No hay elementos en la lista");
        }
    }

    @Override
    public int obtenerElemento() throws Exception {
        if (!estaVacia()) {
            return arrayList.get(0);
        }
        throw new Exception("No hay elementos en la lista");
    }
}
