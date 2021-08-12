/*
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
String. El programa pedirá una raza de perro en un bucle, el mismo se guardará
en la lista y después se le preguntará al usuario si quiere guardar otro perro o si
quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList.
 */
package colecciones_ej1;

import java.util.Scanner;

/**
 *
 * @author N Mancuso
 */
public class Colecciones_EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Servicio newServ = new Servicio();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int opc;
        do {
            System.out.println("");
            System.out.println("-------MASCOTA LOGGER 9000-------");
            System.out.println("1- Ingresa Mascota");
            System.out.println("2- Exit");
            System.out.println("----------------------------------");
            System.out.println("");
            opc = sc.nextInt();
            

            switch (opc) {
                case 1:
                    newServ.crearMascota();
                    break;
                case 2:
                    newServ.mostrarMascotas();
                    break;

                default:
                    System.out.println("Opcion incorrecta, digite nuevamente");

            }

        } while ((opc < 2));
    }

}
