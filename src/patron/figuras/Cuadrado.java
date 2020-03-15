package patron.figuras;

/**
 *
 * @author César
 */
public class Cuadrado implements Figura {

    private int longitud;

    public Cuadrado() {
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public void solicitarInformacion() {

    }

    @Override
    public void mostrarDimensiones() {
        System.out.println("Información del cuadrado:");
        System.out.println("Longitud: " + longitud);
    }

    @Override
    public double calcularPerimetro() {
        return 4 * longitud;
    }

    @Override
    public double calcularArea() {
        return 2 * longitud;
    }
}
