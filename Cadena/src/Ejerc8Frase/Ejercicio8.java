/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejerc8Frase;

import Ejerc8Frase.Servicio.Servicio;
import cadena.entidades.Frase;

/**
 *
 * @author macbookair
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Servicio ls = new Servicio ();
       Frase a = ls.crearFrase();
       int sumadevocales = ls.mostrarVocales(a);
       String invertir = ls.invertirFrase(a);
       
       ls.contiene(a);
    }
    
    
    
        
    }
    
