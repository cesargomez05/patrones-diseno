package patron.figuras;

/**
 *
 * @author César
 */
public class Rectangulo implements Figura {

    private int base, altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public void mostrarDimensiones() {
        System.out.println("Información del rectángulo:");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
    }

    @Override
    public void calcularPerimetro() {
        int perimetro = 2 * base + 2 * altura;
        System.out.println("Perímetro del rectángulo: " + perimetro);
    }

    @Override
    public void calcularArea() {
        int area = base * altura;
        System.out.println("Área del rectángulo: " + area);
    }
}
