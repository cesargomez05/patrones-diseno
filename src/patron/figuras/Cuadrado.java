package patron.figuras;

/**
 *
 * @author César
 */
public class Cuadrado implements Figura {

    private int longitud;

    public Cuadrado(int longitud) {
        this.setLongitud(longitud);
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public void mostrarDimensiones() {
        System.out.println("Información del cuadrado:");
        System.out.println("Longitud: " + longitud);
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
