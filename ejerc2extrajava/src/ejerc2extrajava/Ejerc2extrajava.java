/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc2extrajava;

import ejerc2extrajava.entidades.Puntos;
import ejerc2extrajava.servicio.Servicio;

/**
 *
 * @author macbookair
 */
public class Ejerc2extrajava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicio ls = new Servicio ();
        Puntos a = new Puntos();
        ls.crearPuntos();
        ls.distanciaPuntos();
    }
    
}
