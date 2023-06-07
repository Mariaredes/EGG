/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poocoleccionejer04;

import java.util.ArrayList;
import Service.PeliculaService;
import java.util.Collections;

/**
 *
 * @author emils
 */
public class POOColeccionEjer04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PeliculaService serv = new PeliculaService();//llamo al service
        
        ArrayList lista = serv.listaPeliculas();
        
        serv.mayorHora(lista);
        System.out.println("-------------------------------------------------");
        serv.mostrar(lista);
        System.out.println("-------------------------------------------------");
        serv.ordenarPorDuracionAsc(lista);
        System.out.println("-------------------------------------------------");
        serv.ordenarPorDuracionDesc(lista);
        System.out.println("-------------------------------------------------");
        serv.ordenaDirector(lista);
        System.out.println("-------------------------------------------------");
        //serv.ordenaTitulo(lista); 
    
    }
    
}
