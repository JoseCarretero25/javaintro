/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc6poo2;

import ejerc6poo2.entidades.Productos;
import ejerc6poo2.servicio.Servicio;

/**
 *
 * @author macbookair
 */
public class Ejerc6poo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Servicio ls = new Servicio();
       Productos x = new Productos();
       ls.Menu(x);
    }
    
}