/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2.circunsferencia;

import CircunsferenciaServicio.Servicio;
import entidades.Circunsferencia;

/**
 *
 * @author macbookair
 */
public class Ejercicio2Circunsferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Servicio ls = new Servicio ();
      Circunsferencia a = ls.creaCircunsferencia();
        System.out.println("el radio es de : " + (int) a.getRadio());
        ls.Area();
        ls.Perimetro();
      
        
        
       
        
        
        
      
    }
    
    
}
