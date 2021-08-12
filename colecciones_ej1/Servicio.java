/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
String. El programa pedirá una raza de perro en un bucle, el mismo se guardará
en la lista y después se le preguntará al usuario si quiere guardar otro perro o si
quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList.
*/
package colecciones_ej1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author N Mancuso
 */
public class Servicio {
    private Scanner sc = new Scanner (System.in).useDelimiter("\n");
    
     private ArrayList<String> mascotas = new ArrayList<String>(); //con esto armamos las lista de nombres de mascotas
    
    //constructor con el Array

    public Servicio() {
        this.mascotas = new ArrayList();
    }

    public void crearMascota() {
        System.out.println("Introducir nombre");
        String nombre = sc.next();
        System.out.println("Introducir raza");
        String raza = sc.next();
        String mascotaIngresada = nombre+", "+raza+".";
        mascotas.add(mascotaIngresada);
    }
    
    public void mostrarMascotas () {
        System.out.println("Los perros ingresados son: ");
        for (String aux : mascotas) {
            System.out.println(aux);
        }
        
    }
    
    
    
    
}
