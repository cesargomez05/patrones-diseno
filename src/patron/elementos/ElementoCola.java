package patron.elementos;

/**
 *
 * @author César Augusto Gómez.
 */
public class ElementoCola extends Elemento {

    @Override
    public void agregar(int valor) {
        arrayList.add(valor);
        numElementos++;
    }

    @Override
    public void sacar() throws Exception {
        if (!estaVacia()) {
            arrayList.remove(posicionPivote);
            numElementos--;
        } else {
            throw new Exception("No hay elementos en la lista");
        }
    }
}
