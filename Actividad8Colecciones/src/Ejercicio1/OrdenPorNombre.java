/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.Comparator;

/**
 *
 * @author Admin
 */
public class OrdenPorNombre implements Comparator<Alumno>{
    @Override
    public int compare(Alumno t, Alumno t1) {
        return t.getNombre().compareTo(t1.getNombre());
    }
}
