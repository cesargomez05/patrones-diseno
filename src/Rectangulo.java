/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        int resultado = 2 * base + 2 * altura;
        System.out.println("Perímetro del rectángulo:");
    }

    @Override
    public void calcularArea() {

    }
}
