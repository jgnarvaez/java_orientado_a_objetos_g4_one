package com.alura.vista;

import java.util.Collection;
import java.util.HashSet;

/**
 *
 * @author JOSE
 */
public class Clase12 {
    
    // TODO: https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html
    // TODO: https://docs.oracle.com/javase/8/docs/api/index.html?java/util/Collection.html
    
    public static void main(String[] args) {
        
        String alumno1 = "Luis Miguel";
        String alumno2 = "Pedro Jose";
        String alumno3 = "Juan Carlos";
        String alumno4 = "Carlos Alberto";
        String alumno5 = "Gustavo Sanchez";
        String alumno6 = "Maria Martha";
        String alumno7 = "Maria Martha";
        String alumno8 = "Gustavo Sanchez";
        
        Collection<String> listaAlumnos = new HashSet<>();
        
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);
        listaAlumnos.add(alumno7);
        listaAlumnos.add(alumno8);
        
        /*for (String alumno : listaAlumnos) {
            System.out.println(alumno);
        }*/
        
        listaAlumnos.forEach(alumno -> {
            System.out.println(alumno);
        });
    }
}
