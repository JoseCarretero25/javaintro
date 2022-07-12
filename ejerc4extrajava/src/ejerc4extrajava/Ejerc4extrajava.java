/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc4extrajava;

import ejerc4extrajava.entidades.NIF;
import ejerc4extrajava.servicio.Servicio;

/**
 *
 * @author macbookair
 */
public class Ejerc4extrajava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicio ls = new Servicio();
        NIF a = ls.crearNif();
        ls.mostrar(a);
        
    }
    
}
