package patron;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author César
 */
public class Main {

    public static void main(String[] args) {
        //TAD miTAD = new Pila();
        TAD miTAD = new Cola();

        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        String message = "Ingresa la opción a ejecutar:\n"
                + "1. Insertar\n"
                + "2. Insertar en posición\n"
                + "3. Listar valores\n"
                + "4. Actualizar\n"
                + "5. Buscar\n"
                + "6. eliminarPorValor\n"
                + "7. eliminarPorPosicion\n"
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

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:

                        break;
                    case 6:

                        break;
                    case 7:

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
