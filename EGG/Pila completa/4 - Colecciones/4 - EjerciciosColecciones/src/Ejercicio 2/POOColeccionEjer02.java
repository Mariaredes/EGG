/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poocoleccionejer02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author emils
 */
public class POOColeccionEjer02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
// Creamos una lista de Strings

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ArrayList <String> perros = new ArrayList();
        
        String raza;
        String res  = "";
        String quit  = "";
        
        do {
            System.out.println("Ingrese una raza de perro: ");
            raza = leer.next();

            perros.add(raza);
            

            System.out.println("Quiere ingresar otra raza ? S/N");
            res = leer.next();

            
              } while (res.equalsIgnoreCase("S"));
                    
// Ejemplos de raza: San Bernardo , Pitbull, Doberman

    System.out.println("===================================");
    System.out.println("\nLas razas ingresadas son: " + perros.size()+"\n");
    System.out.println("Las razas de perro son: ");
    
// Mostramos la lista con un for each    

            for (String perro : perros) {
                System.out.println(perro);
            }
            
//Ordenamos la lista de manera ascendente y mostramos

    System.out.println("===================================");
    System.out.println("Las razas de perro ordenadas son: ");
        
    Collections.sort(perros);
        
            for (String perro : perros) {
                System.out.println(perro);
            }
            
// Usamos el iterator para remover un elemento porque con el for each falla

        System.out.println("\nElija una raza de perro: ");
        quit = leer.next();
        
        boolean esta = false;
        
        Iterator<String> it = perros.iterator();
        
        while (it.hasNext()){
            if (it.next().equals(quit)){ //buscamos el elemento en la lista
                it.remove(); //Si lo encuentra Eliminamos el elemento

                
                System.out.println("\nSe remueve exitosamente!");
                esta = true;
            }
            else esta = false;  
        }
        if(!esta){ //Si no lo encuentra no lo elimina
            System.out.println("\nLa raza no esta en la lista");
        }
             
// Usamos el iterator para mostrar luego de eliminado 

        it = perros.iterator();
        
    System.out.println("===================================");    
    System.out.println("\nLas razas que quedan son: "  );
            
        while (it.hasNext()) {
            System.out.println(it.next());
        }
            
    }//main
    
}//class
