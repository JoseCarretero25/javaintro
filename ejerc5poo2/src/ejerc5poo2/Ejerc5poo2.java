/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc5poo2;

import ejerc5poo2.servicio.Servicio;

/**
 *
 * @author macbookair
 */
public class Ejerc5poo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Servicio ls = new Servicio();
       ls.FabricadePaises(100);
       ls.MostrarPaises();
       ls.Iterator();
       ls.MostrarPaises();
    }
    
}
