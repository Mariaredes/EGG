/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ronald
 */


public class ProductoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Integer> tienda = new HashMap();
    
  //crear producto
//    public Producto crear(){
//    Producto p = new Producto();
//    System.out.println("Ingrese el nombre del producto");
//    String raz =leer.next();
//    p.setNombre(nombre);
//    
//    System.out.println("Ingrese el precio del producto");
//    int precio =leer.next();
//    p.setPrecio(precio); //seteo el objeto
//   
//    return p;
//    }
    
//            agregar producto
    
    public void agregar(){
        String op;
        do {
            System.out.println("Desea ingresar un prodcuto? N/S");
            op =leer.next();
            if (op.equalsIgnoreCase("s")) {
                System.out.println("Ingreso de un producto: ");
                //crear();
                //tienda.put(crear().getNombre(), crear().getPrecio());
                System.out.println("ingrese el nombre del producto: ");
                String nombre = leer.next();

                System.out.println("ingrese el precio del producto: ");
                int precio = leer.nextInt();
                
                tienda.put(nombre, precio);
            }else if (op.equalsIgnoreCase("n")){
                break;
            }else{ //Ni S ni N
                System.out.println("Opción invalida");
            }
            
        } while (op.equalsIgnoreCase("n"));  
        
    }
    
//            recorreer el hashMap

    public void modificarPrecio() {

        System.out.println("ingrese el nomnbre del producto que desea modificar");
        String prod = leer.next();
        boolean esta = tienda.containsKey(prod);
        if (esta) {

            for (Map.Entry<String, Integer> entry : tienda.entrySet()) {
                String key = entry.getKey();
                if (key.equals(prod)) {
                    System.out.println("ingrese el nuevo precio del producto");
                    Integer value = leer.nextInt();
                    entry.setValue(value);
                }
            }
        } else {
            System.out.println("producto no encontrado\n");
        }

    }
//            Eliminar
 public void eliminar() {

        System.out.println("ingrese el nombre del producto que desea eliminar");
        String prod = leer.next();

        boolean esta = tienda.containsKey(prod);
        if (esta) {
            tienda.remove(prod);
        }else {
            System.out.println("producto no encontrado\n");
        }
    }

    public void mostrar() {
        System.out.println(" listado de productos disponibles\n");
        for (Map.Entry<String, Integer> entry : tienda.entrySet()) {

            System.out.println(entry.toString());
        }
    }
       
}
