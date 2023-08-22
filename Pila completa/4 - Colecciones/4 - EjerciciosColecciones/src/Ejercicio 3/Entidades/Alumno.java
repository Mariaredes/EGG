/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author emils
 */
public class Alumno {
    
    private String nombre;
    private Integer documento;
    private Integer nota1;
    private Integer nota2; 
    private Integer nota3; 

    public Alumno() {
    }

    public Alumno(String nombre, Integer documento, Integer nota1, Integer nota2, Integer nota3) {
        this.nombre = nombre;
        this.documento = documento;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getDocumento() {
        return documento;
    }

    public Integer getNota1() {
        return nota1;
    }

    public Integer getNota2() {
        return nota2;
    }

    public Integer getNota3() {
        return nota3;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public void setNota1(Integer nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(Integer nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(Integer nota3) {
        this.nota3 = nota3;
    }

    public static Comparator<Alumno> compararDocumentosAscendente = new Comparator<Alumno>() { // Creamos un objeto comparator 
        @Override // Usamos el override para traer un metodo de otra clase y poder usarlo
        public int compare(Alumno a1, Alumno a2) { // Le pasamos dos objetos a comparar
            return a1.getDocumento().compareTo(a2.getDocumento()); // Los comparamos usando el get y el compareTo
        }
    };

    public static Comparator<Alumno> compararNombresAscendente = new Comparator<Alumno>() { // Creamos un objeto comparator 
        @Override // Usamos el override para traer un metodo de otra clase y poder usarlo
        public int compare(Alumno a1, Alumno a2) { // Le pasamos dos objetos a comparar
            return a1.getNombre().compareTo(a2.getNombre()); // Los comparamos usando el get y el compareTo
        }
    };
    
        @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", documento=" + documento + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + '}';
    }
    
} //class
