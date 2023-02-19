package com.alura.vista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author JOSE
 */
public class Clase3 {
    
    public static void main(String[] args) {
        String curso1 = "Geometria";
        String curso2 = "Fisica";
        String curso3 = "Quimica";
        String curso4 = "Historia";

        ArrayList<String> cursos = new ArrayList<>();

        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        System.out.println(cursos);
        
        //ordenar lista en forma ascendente
        Collections.sort(cursos);
        System.out.println(cursos);
        
        //ordenar lista en forma ascendente con Comparator
        cursos.sort(Comparator.naturalOrder());
        System.out.println(cursos);
        
        //ordenar ascendente con stream
        List<String> cursosList = cursos.stream().sorted().collect(Collectors.toList());
        System.out.println(cursosList);
        
        //ordenar lista en forma descendente
        Collections.sort(cursos, Collections.reverseOrder());
        System.out.println(cursos);
        
        //ordenar lista en forma descendente con Comparator
        cursos.sort(Comparator.reverseOrder());
        System.out.println(cursos);
        
        //ordenar descendente con stream
        List<String> cursosList2 = cursos.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(cursosList2);
    }
}
