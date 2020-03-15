package patron.figuras;

/**
 * @author César Augusto Gómez
 */
public interface Figura {

    /**
     * Función que muestra las dimensiones de la figura
     */
    public void mostrarDimensiones();

    /**
     * Función que calculará el perímetro de la figura
     * @return Valor del perímetro
     */
    public double calcularPerimetro();

    /**
     * Función que calculará el área de la figura
     * @return Valor del área
     */
    public double calcularArea();
}
