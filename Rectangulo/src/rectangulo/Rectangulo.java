/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulo;

import rectangulo.Servicio.Servicio;
import rectangulo.entidades.REntidades;

/**
 *
 * @author macbookair
 */
public class Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicio ls = new Servicio ();
        REntidades a = ls.ingresebase();
        REntidades b = ls.ingresAltura();
        System.out.println("La base ingresada es de : " + (int) a.getBase() + "la altura ingresada es de : " + b.getAltura());
        ls.Superficie();
        ls.Perimetro();
        ls.Dibujo();
    }
    
}
