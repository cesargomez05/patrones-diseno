package patron.elementos;

/**
 *
 * @author César Augusto Gómez.
 */
public class ElementoPila extends Elemento {

    @Override
    public void agregar(int valor) {
        arrayList.add(valor);
        numElementos++;
        if (numElementos > 1) {
            posicionPivote++;
        }
    }

    @Override
    public void sacar() throws Exception {
        if (!estaVacia()) {
            arrayList.remove(posicionPivote);
            numElementos--;
            if (posicionPivote > 0) {
                posicionPivote--;
            }
        } else {
            throw new Exception("No hay elementos en la lista");
        }
    }
}
