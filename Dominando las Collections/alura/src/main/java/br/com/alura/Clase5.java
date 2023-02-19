package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author JOSE
 */
public class Clase5 {
    
    public static void main(String[] args) {
        
        Curso curso1 = new Curso("PHP", 30);
        Curso curso2 = new Curso("Ruby", 10);
        Curso curso3 = new Curso("Java", 20);
        Curso curso4 = new Curso("JavaScript", 50);
        
        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        System.out.println(cursos); //sobre-escribir tostring en clase curso
        
        /*ordenar ascendente sobre-escribir compareTo en clase curso
        Collections.sort(cursos);
        System.out.println(cursos);
        
        ordenar descendente sobre-escribir compareTo en clase curso
        Collections.sort(cursos, Collections.reverseOrder());
        System.out.println(cursos);*/
        
        cursos.sort(Comparator.comparing(Curso::getNombre));
        System.out.println(cursos);
        
        Collections.sort(cursos, Comparator.comparing(Curso::getNombre));
        System.out.println(cursos);
        
        Collections.sort(cursos, Comparator.comparing(Curso::getNombre).reversed());
        System.out.println(cursos);
        
        //ordenar por tiempo
        List<Curso> cursoList = cursos.stream().sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());
        System.out.println(cursoList);
        
        //ordenar por tiempo
        List<Curso> cursoList2 = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Ruby")).sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());
        System.out.println(cursoList2);
        
        List<Curso> cursoList3 = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("PHP")).sorted(Comparator.comparing(Curso::getNombre).reversed()).collect(Collectors.toList());
        System.out.println(cursoList3);
    }
}
