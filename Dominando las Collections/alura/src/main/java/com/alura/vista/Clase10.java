package com.alura.vista;

import com.alura.modelo.Curso;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author JOSE
 */
public class Clase10 {
    
    public static void main(String[] args) {
        
        Curso curso1 = new Curso("Historia", 30);
        Curso curso2 = new Curso("Algebra", 10);
        Curso curso3 = new Curso("Aritmetica", 20);
        Curso curso4 = new Curso("Geometria", 50);
        Curso curso5 = new Curso("Fisica", 60);
        Curso curso6 = new Curso("Quimica", 80);
        Curso curso7 = new Curso("Literatura",70);
        Curso curso8 = new Curso("Fisica", 30);
        
        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        cursos.add(curso5);
        cursos.add(curso6);
        cursos.add(curso7);
        cursos.add(curso8);
        //System.out.println(cursos);
        
        //suma de tiempos
        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).sum());
        
        //promedio
        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).average().getAsDouble());
        
        //maximo
        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt());
        
        //minimo
        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).min().getAsInt());
        
        //agrupar
        Map<String, List<Curso>> groupCurso = cursos.stream().collect(Collectors.groupingBy(Curso::getNombre));
        
        //key lo repetido
        groupCurso.forEach((key , value) -> System.out.println(key));
        
        groupCurso.forEach((key , value) -> System.out.println(key + " - " + value.size()));
        
        //parallelStream para sumar
        System.out.println(cursos.parallelStream().mapToInt(Curso::getTiempo).sum());
        
        System.out.println(cursos.parallelStream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Geometria")).mapToInt(Curso::getTiempo).sum());
    }
}
