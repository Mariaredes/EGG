/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author emils
 */
public class AlumnoService {
    
 Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
 public ArrayList <Alumno> crearAlumno() {
     
     ArrayList<Alumno> lstAlumno = new ArrayList(); // Creamos una lista de tipo Alumno 

        String res = "";
        
        do {

            Alumno a1 = new Alumno(); // Creamos un objeto en cada vuelta para meterlo a nuestra lista

            System.out.println("Ingrese el documento del alumno"); // Pedimos los datos del objeto
            int documento = leer.nextInt();

            System.out.println("Ingrese el nombre del alumno");
            String nombre = leer.next();

            System.out.println("Ingrese la nota 1");
            int nota1 = leer.nextInt();

            System.out.println("Ingrese la nota 2");
            int nota2 = leer.nextInt();
            
            System.out.println("Ingrese la nota 3");
            int nota3 = leer.nextInt();

            
            a1.setDocumento(documento); // Seteamos el documento
            a1.setNombre(nombre); // Seteamos el nombre
            a1.setNota1(nota1);
            a1.setNota2(nota2);
            a1.setNota3(nota3);
            
            // Agregamos el objeto llenado a la lista
            //el nombre y las notas a la lista
            lstAlumno.add(a1); 

            System.out.println("Quiere ingresar otro alumno ?"); // Y preguntamos si quiere ingresar otro alumno 
            res = leer.next();

        } while (res.equalsIgnoreCase("s"));
        
    return lstAlumno;
    
    

 } // crear  
 
  public void mostrarAlumno(ArrayList lstAlumno) {
        
      System.out.println("\nLa lista ingresada:  ");
        
        for (Object aux : lstAlumno) { // Aca los mostramos en un for each

            System.out.println(aux);
            //System.out.println(aux.toString());
        }
 }
        
   public void ordenarAlumno(ArrayList lstAlumno) {
        
        System.out.println("\nLa lista ordenada:  ");
        
        lstAlumno.sort(Alumno.compararDocumentosAscendente); // Los ordenamos por el documento mediante un comparator

        for (Object aux : lstAlumno) { // Aca los mostramos ordenados en un for each 

            System.out.println(aux);

        }
 }       

 public void buscarAlumno(Alumno a1, ArrayList lstAlumno){
  
        // Calcular la nota de final de un alumno        
        // Preguntamos por el alumno que queremos saber su nota final
        
        System.out.println("\nQue estudiante quiere calcular su nota final? "); 
        
        String buscado = leer.next();
        
        boolean encontrado = false;
        
        for (Object aux : lstAlumno) { // Recorremos la lista

        // Validamos si está el alumno que queremos calcular la nota final
        
//        System.out.println(buscado);
//        System.out.println(a1.getNombre());
//        System.out.println(a1.getNota1());
//        System.out.println(a1.getNota2());
//        System.out.println(a1.getNota3());
        
            if (a1.getNombre().equalsIgnoreCase(buscado)) { 
                           
                //double notaFinal = (a1.getNota1()+a1.getNota2()+a1.getNota3())/3;
                //System.out.println(notaFinal);
                
                System.out.println("La nota final de " + buscado + " es " + notaFinal()); 
                
                encontrado = true ;
            }
        }
        
        for (Object aux : lstAlumno) { // Recorremos la lista

           if (!encontrado) {  //Alumno encontrado

                System.out.println("El alumno a calcular promedio no se encuentra en la lista!");
                
            }
        }  
        
 }
 
 public void  notaFinal(Alumno a1, ArrayList lstAlumno, String buscado){
     
  for (Object aux : lstAlumno) {
     
     if (a1.getNombre().equalsIgnoreCase(buscado)) { 
         
          double notaFinal = (a1.getNota1()+a1.getNota2()+a1.getNota3())/3;
          
          System.out.println(aux);
          
     }
  }  
 }
         
       
public void eliminarAlumno(Alumno a1, ArrayList lstAlumno){
    

        Iterator<Alumno> it = lstAlumno.iterator();

        boolean eliminado = false; // Usamos el booleano para mostrar si el alumno se elimino o no

        System.out.println("\nQue estudiante quiere eliminar ? ");
        String nombre = leer.next();

        while (it.hasNext()) {

            if (it.next().getNombre().equalsIgnoreCase(nombre)) {
                it.remove();
                eliminado = true; // Cuando se elimina pasamos el booleano a true
            }
        }
        if (eliminado) {//Elminado
            
            System.out.println("El alumno fue eliminado exitosamente!");


            for (Object aux : lstAlumno) { // Aca los mostramos en un for each

                System.out.println(aux);
            }

        } else {//No eliminado

            System.out.println("El alumno a eliminar no se encuentra en la lista!");

        }
}
    
} // service
