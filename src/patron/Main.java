package patron;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author César
 */
public class Main {
    
    public static void main(String[] args) {
        //TAD miTAD = new Pila();
        TAD miTAD = new Cola();
        Random rand = new Random();
        
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        int opcion, valor, posicion; //Guardaremos la opcion del usuario

        String message = "Ingresa la opción a ejecutar:\n"
                + "1. Insertar\n"
                + "2. Insertar en posición\n"
                + "3. Listar valores\n"
                + "4. Actualizar\n"
                + "5. Buscar\n"
                + "6. Eliminar por valor\n"
                + "7. Eliminar por posición\n"
                + "0. Salir";
        
        while (!salir) {
            System.out.println(message);
            try {
                System.out.println("Escribe una de las opciones");
                opcion = scanner.nextInt();
                
                switch (opcion) {
                    case 0:
                        salir = true;
                        break;
                    case 1:
                        valor = rand.nextInt(100);
                        miTAD.insertar(valor);
                        break;
                    case 2:
                        valor = rand.nextInt(100);
                        posicion = rand.nextInt(miTAD.obtenerLongitud());
                        miTAD.insertarEnPosicion(valor, posicion);
                        break;
                    case 3:
                        miTAD.listarValores();
                        break;
                    case 4:
                        valor = rand.nextInt(100);
                        posicion = rand.nextInt(miTAD.obtenerLongitud());
                        miTAD.actualizar(valor, posicion);
                        break;
                    case 5:
                        valor = rand.nextInt(100);
                        miTAD.buscarValor(valor);
                        break;
                    case 6:
                        valor = rand.nextInt(100);
                        miTAD.eliminarPorValor(valor);
                        break;
                    case 7:
                        posicion = rand.nextInt(miTAD.obtenerLongitud());
                        miTAD.eliminarPorPosicion(posicion);
                        break;
                    default:
                        System.out.println("La opción ingresada no es válida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                scanner.next();
            }
        }
    }
}
