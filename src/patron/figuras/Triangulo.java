package patron.figuras;

/**
 *
 * @author César
 */
public class Triangulo implements Figura {

    private int longitud;

    public Triangulo() {
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public void solicitarInformacion() {

    }

    @Override
    public void mostrarDimensiones() {
        System.out.println("Información del triángulo:");
        System.out.println("Longitud: " + longitud);
    }

    @Override
    public double calcularPerimetro() {
        return 3 * longitud;
    }

    @Override
    public double calcularArea() {
        return (Math.sqrt(3) * longitud) / 2;
    }
}
