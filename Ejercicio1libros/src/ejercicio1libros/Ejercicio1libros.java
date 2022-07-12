/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1libros;

import ejercicio1libros.entidades.libros;
import servicios.LibrosServicio;

/**
 *
 * @author macbookair
 */
public class Ejercicio1libros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LibrosServicio ls = new LibrosServicio();
        libros l1 = ls.altalibros();
        
        System.out.println(l1.toString());
    }
    
}
