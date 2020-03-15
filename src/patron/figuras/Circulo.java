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
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}
