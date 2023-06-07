/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poocoleccionejer06;

import java.util.Scanner;
import Service.ProductoService;

/**
 *
 * @author ronald
 */
public class POOColeccionEjer06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ProductoService serv = new ProductoService();
        System.out.println("Bievenido a la tienda on-line0 ''equipo 16''");
        int op;
        
        do{
        System.out.println("\nmenu ");
        System.out.println("1 - agregar producto");
        System.out.println("2 - modificar precio");
        System.out.println("3 - eliminar producto");
        System.out.println("4 - mostar lista de productos");
        System.out.println("5 - salir");
        
        System.out.println("");
        
         op= read.nextInt();
        switch (op) {
            case 1:
                serv.agregar();
                break;
            case 2:
                serv.modificarPrecio();
                break;
            case 3:
                serv.eliminar();
                break;
            case 4:
                serv.mostrar();
                break;
            case 5:
                System.out.println("Hasta luego!\n");
                break;
            default:
                System.out.println("opcion invalida\n");
        }
        }while(op!=5);
    }
    
}
