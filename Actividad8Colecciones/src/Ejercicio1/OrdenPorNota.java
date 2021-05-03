package Ejercicio1;

import java.util.Comparator;

public class OrdenPorNota implements Comparator<Alumno> {

    @Override
    public int compare(Alumno t, Alumno t1) {
        if(t.getNotaFinal()>t1.getNotaFinal()){ return 1;}
        else if(t.getNotaFinal()<t1.getNotaFinal()){ return -1;}
        else return 0;
    }
    
    
}
