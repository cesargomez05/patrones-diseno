package patron.figuras;

/**
 *
 * @author César
 */
public class Rectangulo implements Figura {

    private int base, altura;

    public Rectangulo() {
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public void solicitarInformacion() {

    }

    @Override
    public void mostrarDimensiones() {
        System.out.println("Información del rectángulo:");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * base + 2 * altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
