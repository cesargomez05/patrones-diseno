package patron;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import patron.tad.*;

/**
 *
 * @author César Augusto Gómez.
 */
public class Main {

    public static void main(String[] args) {
        TAD miTAD = new TADPila();
        //TAD miTAD = new Cola();

        Scanner scanner = new Scanner(System.in);
        Scanner scannerValores = new Scanner(System.in);
        boolean salir = false;
        int opcion, valor, posicion; //Guardaremos la opcion del usuario

        while (!salir) {
            System.out.println("Ingresa la opción a ejecutar:\n"
                    + "1. Insertar\n"
                    + "2. Insertar en posición\n"
                    + "3. Listar valores\n"
                    + "4. Actualizar\n"
                    + "5. Buscar\n"
                    + "6. Eliminar por valor\n"
                    + "7. Eliminar por posición\n"
                    + "0. Salir");

            try {
                System.out.println("Escribe una de las opciones");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 0:
                        salir = true;
                        break;
                    case 1:
                        System.out.println("Ingrese el valor a insertar");
                        valor = scannerValores.nextInt();
                        miTAD.insertar(valor);
                        break;
                    case 2:
                        System.out.println("Ingrese el valor a insertar");
                        valor = scannerValores.nextInt();
                        System.out.println("Ingrese la posicion donde se insertará valor");
                        posicion = scannerValores.nextInt();
                        miTAD.insertarEnPosicion(valor, posicion);
                        break;
                    case 3:
                        miTAD.listarValores();
                        break;
                    case 4:
                        
                        
                        /*if (miTAD.estaVacia()) {
                            System.out.println("La lista no tiene elementos para actualizar");
                        } else {
                            valor = rand.nextInt(100);
                            posicion = rand.nextInt(miTAD.obtenerLongitud());
                            miTAD.actualizar(valor, posicion);
                        }*/
                        break;
                    case 5:
                        /*valor = rand.nextInt(100);
                        miTAD.buscarValor(valor);*/
                        break;
                    case 6:
                        /*valor = rand.nextInt(100);
                        miTAD.eliminarPorValor(valor);*/
                        break;
                    case 7:
                        /*
                        if (miTAD.estaVacia()) {
                            System.out.println("La lista no tiene elementos para eliminar");
                        } else {
                            posicion = rand.nextInt(miTAD.obtenerLongitud());
                            miTAD.eliminarPorPosicion(posicion);
                        }*/
                        break;
                    default:
                        System.out.println("La opción ingresada no es válida");
                }
                System.out.println("Haga clic en");
                System.in.read();
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                scanner.next();
            } catch (IOException ex) {
                System.out.println("Hubo un error al ejecutar el programa");
                scanner.next();
            }
        }
    }
}
