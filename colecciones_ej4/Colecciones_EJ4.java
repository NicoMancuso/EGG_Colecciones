/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
Para esto, tendremos una clase Pelicula con el titulo, director y duración de la
película (en horas). Implemente las clases y métodos necesarios para esta
situación, teniendo en cuenta lo que se pide a continuación:
18
En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
usuario todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario
si quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package colecciones_ej4;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

/**
 *
 * @author N Mancuso muchas gracias Cristian Condori por compartir los
 * ejercicios resueltos!!!
 */
public class Colecciones_EJ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Movie_DB datos = new Movie_DB();
        ArrayList<Movie_DB> join = new ArrayList();

        System.out.println("--------------BLOCKBUSTER--------------");

        String verif;                                       //condicion para que salga del loop
        do {
            Movie_DB movieInput = datos.Create();
            join.add(movieInput);
            System.out.println("Load another movie in the DB? [Y/N]");
            verif = sc.next();
        } while (verif.toUpperCase().equals("Y"));          //usamos toUpperCase por si el input = "s"

        System.out.println("\n  --------Movie details-------- ");
        join.forEach((a) -> System.out.println(a));

        System.out.println("\n  --------Movies 60min+-------- ");
        for (Movie_DB aux : join) {
            if (aux.getDuration() > 60) {
                System.out.println(("" + aux.getTitle() + " de " + aux.getDirector() + " de " + aux.getDuration() + " minutos"));
            } else {
                System.out.println("No movies last more than 60 minutes");
            }

        }

        System.out.println("\n  --Movies duration sorted HIGH to low-- ");
        Collections.sort(join, Movie_Comparators.ByDurAsc);
        join.forEach((a) -> System.out.println(a));

        System.out.println("\n  --Movies duration sorted low to high-- ");
        Collections.sort(join, Movie_Comparators.ByDurDesc);
        join.forEach((a) -> System.out.println(a));

        System.out.println("\n  --Movies ordered by title--");
        Collections.sort(join, Movie_Comparators.sortByTit);
        join.forEach((a) -> System.out.println(a));
       
        System.out.println("\n  --Movies ordered by director--");
        Collections.sort(join, Movie_Comparators.sortByDir);
        join.forEach((a) -> System.out.println(a));
    }

}
