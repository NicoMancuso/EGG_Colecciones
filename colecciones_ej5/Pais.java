/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones_ej5;

import java.util.Objects;

/**
 *
 * @author N Mancuso
 */
public class Pais implements Comparable<Pais> { // esto significa que nuestra clase Pais se puede comparar con otra clase Pais

    private String nombre;

    public Pais() {

    }

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //sobreescritura de metodos
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;            
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pais other = (Pais) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public String toString(){
        return "\nPais: " +nombre;
    }
    
    @Override
    public int compareTo(Pais o) {
        return this.nombre.compareTo(o.getNombre());
    }
    
    
}
