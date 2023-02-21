package com.alura.vista;

import com.alura.modelo.Alumno;
import java.util.Collection;
import java.util.HashSet;

/**
 *
 * @author JOSE
 */
public class Clase14 {
    
    public static void main(String[] args) {
        
        Alumno alumno1 = new Alumno("Luis Miguel", "001");
        Alumno alumno2 = new Alumno("Pedro Jose", "002");
        Alumno alumno3 = new Alumno("Juan Carlos", "003");
        Alumno alumno4 = new Alumno("Carlos Alberto", "004");
        Alumno alumno5 = new Alumno("Gustavo Sanchez", "005");
        Alumno alumno6 = new Alumno("Maria Martha", "006");
        Alumno alumno7 = new Alumno("Claudia Patricia", "007");

        Collection<Alumno> listaAlumnos = new HashSet<>();

        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);
        listaAlumnos.add(alumno7);
        
        Alumno alumnoNuevo = new Alumno("Luis Miguel", "001");

        System.out.println(alumno1.equals(alumnoNuevo));
        System.out.println(listaAlumnos.contains(alumnoNuevo));
        
    }
}