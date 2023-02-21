package com.aluracursos.modelo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author JOSE
 */

//Aquí pasaremos los elementos que se pueden anotar con esta anotación.
@Target(ElementType.FIELD)
//Aquí hablaremos de nuestra aplicación hasta que nuestra anotación esté disponible.
@Retention(RetentionPolicy.RUNTIME)
public @interface EdadMinima {
    
    int valor();
    
}
