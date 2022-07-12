/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc3poo2;

import ejerc3poo2.servicio.Servicio;

/**
 *
 * @author macbookair
 */
public class Ejerc3poo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Servicio ls = new Servicio();
   ls.FabricadeAlumnos(100);
   ls.Iterador();
    }
    
}
