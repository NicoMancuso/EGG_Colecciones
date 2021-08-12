
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * TCrear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista
de tipo Integer con sus 3 notas.
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Despues de ese bluce tendremos el siguiente método en la clase Alumno:
Metodo notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular
su nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al
método. Dentro del método se usará la lista notas para calcular el promedio final
de alumno. Siendo este promedio final, devuelto por el método y mostrado en el
main.
Ejemplo de una colección como atributo: ColeccionAtributo
 */
/**
 *
 * @author N Mancuso
 */
public class SeccionAlumnos_APP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        DecimalFormat df = new DecimalFormat("#.##");       //utilidad para que los doubles tengan 2 decimales
        Alumno datos = new Alumno();                        //creador de alumno
        ArrayList<Alumno> unificar = new ArrayList();       //arma con el nombre y las 3 notas un "alumno"

        System.out.println("--------------SECCION ALUMNOS--------------");
        String verif;                                       //condicion para que salga del loop
        do {
            Alumno Datos_Creados = datos.Crear();
            unificar.add(Datos_Creados);
            System.out.println("¿Desea guardar los datos de otro alumno?");
            verif = sc.next();
        } while (verif.toUpperCase().equals("S"));          //usamos toUpperCase por si el input = "s"

//PROMEDIO del alumno seleccionado
        System.out.println("--------------Promedios--------------");
        System.out.println("Ingrese el nombre del alumno para "
                + "saber su promedio.");
        String Name = sc.next();
        double Promedio = 0;

        for (Alumno aux : unificar) {
            if (Name.equals(aux.getNombre())) {
                Promedio = aux.notaFinal(Name);
                System.out.println("El promedio del alumno " + Name.toUpperCase() + " es " + df.format(Promedio));
            } else {
                System.out.println("El alumno no figura en la base de datos");
               
            }
        }

    }

}
