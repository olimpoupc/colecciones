/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Alumno> listaAlumnos = new ArrayList();
        Alumno alumno = new Alumno("Sebastian", "Reyes", "M", "Regular", "Programación", "Algoritmo", 3.5f);
        Alumno alumno2 = new Alumno("Olimpo", "Thorne", "M", "Regular", "Programación", "Algoritmo", 4);
        Alumno alumno3 = new Alumno("Juan", "Montoya", "M", "Condicional", "Programación", "Algoritmo", 2.9f);
        Gestion.addEstudiante(listaAlumnos, alumno);
        Gestion.addEstudiante(listaAlumnos, alumno2);
        Gestion.addEstudiante(listaAlumnos, alumno3);
        Gestion.imprimirColeccion(listaAlumnos);
        // TODO code application logic here
        Gestion.OrdenarLista(listaAlumnos, new OrdenPorApellido());
        Gestion.OrdenarLista(listaAlumnos, new OrdenPorNombre());
        Gestion.OrdenarLista(listaAlumnos, new OrdenPorNota());
        Gestion.OrdenarLista(listaAlumnos, new OrdenPorNota2());        
    }
    
}
