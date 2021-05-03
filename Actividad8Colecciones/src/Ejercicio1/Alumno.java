/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author Admin
 */
public class Alumno {
    private String nombre, apellido, sexo, condicion, asignatura1, asignatura2;
    private float notaFinal;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, String sexo, String condicion, String asignatura1, String asignatura2, float notaFinal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.condicion = condicion;
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.notaFinal = notaFinal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public String getAsignatura1() {
        return asignatura1;
    }

    public void setAsignatura1(String asignatura1) {
        this.asignatura1 = asignatura1;
    }

    public String getAsignatura2() {
        return asignatura2;
    }

    public void setAsignatura2(String asignatura2) {
        this.asignatura2 = asignatura2;
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
    }
    
}
