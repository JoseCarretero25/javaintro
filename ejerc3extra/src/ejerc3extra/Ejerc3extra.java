/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc3extra;

import ejerc3extra.entidades.Raices;
import ejerc3extra.servicio.Servicio;

/**
 *
 * @author macbookair
 */
public class Ejerc3extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicio ls = new Servicio ();
        Raices x = ls.IngresarValores();
        ls.getDiscriminante(x);
        ls.tieneRaices(x);
        ls.tieneRaiz(x);
        ls.obtenerRaices(x);
        ls.obtenerRaiz(x);
    }
    
}
