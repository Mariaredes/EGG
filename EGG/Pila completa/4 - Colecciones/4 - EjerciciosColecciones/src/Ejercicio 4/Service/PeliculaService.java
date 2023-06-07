/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Pelicula;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
        

/**
 *
 * @author emils
 */

public class PeliculaService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Pelicula crearPelicula() {
    Pelicula p = new Pelicula(); //creacion del objeto
    
    System.out.println("Ingrese el titulo de la película ");
    p.setTitulo(leer.nextLine());  //seteo pelicula
    //String title = leer.nextLine();
    //p.setTitulo(title);
    System.out.println("Ingrese el nombre del director ");
    p.setDirector(leer.nextLine());  // seteo director
    //String direct = leer.nextLine();
    //p.setDirector(direct);
    System.out.println("Indique la duración de la película en horas ");
    p.setDuracion(leer.nextDouble());   //seteo duracion
    leer.nextLine();
    //double durac = leer.nextDouble();
    //p.setDuracion(durac);
    
    return p;
}
    
     public ArrayList<Pelicula> listaPeliculas() {
         
     ArrayList<Pelicula> peliculas = new ArrayList<>();//crear Array list
     
     String option;
     boolean agreg= false;
     do{
        System.out.println("Desea ingresar una película? S/N");
        option = leer.nextLine();
        switch (option){
            case "s":
                peliculas.add(crearPelicula());
                agreg= true;
                break;
            case "n":
                agreg= false;
                break;
            default:
                System.out.println(option);   
                System.out.println("opcion invalida");
                agreg= true;
                break;
        }
     }while (agreg);
     return peliculas;
     }

     public void mostrar(ArrayList peliculas) {
         
          System.out.println("las peliculas incluidas son");
          for (Object pelicula : peliculas) {
             System.out.println(pelicula.toString());
         }   
     }
    
     public void mayorHora(ArrayList peliculas) {
         
          System.out.println("las peliculas con duración mayor a una hora son: ");
          ArrayList largas = new ArrayList();
          for (int i = 0; i < peliculas.size(); i++) {
             Pelicula p1 = (Pelicula) peliculas.get(i);
             if (p1.getDuracion()>1){
                 largas.add(p1);
             }
          } 
          for (Object larga : largas) {
             System.out.println(larga); 
          }  
     }

     
          public void ordenarPorDuracionAsc(ArrayList peliculas){
              
          System.out.println("las peliculas ordenadas por duracion de mayor a menor: ");
          Collections.sort(peliculas, Comparadores.ordenPorDuracionAscendente);
          for (Object pelicula : peliculas) {
             System.out.println(pelicula.toString());
         }   
     }
          public void ordenarPorDuracionDesc(ArrayList peliculas){
              
          System.out.println("las peliculas ordenadas por duracion de menor a mayor: ");
          Collections.sort(peliculas, Comparadores.ordenPorDuracionDescendente);
          for (Object pelicula : peliculas) {
             System.out.println(pelicula.toString());
         }   
     }
          
          public void ordenaDirector(ArrayList peliculas){
              
          System.out.println("las peliculas ordenadas por directores: ");
          Collections.sort(peliculas, Comparadores.ordenPorDirector);
          for (Object pelicula : peliculas) {
             System.out.println(pelicula.toString());
         }   
     }
     
     
}//class