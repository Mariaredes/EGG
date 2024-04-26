/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author khate
 */
public class PaisesService {
    
Scanner leer = new Scanner(System.in);

TreeSet<String> paises = new TreeSet<>();
	
public void guardarPaises() {
		
String opc, nombre;
		
do {			
        System.out.println("Ingrese el nombre de un país\n");
        nombre = leer.nextLine().toUpperCase();
        paises.add(nombre);
        
    do {           	
            System.out.println("¿Continuar ingresando? (S/N)");
            opc = leer.nextLine().toUpperCase();
                
               if (opc.equals("N") || opc.equals("S")) {
                    break;
               }
                
            } while (true);
            
        } while (opc.equals("S"));
		
		mostrarPaises();
		eliminarPaises();
		
	}
	
	public void mostrarPaises() {
            
            System.out.println("");
            for (String pais : paises) {
                    System.out.println(pais);
                    
            System.out.println("");
		}		
	}
	
	public void eliminarPaises() {
		
            System.out.println("Ingrese el nombre de un pais a eliminar: ");
            String nombre = leer.nextLine().toUpperCase();

            paises.remove(nombre);
            
            System.out.println("Se ha removido pais!");

            mostrarPaises();
		
	}
	 
}
