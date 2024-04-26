/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poocoleccionejer05;

import Service.PaisesService;

/**
 *
 * @author emils
 */
public class POOColeccionEjer05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


	PaisesService srvPaises = new PaisesService();
		
	srvPaises.guardarPaises();
		
	}
    }
    
