/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package pooejercoleccion01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author emils
 */
public class POOEjerColeccion01 {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ArrayList <String> perros = new ArrayList();
        
        //String raza;
        String res  = "";
        
        do {
            System.out.println("Ingrese una raza de perro: ");
            String raza = leer.next();

            perros.add(raza);
            

            System.out.println("Quiere ingresar otra raza ? S/N");
            res = leer.next();

            
              } while (res.equalsIgnoreCase("S"));
          
            
// San Bernardo , Pitbull, Doberman

    System.out.println("\nLas razas ingresadas son: " + perros.size()+"\n");
    System.out.println("Las razas de perro son: ");
   // System.out.println("Las razas de perro son: " + perros+"\n");
    
//Recorremos la lista con un for each   
            for (String perro : perros) {
                System.out.println(perro);
            }

    }//main
    
}//class
