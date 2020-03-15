package patron.figuras;

/**
 *
 * @author César
 */
public class Circulo implements Figura {

    private int radio;

    public Circulo(int radio) {
        this.setRadio(radio);
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public void mostrarDimensiones() {
        System.out.println("Información del círculo:");
        System.out.println("Radio: " + radio);
    }

    @Override
    public void calcularPerimetro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void calcularArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
