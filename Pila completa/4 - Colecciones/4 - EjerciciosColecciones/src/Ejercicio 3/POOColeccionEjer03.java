/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poocoleccionejer03;

import Entidades.Alumno;
import Service.AlumnoService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author emils
 */
public class POOColeccionEjer03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        AlumnoService serv = new AlumnoService(); //service
        
        ArrayList <Alumno> lista = serv.crearAlumno(); //lista
        Alumno a1 = new Alumno();// objeto
        
        serv.mostrarAlumno(lista);
        serv.ordenarAlumno(lista);
        serv.buscarAlumno(a1, lista);
        serv.eliminarAlumno(a1, lista);

 
     
                
    } //main
  
}//class
