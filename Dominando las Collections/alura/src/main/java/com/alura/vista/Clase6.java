package com.alura.vista;

import com.alura.modelo.Aula;
import com.alura.modelo.Curso;
import java.util.ArrayList;

/**
 *
 * @author JOSE
 */
public class Clase6 {
    public static void main(String[] args) {
        
        Curso curso1 = new Curso("Java", 30);
        curso1.addAula(new Aula("ArrayList"));
        curso1.addAula(new Aula("List"));
        curso1.addAula(new Aula("LinkedList"));
        
        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        
        System.out.println(cursos.get(0).getAulaList()); //sobre-escribir tostring en clase curso
    }
}
