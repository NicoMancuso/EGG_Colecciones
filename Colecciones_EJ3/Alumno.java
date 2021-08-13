
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * La clase Alumno tendrá como atributos, su nombre y una lista
de tipo Integer con sus 3 notas.
 */
/**
 *
 * @author N Mancuso
 */
public class Alumno {

    private Scanner sc;
    private String nombre;
    private ArrayList<Double> notas;
DecimalFormat df = new DecimalFormat("#.##");

    public Alumno() {
        this.notas = new ArrayList();
        this.sc = new Scanner(System.in).useDelimiter("\n");
    }

    public Alumno(String nombre, ArrayList<Double> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public Alumno Crear() {
        ArrayList<Double> notas = new ArrayList();
        System.out.println("Nombre del alumno a ingresar en la base de datos");
        nombre = sc.next();
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese nota "+(i+1)+":");
            notas.add(sc.nextDouble());
        }
        return new Alumno(nombre, notas);
    }

    public double notaFinal(String N) {
        double Resultado = ((notas.get(0)+notas.get(1)+notas.get(2))/3);
        return Resultado;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre= " + nombre.toUpperCase() + ", notas = " + notas + '}';
    }

    
    
}
