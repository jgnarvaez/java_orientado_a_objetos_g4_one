package com.aluracursos.vista;

import com.aluracursos.modelo.EdadMinima;
import com.aluracursos.modelo.Usuario;
import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 *
 * @author JOSE
 */
public class Principal {

    public static void main(String[] args) {
        
        Usuario usuario = new Usuario("Maria", "52902488033", LocalDate.of(2010, Month.JANUARY, 13));
        System.out.println(validador(usuario));
        
    }
    
    public static <T> boolean validador(T objeto) {
        Class<?> clase = objeto.getClass();
        for (Field field : clase.getDeclaredFields()) {
            if (field.isAnnotationPresent(EdadMinima.class)) {
                EdadMinima edadMinima = field.getAnnotation(EdadMinima.class);
                try {
                    field.setAccessible(true);
                    LocalDate fechaNacimiento = (LocalDate) field.get(objeto);
                    return Period.between(fechaNacimiento, LocalDate.now()).getYears() >= edadMinima.valor();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }
}
