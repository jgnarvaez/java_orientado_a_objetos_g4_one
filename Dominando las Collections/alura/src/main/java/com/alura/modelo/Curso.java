package com.alura.modelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author JOSE
 */
public class Curso {
    
    private String nombre;
    private int tiempo;
    private List<Aula> aulaList = new ArrayList<>();
    private Collection<Alumno> alumnos = new HashSet<>();
    //private Collection<Alumno> alumnos = new LinkedHashSet<>();
    private Map<String, Alumno> alumnoMap = new HashMap<>();
    
    public Curso(String nombre, int tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }
    
    public Curso(String nombre, int tiempo, List<Aula> aulaList) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.aulaList = aulaList;
    }    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public List<Aula> getAulaList() {
        return Collections.unmodifiableList(aulaList);
    }

    public Collection<Alumno> getAlumnos() {
        return alumnos;
    }

    public Map<String, Alumno> getAlumnoMap() {
        return alumnoMap;
    }
    
    public void setAulaList(List<Aula> aulaList) {
        this.aulaList = aulaList;
    }
    
    public void addAula(Aula aula) {
        this.aulaList.add(aula);
    }
    
    public void addAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
        this.alumnoMap.put(alumno.getCodigo(), alumno);
    }
    
    public boolean verificaAlumno(Alumno alumno) {
        return this.alumnos.contains(alumno);
    }
    
    @Override
    public String toString(){
       return this.nombre;
    }
    
    
    /*
    para este metodo se necesita:
    public class Curso implements Comparable<Curso>
    @Override
    public int compareTo(Curso o) {
        return this.nombre.compareTo(o.getNombre());
    }*/
    
}
