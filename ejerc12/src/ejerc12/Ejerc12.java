/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc12;

import ejerc12.entidades.Persona;
import ejerc12.servicio.Servicio;

/**
 *
 * @author macbookair
 */
public class Ejerc12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicio ls = new Servicio();
        Persona a = new Persona();
        ls.crearPersona();
        
        ls.compararEdades();
    }
    
}
