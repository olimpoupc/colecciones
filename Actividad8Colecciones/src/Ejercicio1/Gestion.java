/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.*;


/**
 *
 * @author Admin
 */
public class Gestion {
    public static void addEstudiante(List<Alumno> lista, Alumno e) {

        lista.add(e);

    }
    public static void imprimirColeccion(List<Alumno> lista) {
        System.out.println("Lista de empleados: " + lista.size() + " registrados");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %s%n", "Nombre", "Apellido", "Sexo",
                "Condicion", "Asignatura 1", "Asignatura 2", "Nota final");
        System.out.println("------------------------------------------------------------------------------------------");
        for (Alumno e : lista) {
            System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %.2f%n",
                    "" + e.getNombre(),
                    e.getApellido(),
                    e.getSexo(),
                    e.getCondicion(),
                    e.getAsignatura1(),
                    e.getAsignatura2(),
                    e.getNotaFinal());
        }
        System.out.println("------------------------------------------------------------------------------------------\n");
    }
    public static void OrdenarLista(List<Alumno> lista, Comparator orden){
        List<Alumno> listaOrdenada = new ArrayList(lista);
        if(orden==null){
            //Collections.sort(listaOrdenada);
        }
        else{
            Collections.sort(listaOrdenada, orden);
        }
        imprimirColeccion(listaOrdenada);
}
    public static void OrdenarLista(List<Alumno> lista){
        
        OrdenarLista(lista, null);
        
    }
}