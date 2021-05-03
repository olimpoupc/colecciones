package Ejercicio1;

import java.util.Comparator;

public class OrdenPorApellido implements Comparator<Alumno> {

    @Override
    public int compare(Alumno t, Alumno t1) {
        return t.getApellido().compareTo(t1.getApellido());
    }
    
}
