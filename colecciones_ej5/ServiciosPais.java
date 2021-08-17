/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones_ej5;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author N Mancuso
 */
public class ServiciosPais {

    private static Scanner sc;
    private static Set<Pais> alMundo; //creo mi coleccion de Objetos PAIS

    public ServiciosPais() {
        ServiciosPais.sc = new Scanner(System.in).useDelimiter("\n");
        ServiciosPais.alMundo = new TreeSet(); //para que se ORDENE solo implemento el conjunto como TreeSet
    }

    private Pais creaPais() {
        System.out.println("Ingrese el nombre del país");
        String nomb = sc.next().toUpperCase();
        return new Pais(nomb);
    }

    public void creaMundo() {
        char op;
        do {
            alMundo.add(creaPais());
            System.out.println("¿Desea agregar otro país? [S/N]");
            op = sc.next().toUpperCase().charAt(0); //está bueno el uso del charAt porque el user puede tipear un "sOFHGGFHFGH"
        } while (op != 'N');
        muestraMundo();

    }

    private void muestraMundo() {
        alMundo.forEach(System.out::println);
    }

    public void searchAndDestroy() {
        boolean flag = true;
        Iterator<Pais> it = alMundo.iterator(); //iterador de paises del conjunto almundo
        System.out.println("Ingrese el país a buscar y a eliminar de la lista");
        String buscado = sc.next().toUpperCase();

        /* con it.next() obtengo el objeto de la calse pais de las iteraciones entonces con un condicional
        puedo preguntar si el nombre del objeto que me da el iterator es igual al nombre buscado
        si el condicional es true con it.remove(); saco el objeto
         */
        while (it.hasNext()) {
            if (it.next().getNombre().equals(buscado)) {
                it.remove();
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Encontré al país //"+buscado+ "// y lo eliminé del Mundo");
        } else {
            System.out.println("//"+buscado+ "// no es parte del Mundo");
        }
        muestraMundo();
    }

}
