package patron.elementos;

/**
 *
 * @author César Augusto Gómez.
 */
public class ElementoPila extends Elemento {

    @Override
    public void sacar() throws Exception {
        if (!estaVacia()) {
            int longitud = arrayList.size();
            arrayList.remove(longitud - 1);
        } else {
            throw new Exception("No hay elementos en la lista");
        }
    }

    @Override
    public int obtenerElemento() throws Exception {
        if (!estaVacia()) {
            int longitud = arrayList.size();
            return arrayList.get(longitud - 1);
        }
        throw new Exception("No hay elementos en la lista");
    }
}
