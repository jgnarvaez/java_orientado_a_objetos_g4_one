package com.alura.vista;

import com.alura.modelo.Alumno;
import com.alura.modelo.Curso;
import java.util.Optional;

/**
 *
 * @author JOSE
 */
public class Clase19 {
    
    public static void main(String[] args) {
        
        Curso curso1 = new Curso("Historia", 30);
        
        Alumno alumno1 = new Alumno("Luis Miguel", "001");
        Alumno alumno2 = new Alumno("Pedro Jose", "002");
        Alumno alumno3 = new Alumno("Juan Carlos", "003");
        Alumno alumno4 = new Alumno("Carlos Alberto", "004");
        Alumno alumno5 = new Alumno("Gustavo Sanchez", "005");
        Alumno alumno6 = new Alumno("Maria Martha", "006");
        Alumno alumno7 = new Alumno("Claudia Patricia", "007");
        
        curso1.addAlumno(alumno1);
        curso1.addAlumno(alumno2);
        curso1.addAlumno(alumno3);
        curso1.addAlumno(alumno4);
        curso1.addAlumno(alumno5);
        curso1.addAlumno(alumno6);
        curso1.addAlumno(alumno7);
        
        //curso1.getAlumnos().forEach(alumno -> System.out.println(alumno));
        
        Alumno alumnoMap = curso1.getAlumnoMap().get("003");
        
        curso1.getAlumnoMap().forEach((codigo, alumno) -> {
            System.out.println(alumno);
        });
        
        //System.out.println(alumnoMap);
        
        curso1.getAlumnoMap().put("008", new Alumno("Juan Miguel", "008"));
        curso1.getAlumnoMap().put("009", new Alumno("Maria Jose", "009"));
        curso1.getAlumnoMap().put("010", new Alumno("Luis Pedro", "010"));

        curso1.getAlumnoMap().forEach((codigo, alumno) -> {
            System.out.println(alumno);
        });
    }
}
